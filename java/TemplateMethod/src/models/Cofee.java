package models;

import abstracts.CaffeineBeverage;

public class Cofee extends CaffeineBeverage {

    protected void brew(){
        System.out.println("Dripping Cofee through filter");
    }

    protected void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
}
