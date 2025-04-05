package com.tp;

import org.springframework.stereotype.Component;

@Component
public class SalutationAmicale  implements SalutationInterface{
    @Override
    public String saluer() {
        return "bonjour amicale";
    }
}