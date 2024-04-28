package parsa.springframework.spring6di.controllers.i18n;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import parsa.springframework.spring6di.services.GreetingService;

/**
 * The Myi18NController class is a controller class responsible for handling i18n (internationalization)
 * functionality. It uses a GreetingService to generate a greeting message in different languages.
 */
@Controller
public class Myi18NController {
    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
