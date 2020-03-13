package academy.learnprogramming.todolist.controllers;
import academy.learnprogramming.todolist.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


/*
So when we access the welcome page it always displayed the message hallo Ahmed although but the idea now is to display a message
based on a request parameter the request parameter is actually a query parameter or form data although in this case.
To get the query parameter we can use the Requestparam annotation.
So let's add a parameter to our method. the parameter will be annotated with requestparam the parameter type will be string
and the name will be user we can then use this parameter to get hello message from the service in other words we can
send this parameter the value of it to hat method.


so when we use the request parameter anotation a parameter is required otherwise
we'll get errors. So the request program annotation has some properties such as
required which we can use to mark a parameter as optional because the default is required now the name of the
request parameter will be taken from the parameter name which in our case we've defined on line 39 as user now if you
 */

@Controller
public class IndexController {
    //== fields ==
    private final DemoService demoService;

    //== constructors ==
    @Autowired
    public IndexController(DemoService demoService) {
        this.demoService = demoService;
    }

    //== Request methods ==
    @GetMapping("/hello")
    public String index(@RequestParam String user, @RequestParam int age ,Model model){

        model.addAttribute("helloMessage",demoService.getHelloMessage(user));
        model.addAttribute("age",age);
        return "index";
    }
    // == Model Attributes ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        return demoService.getWelcomeMessage();

    }




}
