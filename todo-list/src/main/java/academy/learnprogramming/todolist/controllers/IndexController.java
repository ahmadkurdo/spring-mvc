package academy.learnprogramming.todolist.controllers;

import academy.learnprogramming.todolist.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String index(Model model){

        model.addAttribute("helloMessage",demoService.getHelloMessage("Ahmed"));
        return "index";
    }
    // == Model Attributes ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        return demoService.getWelcomeMessage();

    }




}
