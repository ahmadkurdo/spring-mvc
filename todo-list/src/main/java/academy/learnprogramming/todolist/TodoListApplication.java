package academy.learnprogramming.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

lets discuss what our model is as well as the @ModelAttribute annotation firstly though
let's discuss what the model interfaces, so the model interface defines a holder
for model attributes and is as such primarily designed for adding attributes
to the model now that model is exposed o the view which means that we can
access the attributes in our html





 */

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);

	}

}
