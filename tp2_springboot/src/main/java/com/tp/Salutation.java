package com.tp;

import org.springframework.stereotype.Component;

public class Salutation extends SalutationBase{
    public String saluer() {
        return "Bonjour "+compteur++;
    }
}
