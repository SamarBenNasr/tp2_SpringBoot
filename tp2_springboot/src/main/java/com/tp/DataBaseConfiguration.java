package com.tp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix ="database")
public class DataBaseConfiguration {
    private String url;
    private String userName;
    public String getUrl() {return url;}
    public String getUserName() {return userName;}
    public void setUrl(String url) {this.url = url;}
    public void setUserName(String userName) {this.userName = userName;}
}
