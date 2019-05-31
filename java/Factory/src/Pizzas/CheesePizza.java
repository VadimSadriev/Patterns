package Pizzas;
import Abstract.Pizza;
import Abstract.PizzaIngreientFactory;

public class CheesePizza  extends Pizza  {

    PizzaIngreientFactory ingredientFactory;

    public CheesePizza(PizzaIngreientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
      System.out.println("Preparing" + name);
      dough = ingredientFactory.createDough();
      sauce = ingredientFactory.createSauce();
      cheese = ingredientFactory.createCheese();
    }


}
