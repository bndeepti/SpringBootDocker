package com.springboot.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GreetingService {

    public Map getGreetingMessage(){
        Map response = new HashMap();
        response.put("message", "Hello World from Spring Boot!");
        return response;
    }

}