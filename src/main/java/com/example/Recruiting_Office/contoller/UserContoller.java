package com.example.Recruiting_Office.contoller;


import com.example.Recruiting_Office.model.Entities.User;
import com.example.Recruiting_Office.model.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "user")
public class UserContoller {

    private UserService userService;


    @Autowired
    public UserContoller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List <User> getUsers() {
       return userService.getUsers();
    }
    @GetMapping(path = "{userId}")
    public Optional<User> getUsers(@PathVariable(name = "userId") Integer userId) {
        return userService.getUser(userId);
    }
    @PostMapping(path = "add")
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }

    @GetMapping(path = "login")
    public String checkLogin(@RequestParam (name = "name") String name ,
                             @RequestParam (name = "password") String password ) {
        return userService.getCheck(name,password);

    }

    @DeleteMapping(path = "delete/{userId}")
    public void deleteUser(@PathVariable ("userId") Integer userId){
        userService.deleteUser(userId);
    }
}