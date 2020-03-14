package academy.learnprogramming.todolist.model;


import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//used to simulate in memory database
public class ToDoData {

    //== fields ==
    private static int idValue = 1;
    public final List<ToDoItem> items = new ArrayList<>();

    //== constructor ==
    public ToDoData() {
        // add dummy data
        addItem(new ToDoItem("First","First Detials", LocalDate.now()));
        addItem(new ToDoItem("Second","Second Detials", LocalDate.now()));
        addItem(new ToDoItem("Third","Third Detials", LocalDate.now()));

    }

    //== public methods ==
    public List<ToDoItem> getItem() {
        return Collections.unmodifiableList(items);
    }


    public void addItem(@NonNull ToDoItem toAdd){
        items.add(toAdd);
        idValue ++;
    }

    public void removeItem(int id){
        ListIterator<ToDoItem> itemIterator = items.listIterator();
        while (itemIterator.hasNext()){
            ToDoItem item = itemIterator.next();
            if (item.getId() == id){
                itemIterator.remove();
                break;
            }
        }
    }

    public ToDoItem getItem(int id){
        for(ToDoItem item : items){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull ToDoItem toUpdate){
        ListIterator<ToDoItem> itemIterator = items.listIterator();
        while (itemIterator.hasNext()){
            ToDoItem item = itemIterator.next();

            if (item.equals(toUpdate)){
                itemIterator.set(toUpdate);
                break;
            }
        }
    }
}
