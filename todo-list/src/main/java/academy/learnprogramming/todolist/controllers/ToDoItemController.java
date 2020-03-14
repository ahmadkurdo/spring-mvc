package academy.learnprogramming.todolist.controllers;

import academy.learnprogramming.todolist.model.ToDoData;
import academy.learnprogramming.todolist.model.ToDoItem;
import academy.learnprogramming.todolist.service.ToDoItemService;
import academy.learnprogramming.todolist.util.Mappings;
import academy.learnprogramming.todolist.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {
    //== fields ==
    private final ToDoItemService toDoItemService;

    //== constructors ==
    @Autowired
    public ToDoItemController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    @ModelAttribute
    public ToDoData toDoData(){
        return toDoItemService.getData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
