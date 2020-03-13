package academy.learnprogramming.todolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
/*
request method welcome which doesn't have any parameters request method
support different types of parameters and those parameters can have different annotations.
one such parameter type is model and we're now going to define that in our method.


alright so this parameter we've added model will be created by the dispatcher servlet and then we'll get to it as a
parameter. Now you can view the model as a key value pair or a map there's also a
method to convert a model to a map know the model is created by the dispatcher
server and as I mentioned before it invokes our request methods once we get
model as a parameter we can then add attributes to the model and then those
attributes are available in the view

in general our model represents data that will be passed from a controller method to the view as well as data passed from the view back to the controller method


we're using add
 */


    @GetMapping("/hello")
    public String index(Model model){
        /*
        we're adding a key value pair to the model because every attribute
        has a name and a value now for the attribute
        we'll just added the name as user and the value in my case is ahmed
         */
        model.addAttribute("user","Ahmed");
        return "index";
    }

    /*
    that's one way to add an attribute to a model all right so now let's check out
    another way of adding attributes to a model by using the  the model
    attribute annotation so by using the annotation model attribute we can
    automatically add some attributes to a model as well as retrieve them from a
    model by annotating parameters
     */
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        return "Welcome to this demo application";

    }
}
