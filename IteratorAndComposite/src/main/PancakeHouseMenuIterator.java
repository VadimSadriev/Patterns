package main;

import abstracts.IIterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements IIterator {

    ArrayList items;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList items){
        this.items = items;
    }

    public boolean hasNext(){
       try{
        return items.get(position) != null;
       }
       catch (Exception ex){
           return false;
       }

    }

    public Object next(){
        var item = items.get(position);
        position++;
        return item;
    }
}
