package com.tp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private SalutationInterface salutation1;
    @Autowired
    @Qualifier(value = "salutationAmicale")
    private SalutationInterface amicale;

    @RequestMapping("/hello")
    public String helloWorld() {
        return salutation1.saluer();
    }
    @RequestMapping("/helloamical")
    public String helloAmicale() {
        return amicale.saluer();
    }
}
