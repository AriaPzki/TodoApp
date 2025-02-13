package com.in28minutes.springboot.todowebapp.login;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

//    private AuthenticationService authentication = new AuthenticationService();
//
//    public LoginController(AuthenticationService authentication) {
//        super();
//        this.authentication = authentication;
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToWelcomePage(ModelMap model) {
        model.addAttribute("name" , getLoggedInUsername());
        return "welcome"; // this calls the login.jsp
    }

    private String getLoggedInUsername(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

//    @RequestMapping(value = "login", method = RequestMethod.POST)
//    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//        model.put("name", name);
//        boolean isValid = authentication.authenticateUser(name, password);
//        if(!isValid){
//            model.put("errorMessage" , "Invalid Credentials! please try again.");
//        }
//        return isValid ? "welcome" : "login"; // this calls the login.jsp
//    }
}
