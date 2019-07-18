package com.wissen.parkwise.controller;

import com.wissen.parkwise.model.PremiseConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/premise/{premiseId}/configuration")
public class PremiseConfigurationController {

    @GetMapping(value = "/{configurationId}")
    public void getConfiguration(@PathVariable int premiseId, @PathVariable int configurationId) {

    }

    @GetMapping
    public void getAllConfigurations(@PathVariable int premiseId) {
    }

    @GetMapping(value = "/slot")
    public void getSlotCount(@PathVariable int premiseId) {

    }

    @PostMapping
    public void addNewPremiseConfiguration(@PathVariable int premiseId, @RequestBody PremiseConfiguration premiseConfiguration) {
    }

    @PatchMapping(value = "/{configurationId}")
    public void updatePremiseConfiguration(@PathVariable int premiseId, @PathVariable int configurationId) {
    }

}
