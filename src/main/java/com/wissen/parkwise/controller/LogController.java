package com.wissen.parkwise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/record")
public class LogController {

    @GetMapping
    public void queryData(@RequestParam String filter) {
    }

    @GetMapping("/user")
    public void findGateWorker(@RequestParam String filter) {
    }

}
