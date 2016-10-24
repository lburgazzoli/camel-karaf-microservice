package com.github.lburgazzoli.camel.karaf.microservice;

public class MyBean {
    private final String dataCenter;
    private final String body;

    public MyBean(String dataCenter, String body) {
        this.dataCenter = dataCenter;
        this.body = body;
    }

    public String getDataCenter() {    
        return dataCenter;    
    }

    public String getBody() {    
        return body;    
    }
}