import Abstract.Pizza;
import Abstract.PizzaIngreientFactory;
import Pizzas.CheesePizza;
import Pizzas.NyStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {


    @Override
   public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngreientFactory ingreientFactory = new NYPizzaIngredientFactory();

        if (type.equals("Cheese")){
            pizza = new CheesePizza(ingreientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else
            return null;

        return pizza;
    }
}
