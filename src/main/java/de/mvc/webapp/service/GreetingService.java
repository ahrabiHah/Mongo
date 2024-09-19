package de.mvc.webapp.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingService implements IGreetingService {



    @Override
    public String generate(String s) {

        LocalTime time = LocalTime.now();

        int h = time.getHour();
        if (h<12){
            return("Good Morning "+ s);
        }else if (h<16){
            return("Good Evening "+ s);
        }
        else if (h<20){
            return("Good night"+ s);
        }else {
            return("Sleep" + s);
        }

    }
}
