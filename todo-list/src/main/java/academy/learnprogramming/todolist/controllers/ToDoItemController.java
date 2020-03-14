package academy.learnprogramming.todolist.controllers;

import academy.learnprogramming.todolist.model.ToDoData;
import academy.learnprogramming.todolist.util.Mappings;
import academy.learnprogramming.todolist.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {

    @ModelAttribute
    public ToDoData toDoData(){
        return new ToDoData();
    }
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
