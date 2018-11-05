import Abstract.PizzaIngreientFactory;
import Abstract.Cheese;
import Abstract.Dough;
import Abstract.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngreientFactory {

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }
}
