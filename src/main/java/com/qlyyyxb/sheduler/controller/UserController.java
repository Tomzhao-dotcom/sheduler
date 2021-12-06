package com.qlyyyxb.sheduler.controller;

import com.qlyyyxb.sheduler.entity.UserEntity;
import com.qlyyyxb.sheduler.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("user")
    public String list(Model model) {
        List<UserEntity> userEntityList = userService.findAll();
        model.addAttribute("userEntityList", userEntityList);
        return "user";
    }
}
