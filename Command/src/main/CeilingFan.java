package main;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public  CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public  void setHigh(){
        speed = HIGH;
        System.out.println(location + " ceiling is on HIGH SPEED");
    }

    public void setMedium(){
        speed = MEDIUM;
        System.out.println(location + " ceiling is on MEDIUM SPEED");
    }

    public void setLow(){
        speed = LOW;
        System.out.println(location + " ceiling is on LOW SPEED");
    }

    public void setOff(){
        speed = OFF;
        System.out.println(location + " ceiling is OFF");
    }

    public int getSpeed(){
        return speed;
    }
}
