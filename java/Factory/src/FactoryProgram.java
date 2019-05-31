import Abstract.Pizza;

public class FactoryProgram {

    /*
    factory method pattern defines interface for creating object but allows
    subclasses choose class the created instance will have.
    Thus, factory method delegates to sublclasses operation of creating instances (Engrish)
    * */
    public static void main(String[] args){

        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("Cheese");
        System.out.println("Ahri ordered a " + pizza.getName() + "\n");
    }
}
