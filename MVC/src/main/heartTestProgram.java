package main;

import abstracts.ControllerInterface;
import controllers.HeartController;
import models.HeartModel;

public class heartTestProgram {
    public static void main(String[] args){
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
