package jsh.project.sns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoginController{

    @GetMapping(value="/login")
    public String getMethodName() {
        return "login";
    }

}