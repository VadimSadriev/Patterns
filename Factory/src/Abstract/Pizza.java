package Abstract;

import java.util.ArrayList;

public abstract class Pizza {

   public String name;
   public Dough dough;
   public Sauce sauce;
   public Cheese cheese;
   public ArrayList toppings = new ArrayList();

   public abstract void  prepare();

    public void bake(){
        System.out.println("Baking for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public  String getName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
}
