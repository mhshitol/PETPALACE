package com.PetPalace.controller;

import ch.qos.logback.core.model.Model;
import com.PetPalace.Model.User;
import com.PetPalace.Repu.Userdataresp;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CodeController {
    @Autowired
    private Userdataresp userdataresp;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUserDataToDBMS(@ModelAttribute User user,Model model){
        //System.out.println("yobxbb");

        userdataresp.save(user);
        return "redirect:/petpalace";
    }
    @RequestMapping("/petpalace")
    public String homepage(){
        return "Homepage.html";
    }
    @RequestMapping("/cat")
    public String cat(){
        return "Cat.html";
    }
    @RequestMapping("/dog")
    public String dog(){return "Dog.html";
    }

    @RequestMapping("/signup")
    public String signup(){return "signup.html";
    }

    @RequestMapping("/buyPets")
    public String buy(){return "buy.html";
    }
}
