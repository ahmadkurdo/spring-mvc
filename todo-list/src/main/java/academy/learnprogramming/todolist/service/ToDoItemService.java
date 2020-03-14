package academy.learnprogramming.todolist.service;

import academy.learnprogramming.todolist.model.ToDoData;
import academy.learnprogramming.todolist.model.ToDoItem;

public interface ToDoItemService {

    void addItem(ToDoItem toAdd);
    void removeItem(int id);
    ToDoItem getItem(int id);
    void UpdateItem(ToDoItem toUpdate);
    ToDoData getData();
}
