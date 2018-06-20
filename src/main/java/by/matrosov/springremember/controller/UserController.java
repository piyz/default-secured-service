package by.matrosov.springremember.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class UserController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model, Principal principal){
        model.addAttribute("hi", "You are logged in as " + principal.getName());
        return "hello";
    }

    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/hello/admin", method = RequestMethod.GET)
    public String admin(){
        return "admin";
    }
}
