package com.wissen.parkwise.controller;

import com.wissen.parkwise.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping
    public void doLogin(@RequestBody User user) {
    }

}
