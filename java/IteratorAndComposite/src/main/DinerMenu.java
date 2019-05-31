package main;

import abstracts.IIterator;
import abstracts.IMenu;
import models.MenuItem;

import java.util.Iterator;

public class DinerMenu implements IMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegeterian BLT", "(Fakin') Bacon with lettuce % tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce ^ tomato on whole wheat", false, 4.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full! cant add more items to menu");
        }
        else {
            menuItems[numberOfItems] = new MenuItem(name,description,vegetarian,price);
            numberOfItems++;
        }
    }

   /* public MenuItem[] getMenuItems(){
        return menuItems;
    }*/

  /* public IIterator createIterator(){
       return new DinerMenuIterator(menuItems);
   }*/
  public Iterator createIterator(){
      return new DinerMenuIterator(menuItems);
  }
}
