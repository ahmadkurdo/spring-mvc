package academy.learnprogramming.todolist.service;

import academy.learnprogramming.todolist.model.ToDoData;
import academy.learnprogramming.todolist.model.ToDoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {

    //== Fields ==
    @Getter
    private final ToDoData data = new ToDoData();

    //== Public Methods
    @Override
    public void addItem(ToDoItem toAdd) {
        data.addItem(toAdd);

    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);

    }

    @Override
    public ToDoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void UpdateItem(ToDoItem toUpdate) {
        data.updateItem(toUpdate);

    }


}
