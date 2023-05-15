package guru.springframework.spring6dependencyinjection.controllers;

import guru.springframework.spring6dependencyinjection.services.GreetingService;
import guru.springframework.spring6dependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {

        System.out.printf("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
