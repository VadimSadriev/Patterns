package models;

import abstracts.BPMObserver;
import abstracts.BeatModelInterface;
import abstracts.BeatObserver;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.Iterator;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer; //rhythm generator
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    int bmp = 90;
    Sequence sequence;
    Track track;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    public void setUpMidi(){
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void buildTrackAndStart(){
        int[] trackList = {35,0,46,0};
        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192,9,1,0,4));

        try {
            sequencer.setSequence(sequence);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void makeTracks(int[] list){
        for (int i = 0; i < list.length; i++){
            int key = list[i];

            if (key != 0){
                track.add(makeEvent(144,9,key,100,i));
                track.add(makeEvent(144,9,key,100,i+1));

            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return event;
    }


    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
        notifyBPMObservers();
    }

    private void notifyBPMObservers(){
        Iterator iterator = bpmObservers.iterator();

        while (iterator.hasNext()){
            var item = (BPMObserver)iterator.next();
            item.updateBPM();
        }
    }

    private void notifyBeatObservers(){
        Iterator iterator = bpmObservers.iterator();

        while (iterator.hasNext()){
            var item = (BeatObserver)iterator.next();
            item.updateBeat();
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        var bpmObserverIndex = bpmObservers.indexOf(o);
        if (bpmObserverIndex > -1){
            bpmObservers.remove(bpmObserverIndex);
        }
    }

    @Override
    public void removeObserver(BeatObserver o) {
        var beatObserverIndex = beatObservers.indexOf(o);
        if (beatObserverIndex > -1){
            bpmObservers.remove(beatObserverIndex);
        }
    }

    @Override
    public void setBPM(int bmp) {
        this.bmp = bmp;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }
    @Override
    public int getBPM() {
        return bmp;
    }

    public void meta(MetaMessage message){
        if (message.getType() == 47){
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    public void beatEvent(){
        notifyBeatObservers();
    }

}
