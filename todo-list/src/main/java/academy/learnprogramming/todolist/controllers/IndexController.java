package academy.learnprogramming.todolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
/*
so now that on this line here on line nine now that we've defined that
when we open the application URL with the slash hello path appended to the
end the HTTP GET request will be mapped to the method we've just created and
this method will be invoked.
 */

/*
@ResponseBody indicates that a method returned values should be bound to the web
response body which in our case means that the bitch which you can see returning on
will be written to the responsebody which the browser will then display. Other wise trying will think that you are trying to
return a view.
 */

    @ResponseBody
    @GetMapping("/hello")
    public String index(){
        return "index";
    }
}
