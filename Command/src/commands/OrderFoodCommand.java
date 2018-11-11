package commands;

import interfaces.ICommand;
import main.Food;

public class OrderFoodCommand implements ICommand {
    Food food;

    public  OrderFoodCommand(Food food){
        this.food = food;
    }

    @Override
    public void execute(){
        food.order();
    }

    @Override
    public void undo(){
        food.cancerOrder();
    }
}
