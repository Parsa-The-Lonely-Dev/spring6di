package parsa.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyControllerTest {

    @Autowired
    MyController myController;

    @Test
    void sayHello() {
        System.out.println(myController.sayHello());
        System.out.println("Hello Everyone From Base Service!!!");
    }
}