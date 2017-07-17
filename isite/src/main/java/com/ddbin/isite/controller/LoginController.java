package com.ddbin.isite.controller;

import com.ddbin.isite.entity.User;
import com.ddbin.isite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    //private static Logger log = Logger.getLogger(LoginController.class);
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login")
    public ModelAndView login(HttpSession session, String username, String password) {
        ModelAndView mv = new ModelAndView();
        List<String> errMsgList = new ArrayList<String>();

        //判断是否填写用户名和密码
        if (null == username || "".equals(username)) {
            errMsgList.add("请填写用户名");
        } else if (null == password || "".equals(password)) {
            errMsgList.add("请填写密码");
        }

        //如果ｌｉｓｔ不为空，返回登录页面
        if (errMsgList.size() > 0) {
            mv.addObject("errMsgList", errMsgList);
            mv.setViewName("login");
            return mv;
        } else {
            List<User> users = userService.findByUsernameAndPassword(username, password);
            if (null == users) {
                errMsgList.add("用户名或密码不正确");
                mv.addObject("errMsgList", errMsgList);
                mv.setViewName("login");
                return mv;
            } else {
                //将用户名设置到会话里
                session.setAttribute("userName", users.get(0).getUsername());
                //跳转到主页面
                mv.setViewName("main");
                return mv;
            }

        }

    }

}
