package parsa.springframework.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import parsa.springframework.spring6di.controllers.MyController;

/**
 * The Spring6diApplication class is the main entry point of the application.
 * It starts the Spring Boot application and retrieves an instance of the MyController class
 * from the Spring application context using dependency injection.
 */
@SpringBootApplication
public class Spring6diApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =SpringApplication.run(Spring6diApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }

}
