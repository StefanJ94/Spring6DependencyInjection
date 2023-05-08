package guru.springframework.spring6dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {

        System.out.printf("I'm in the controller");

        return "Hello everyone!";
    }
}
