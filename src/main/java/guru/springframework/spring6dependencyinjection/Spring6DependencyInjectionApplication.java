package guru.springframework.spring6dependencyinjection;

import guru.springframework.spring6dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DependencyInjectionApplication {

    public static void main(String[] args) {

       ApplicationContext ctx =  SpringApplication.run(Spring6DependencyInjectionApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }

}
