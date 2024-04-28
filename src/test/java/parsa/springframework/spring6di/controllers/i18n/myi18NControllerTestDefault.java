package parsa.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class myi18NControllerTestDefault {
    @Autowired
    Myi18NController myi18NController;
    @Test
    public void sayHello() {
        System.out.println(myi18NController.sayHello());
    }
}
