package com.example.controller;

import com.example.entity.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userController")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("getEntityById/{id}")
    public Object getEntityById(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        return userService.selectById(user);
    }


}
