package main;

import abstracts.IIterator;
import abstracts.IMenu;
import abstracts.MenuComponent;
import models.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    IMenu pancakeHouseMenu;
    IMenu dinerMenu;
    IMenu cafeMenu;

    ArrayList menus;

    MenuComponent mainMenu;

    public Waitress(ArrayList menus,IMenu pancakeHouseMenu, IMenu dinerMenu, IMenu cafeMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
        this.menus = menus;
    }

    public Waitress(MenuComponent mainMenu){
        this.mainMenu = mainMenu;
    }

    public void printMainMenu(){
        mainMenu.print();
    }

    public void printMenu(){
      /*  var pancakeIterator = pancakeHouseMenu.createIterator();
        var dingerIterator = dinerMenu.createIterator();
        var cafeIterator = cafeMenu.createIterator();
        System.out.println("Menu\n ---- \n BreakFast");

        printMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        printMenu(dingerIterator);

        System.out.println("\nDinner");
        printMenu(cafeIterator);
*/

        Iterator menuIterator = menus.iterator();

        while (menuIterator.hasNext()){
            var menu = (IMenu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            var menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu(){
        Iterator iterator  = mainMenu.createIterator();

        System.out.println("\nVegeteian menu\n----");

        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();

            try{
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }
            catch (UnsupportedOperationException e){

            }
        }
    }
}
