package com.wissen.parkwise.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/configuration/{configurationId}")
public class VehicleController {

    @PostMapping(value = "/entry/number")
    public void makeEntry(@PathVariable int configurationId) {
    }

    @GetMapping(value = "/entry/detail/number/{number}")
    public void getEntryDetails(@PathVariable int configurationId, @PathVariable int number) {
    }

    @PatchMapping(value = "/exit/number/{number}")
    public void makeExit(@PathVariable int configurationId, @PathVariable int number) {
    }

}
