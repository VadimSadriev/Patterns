package main;

import abstracts.BeatModelInterface;
import abstracts.ControllerInterface;
import controllers.BeatController;
import models.BeatModel;

public class MvcProgram {
    public static void main(String[] args){
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
