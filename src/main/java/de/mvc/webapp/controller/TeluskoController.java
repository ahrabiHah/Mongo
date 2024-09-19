package de.mvc.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "c2")
public class TeluskoController {


    @GetMapping( "/telusko")
    public ModelAndView hello(){
        ModelAndView m = new ModelAndView();
        m.addObject("welcome","Hello welcome to telusko Learning !");

        m.setViewName("index");
        return m;
    }




}
