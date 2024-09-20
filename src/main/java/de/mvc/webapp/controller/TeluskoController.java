package de.mvc.webapp.controller;

import de.mvc.webapp.model.Vehicle;
import de.mvc.webapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class TeluskoController {

    @Autowired
    private IGreetingService greetingService;




    @GetMapping( "/telusko")
    public ModelAndView hello(){
        ModelAndView m = new ModelAndView();
        m.addObject("welcome","Hello welcome to telusko Learning !");

        m.setViewName("index");
        return m;
    }
    @GetMapping(value = "/telusko1")
    public String response1(Model model){
        model.addAttribute("home","Welcome Ali to Telsku Academy");
        return "home";
    }
    @GetMapping(value = "/telusko2")
    public String response2(Model model){
        model.addAttribute("home1","Welcome Hesham to Telsku Academy");
        return "home";
    }

    @GetMapping(value = "/telusko3")
    public String response3(Map<String,Object> map){
        map.put("focus","Welcome third  to Telsku Academy");

        return "hah";
    }

    @GetMapping("/wish")
    public void sd(Model model){
        String res= greetingService.generate("Hesahm");
        model.addAttribute("res",res);
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model){
        // Add a new 'vehicle' object to the model for the form to bind to
        model.addAttribute("vehicle", new Vehicle());
        return "register"; // The JSP or HTML file where the form is located
    }
    @PostMapping("/register")
    public String register(Model model, @ModelAttribute("vehicle")Vehicle vehicle){
        //public String register(Model model, Vehicle vehicle){

        System.out.println(vehicle);
        model.addAttribute("vehicle",vehicle);
        return "response";
    }

}
