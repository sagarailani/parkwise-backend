package com.wissen.parkwise.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/configuration/{configurationId}/registration")
public class RegisteredVehicleController {

    @GetMapping
    public void getAllRegistered(@PathVariable int configurationId) {
    }

    @GetMapping("/number/{number}")
    public void getVehicleByNumber(@PathVariable int configurationId, @PathVariable int number) {
    }

    /**
     * Have to update RequestBody;
     * Make a vehicle object or not?
     * @param configurationId
     */
    @PostMapping
    public void addNewRegistration(@PathVariable int configurationId) {
    }

}


