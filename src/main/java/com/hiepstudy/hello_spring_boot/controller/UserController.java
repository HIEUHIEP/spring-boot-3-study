package com.hiepstudy.hello_spring_boot.controller;

import com.hiepstudy.hello_spring_boot.dto.request.UserCreationRequest;
import com.hiepstudy.hello_spring_boot.dto.request.UserUpdateRequest;
import com.hiepstudy.hello_spring_boot.entity.User;
import com.hiepstudy.hello_spring_boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createRequest(request);

    }

    @GetMapping()
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable String userId){
        return userService.getUser(userId);

    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);

    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "User has been deleted.";
    }
}
