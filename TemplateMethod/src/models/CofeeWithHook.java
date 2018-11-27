package models;

import abstracts.CaffeineBeverageWithHook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CofeeWithHook extends CaffeineBeverageWithHook {
    protected void brew(){
        System.out.println("Dripping Cofee through filter");
    }

    protected void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected boolean customerWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like milk  and sugar with cofee (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        }
        catch (Exception ex){
            System.err.println(ex);
        }
        if (answer == null){
            return "no";
        }

        return answer;
    }
}
