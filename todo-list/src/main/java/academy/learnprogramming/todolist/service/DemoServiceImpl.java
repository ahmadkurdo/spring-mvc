package academy.learnprogramming.todolist.service;

import org.springframework.stereotype.Service;
/*

@Service is another stereotype annotation. The Service annotation is similar in that it's a stereotype,
but this time for the Service layer. Now the Service annotation will be scanned by Spring,
just like the controller and component annotations. Typically the Service layer of an application
holds the business logic as in it performs calculations with data and so on or processes data.
Controllers will use the Service to get some data or to get the result of a calculation.
Now in our case, we'll be getting messages from the DemoService meaning our service's logic
is retrieving messages for us.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome To this Demo application.";
    }
}
