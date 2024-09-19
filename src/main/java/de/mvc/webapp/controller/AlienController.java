package de.mvc.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "c1")
public class AlienController {


    @GetMapping(value = "/telusko")
    //@RequestMapping(value = "/telusko",method= RequestMethod.GET)

    public String getSomeInfo(Model model){
        System.out.println("Model is implemted by " + model.getClass().getName());

        model.addAttribute("alien","Welcome back Aliens ! my name is Hesham and in this video we will learn MVC");

        return "focus";

    }

}
