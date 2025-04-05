package com.tp;

import org.springframework.stereotype.Component;

@Component(value = "salutation1")
public class Salutation implements SalutationInterface{
    @Override
    public String saluer() {
        return "Bonjour";
    }
}
