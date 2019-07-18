package com.wissen.parkwise.controller;

import com.wissen.parkwise.model.Pass;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/configuration/{configurationId}/pass")
public class PassController {

    @PostMapping
    public void createNewPass(@PathVariable int configurationId, @RequestBody Pass pass) {
    }

    @PatchMapping(value = "/number/{number}")
    public void updatePass(@PathVariable int configurationId, @PathVariable int number, @RequestBody Pass pass) {
    }

    @GetMapping(value = "/number/{number}")
    public void getPassDetails(@PathVariable int configurationId, @PathVariable int number) {
    }
}
