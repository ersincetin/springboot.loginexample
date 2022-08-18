package com.springboot.loginexampla.springboot.restApi;

import com.springboot.loginexampla.springboot.Business.IUserService;
import com.springboot.loginexampla.springboot.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users")
    public List<User> getUsers() {
        return userService.getAll();
    }

    @RequestMapping(value = "/user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getById(id);
    }
}
