package com.akhmzv.addpp.controller;

import com.akhmzv.addpp.entity.User;
import com.akhmzv.addpp.service.UserService;
import com.akhmzv.addpp.service.dto.UserDto;
import com.akhmzv.addpp.service.converter.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController  {

    private final UserService userService;
    private final UserConverter userConverter;

    public UserController(@Autowired UserService userService,
                          @Autowired UserConverter userConverter) {
        this.userConverter = userConverter;
        this.userService = userService;
    }


    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody UserDto userDto) {
        User user = userConverter.toEntity(userDto);

        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return new ResponseEntity<String>("Пользователь успешно удален", HttpStatus.OK);

    }
}