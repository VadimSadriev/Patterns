package main;

import abstracts.IMenu;
import models.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements IMenu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu(){
        addItem("Vegeterian BLT", "(Fakin') Bacon with lettuce % tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce ^ tomato on whole wheat", false, 4.99);
    }

    public void addItem(String name, String desctiption, boolean vegeterian, double price){
        menuItems.put(name, new MenuItem(name, desctiption,vegeterian,price));
    }



    @Override
    public Iterator createIterator() {
       return menuItems.values().iterator();
    }
}
