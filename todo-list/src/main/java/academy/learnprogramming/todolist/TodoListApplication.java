package academy.learnprogramming.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

We are going to start by setting up a web application plugins we're going to begin by adding the maven War plugin so what
actually is the maven war plug-in and actually what is a war file well war which stands for web application archive
is a file format similar to jar the Java archive file the difference is that war
files contain the resources necessary for our developing web applications

The WAR Plugin is responsible for collecting all artifact dependencies,
classes and resources of the web application and packaging them into a web application archive.


 */

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);

	}

}
