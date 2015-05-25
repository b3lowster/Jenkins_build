package com.max.controller;

import com.max.dao.UserService;
import com.max.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/user")
public class SpringRestController {

    @Autowired
	UserService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers="Accept=application/json")
	public User getUser(@PathVariable int id) {
        return service.getUserById(id);
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<User> getAllUsers(){
        return service.getAllUsers();
	}

    @RequestMapping(method = RequestMethod.PUT, headers = "Content-Type=application/json")
    public User createUser(@RequestBody User user) {
        System.out.println(user.toString() + "\n end");
        return user;
    }
}