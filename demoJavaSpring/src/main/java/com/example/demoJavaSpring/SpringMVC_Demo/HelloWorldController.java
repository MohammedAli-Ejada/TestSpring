package com.example.demoJavaSpring.SpringMVC_Demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = "/welcome1" , method = RequestMethod.GET)
    public String SayHello(ModelMap model){
        model.addAttribute("welcome","Welcome from Spring MVC");
        return "welcome";
    }

    @RequestMapping(value = "/welcome2" , method = RequestMethod.GET)
    public String SayHello2(ModelMap model){
        model.addAttribute("welcome","Welcome from Spring MVC2");
        return "welcome";
    }
}
