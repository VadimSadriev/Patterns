package main;

import abstracts.IIcon;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class VirtualDeputyProgram {
    Image imageComponent;

    public static void main(String[] args){
        try {
            VirtualDeputyProgram virtual = new VirtualDeputyProgram();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public VirtualDeputyProgram() throws Exception{
      // IIcon icon = ImageProxy(new URL());
    }
}
