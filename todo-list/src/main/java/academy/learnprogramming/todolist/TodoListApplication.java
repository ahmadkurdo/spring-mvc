package academy.learnprogramming.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

As mentioned earlier the spring MVC, Model View controller, is designed around the dispatcher servlet which plays the
role of a front controller. So in other words it receives all the requests for your application. We can map requests to
methods in classes annotated with the @controller annotation then these classes
are known unsurprisingly has annotated controllers or controller classes now
the spring MVC provides an annotation based programming model where the controller and rest controller
components use annotations to express things like request mappings request
import exception handling and more

The @RequestMapping annotation is used map requests to controller methods.
It has various attributes to match by URL, HTTP protocol, request parameters, headers
and media types what we'll do is use specific shortcut variants of the
request mapping annotation.

Shortcut variants of @RequestMapping are:
- @GetMapping(For mapping HTTP get Requests)
- @PostMapping(For mapping HTTP post Requests)
- @PutMapping(For mapping HTTP put Requests)
- @DeleteMapping(For mapping HTTP delete Requests)
- @PatchMapping(For mapping HTTP patch Requests)


 */

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);

	}

}
