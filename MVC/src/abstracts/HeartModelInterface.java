package abstracts;

public interface HeartModelInterface {
    int getHeartRate();
    public void registerObserver(BeatObserver o);
    public void removeObserver(BeatObserver o);
    public void registerObserver(BPMObserver o);
    public void removeObserver(BPMObserver o);
}
