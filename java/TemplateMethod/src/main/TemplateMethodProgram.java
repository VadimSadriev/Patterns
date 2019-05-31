package main;
import models.*;

public class TemplateMethodProgram {

/*Sets the algorithm's skeleton in the method, leaving the definition of the implementation of some steps to subclasses.
 Subclasses can override some parts of the algorithm without changing its structure.*/
    public static void main(String[] args){
        Tea myTea = new Tea();

        myTea.prepareRecipe();


        CofeeWithHook cofeeHook = new CofeeWithHook();

        System.out.println("Making cofee");
        cofeeHook.prepareRecipe();
    }
}
