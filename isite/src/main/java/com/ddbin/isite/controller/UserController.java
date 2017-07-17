package com.ddbin.isite.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ddbin.isite.entity.User;
import com.ddbin.isite.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/init")
    @ResponseBody
    public User saveUser() {
        log.warn("访问--------------------" + UserController.class.getResource("/"));
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        this.userService.saveUser(user);
        return user;
    }

    @RequestMapping("/get")
    @ResponseBody
    public List<User> getUsers() {
        log.warn("访问--------------------" + UserController.class.getResource("/"));
        List<User> list = this.userService.findAll();
        return list;
    }


}
