package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthorController {
    @GetMapping("/login")
        public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("/login");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/dologin")
    public ModelAndView dologin(@ModelAttribute User user){
        if (user.getUsername().equals("thai") && user.getPassword().equals("1801")){
            ModelAndView modelAndView = new ModelAndView("/success");
            modelAndView.addObject("user",user);
            return modelAndView;
        } else
        return new ModelAndView("/error");
    }
}
