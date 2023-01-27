package nithya.java.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("MyController.sayHello");
        return "Hi Everyone!";
    }
}
