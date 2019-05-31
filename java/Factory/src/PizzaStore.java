import Abstract.Pizza;

public abstract class PizzaStore {

    public PizzaStore(){
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        if (pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

   protected abstract Pizza createPizza(String type);
}
