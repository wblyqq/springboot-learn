package com.springboot.demo3.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.test")
public class MydataSource {
    private String url;

    private String userName;
    private int password;
    @Value("hello")
    private String hello;
    @Value("ttttt")
    private String ttttt;


    public String getTtttt() {
        return ttttt;
    }
    public void setTtttt(String ttttt) {
        this.ttttt = ttttt;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }



}
