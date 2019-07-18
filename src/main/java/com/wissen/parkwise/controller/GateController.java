package com.wissen.parkwise.controller;

import com.wissen.parkwise.model.Gate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/premise/{premiseId}/gate")
public class GateController {

    @GetMapping(value = "/{gateId}")
    public void getGateInformation(@PathVariable int premiseId, @PathVariable int gateId) {
    }

    @PostMapping
    public ResponseEntity<Gate> addNewGate(@PathVariable int premiseId, @RequestBody Gate gate) {
        return null;
    }

}
