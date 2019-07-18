package com.wissen.parkwise.controller;

import com.wissen.parkwise.model.Pricing;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/configuration/{configurationId}/pricing")
public class PricingController {

    @GetMapping(value = "/{pricingId}")
    public void getPricing(@PathVariable int configurationId, @PathVariable int pricingId) {
    }

    @PostMapping
    public void addNewPricing(@PathVariable int configurationId, @RequestBody Pricing pricing) {
    }

    @PatchMapping(value = "/{pricingId}")
    public void updatePricing(@PathVariable int configurationId, @PathVariable int pricingId, @RequestBody Pricing pricing) {
    }

}
