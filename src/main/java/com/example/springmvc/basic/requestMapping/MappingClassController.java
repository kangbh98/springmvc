package com.example.springmvc.basic.requestMapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping")
public class MappingClassController {
    @GetMapping("/users")
    public String user() {
        return "get user";
    }
    @PostMapping("/users")
    public String addUser(){
        return "post user";
    }

    @GetMapping("/users/{userId}")
    public String findUser(@PathVariable String userId){
        return "get user Id=" + userId;
    }

    @PatchMapping("/users/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update user Id=" + userId;
    }
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete user Id=" + userId;
    }
}
