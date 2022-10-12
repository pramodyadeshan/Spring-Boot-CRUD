package com.SpringBoot.SpringBoot.controller;

import com.SpringBoot.SpringBoot.dto.UserDTO;
import com.SpringBoot.SpringBoot.entity.User;
import com.SpringBoot.SpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    //Find all data
    @GetMapping("/getUser")
    public List<UserDTO> getUser()
    {
        return userService.getAllUsers();
    }

    //Save Data
    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO)
    {
        return userService.saveUser(userDTO);
    }

    //Update Data
    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO)
    {
        return userService.saveUser(userDTO);
    }
    //Delete Data
    @DeleteMapping("/deleteUser")
    public Boolean deleteUser(@RequestBody UserDTO userDTO)
    {
        return userService.deleteUser(userDTO);
    }

}
