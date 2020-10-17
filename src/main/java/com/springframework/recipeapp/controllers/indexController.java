package com.springframework.recipeapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class indexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("asdasdasdasdaadadasda");
        return "index";
    }
}
