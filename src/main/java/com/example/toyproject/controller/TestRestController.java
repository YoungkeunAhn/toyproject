package com.example.toyproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping(value = "/testValue", method = RequestMethod.GET)
    public String getTestValue(){
        String TestValue = "RestController Test";
        return TestValue;
    }
}
