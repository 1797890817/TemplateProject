package com.ddbin.eflow.center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by deepin on 17-8-11.
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(path = {"/login"},method = {RequestMethod.GET})
    public String login(){
        return "login";
    }

    @RequestMapping(path = {"/login"},method = {RequestMethod.POST})
    public String login_Post(HttpSession session, String userName, String passWord){
        session.setAttribute("username",userName);
        session.setAttribute("password",passWord);

        return "index";
    }

}
