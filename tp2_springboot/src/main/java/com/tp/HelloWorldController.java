package com.tp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {

    @Autowired
    private Salutation salutation;
    @Autowired
    private SalutationAmicale salutationAmicale;

    @RequestMapping(value = "/hello")
    public String helloWorld1() {
        return salutation.saluer();
    }

    @RequestMapping(value = "/helloamical")
    public String helloAmicale1() {
        return salutationAmicale.saluer();
    }
}
