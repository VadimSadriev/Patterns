package main;

public class Stereo {
    int volume;

    public void on(){
        System.out.println("The stereo is on!");
    }

    public void setCD(){
        System.out.println("CD has been set");
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void off(){
        System.out.println("The stereo is off!");
    }
}
