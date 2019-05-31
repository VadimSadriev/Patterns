package main;

import abstracts.IIterator;
import abstracts.IMenu;
import models.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements IMenu {

    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancake with hscrabled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 3.99);
    }

    public void addItem(String name, String description, boolean vegeterian, double price){
        menuItems.add(new MenuItem(name, description,vegeterian,price));
    }

   /* public ArrayList getMenuItems(){
        return menuItems;
    }*/

  /* public IIterator createIterator(){
       return new PancakeHouseMenuIterator(menuItems);
   }*/

  public Iterator createIterator(){
      return menuItems.iterator();
  }
}
