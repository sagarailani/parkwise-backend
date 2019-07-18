package com.wissen.parkwise.controller;

import com.wissen.parkwise.model.Premise;
import com.wissen.parkwise.model.User;
import com.wissen.parkwise.service.PremiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/client/{clientId}/premise")
public class PremiseController {

    @Autowired
    private PremiseService premiseService;

    @GetMapping(value = "/{premiseId}")
    public void getPremiseInformation(@PathVariable int clientId, @PathVariable int premiseId) {
    }

    @PostMapping
    public void addNewPremise(@PathVariable int clientId, @RequestBody Premise premise) {
    }

    @PostMapping(value = "/{premiseId}/manager")
    public ResponseEntity<User> addNewManager(@PathVariable int clientId, @PathVariable int premiseId, @RequestBody User user) {
        return new ResponseEntity<>(premiseService.createNewManager(user), HttpStatus.CREATED);
    }

    @PostMapping(value = "/{premiseId}/gateworker")
    public void addNewGateWorker(@PathVariable int clientId, @PathVariable int premiseId, @RequestBody User user) {
    }
}
