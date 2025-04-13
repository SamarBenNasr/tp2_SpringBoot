package com.tp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

public class SalutationAmicale extends SalutationBase implements InitializingBean , DisposableBean {
    private DataBaseConfiguration dataBaseConfiguration ;

    public SalutationAmicale(DataBaseConfiguration dataBaseConfiguration) {this.dataBaseConfiguration = dataBaseConfiguration;}

    @Override
    public String saluer() {

        return "bonjour amical ..."+compteur+" "+dataBaseConfiguration.getUrl()+" "+dataBaseConfiguration.getUserName();
    }
    @Override
    public void afterPropertiesSet() throws Exception {System.out.println("after property set");}
    @Override
    public void destroy()throws Exception{System.out.println("destroy");}
    @PostConstruct
    private void postconstruct (){System.out.println("post construct");}
    @PreDestroy
    private void predestroy (){System.out.println("predestroy");}
}