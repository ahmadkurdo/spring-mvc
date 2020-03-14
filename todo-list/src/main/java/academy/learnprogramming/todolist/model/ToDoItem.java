package academy.learnprogramming.todolist.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data // generates getters, setters, hashcode, to string, using projectlombok
@EqualsAndHashCode(of="id")
public class ToDoItem {
    // == private fields ==
    private int id;
    private String title;
    private String detials;
    private LocalDate deadLine;

    //== constructor ==
    public ToDoItem(String title, String detials, LocalDate deadLine) {
        this.title = title;
        this.detials = detials;
        this.deadLine = deadLine;
    }

}
