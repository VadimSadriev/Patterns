package main;

import abstracts.MenuComponent;
import models.Menu;
import models.MenuItem;

import java.util.ArrayList;

/*Iterator - provides a mechanism for sequential enumeration of collection elements
 without disclosing its internal representation.*/
//------

//Combines objects into wooden structures to represent a part / whole hierarchy.
//     The Composite allows the client to perform homogeneous operations on individual objects and their aggregates.
public class IteratorAndCompositeProgram {
    public static void main(String[] args){
        var pancakeHouseMenu = new PancakeHouseMenu();

        var dinerMenu = new DinerMenu();

        var cafeMenu = new CafeMenu();

        var menus = new ArrayList();
        menus.add(dinerMenu);
        menus.add(pancakeHouseMenu);
        menus.add(cafeMenu);

        var waitress = new Waitress(menus,pancakeHouseMenu,dinerMenu, cafeMenu);

       // waitress.printMenu();


        //with composite

        var pancakeHouseMenu2 = new Menu("Pankcake House menu", "breakfast");

        MenuComponent dinerMenu2 = new Menu("diner menu", "lunch");
        MenuComponent cafeMenu2 = new Menu("Cafe menu", "dinner");

        MenuComponent dessertMenu = new Menu("DessertMenu", "Dessert of course");

        MenuComponent mainMenu = new Menu("Main menu", "all menues combined");

        mainMenu.add(pancakeHouseMenu2);
        mainMenu.add(dinerMenu2);
        mainMenu.add(cafeMenu2);

        dinerMenu2.add(new MenuItem("Pasta", "Spagettig with marinana sauce", true, 3.9));

        dinerMenu2.add(dessertMenu);

        var waitress2 = new Waitress(mainMenu);

       // waitress2.printMainMenu();
       waitress2.printVegetarianMenu();

    }
}
