package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long i){
        User user=userService.queryUserById(i);
        return user;
    }
    @GetMapping("/del/{ids}")
    @ResponseBody
    public void deleteUserById(@PathVariable("ids") Long i){
        userService.deleteUserById(i);
    }
    @GetMapping("/list")
    public String queryAllUser(Model model){
        List<User> user = userService.queryAllUser();
        model.addAttribute("users",user);
        return "item";
    }

}
