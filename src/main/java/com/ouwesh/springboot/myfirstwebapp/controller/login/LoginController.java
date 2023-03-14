package com.ouwesh.springboot.myfirstwebapp.controller.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String goTologinPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String goToWelcome(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {
        if (authenticationService.authenticate(name, password)) {
            modelMap.put("name", name);
            return "welcome";
        }

        modelMap.put("errorMsg", "Invalid Credentials");
        return "login";
    }
}
