package main;

import Facades.HomeTheaterFacade;
import models.*;

/*Provides a unified interface to a group of subsystem interfaces.
 The facade defines a high-level interface that simplifies work with the subsystem.*/
public class FacadeProgram {

    public static void main(String[] args){
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper()
        );

        homeTheater.watchMovie("MiddleEarth");

        homeTheater.endMovie();
    }
}
