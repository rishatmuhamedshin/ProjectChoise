package com.kiudiplom.projectchoise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {


    @GetMapping("/home")
    public String homePageViewer(){
        return "HOME";
    }

    @GetMapping("/delivery")
    public String deliveryPage(){
        return "Delivery";
    }

}
