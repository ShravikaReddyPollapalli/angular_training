package com.stackroute.restaurantservice.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/api/v1")
public class RestaurantsController {


    @GetMapping("/restaurants")
    public ResponseEntity<String> getAllRestaurants() {
        return new ResponseEntity<String>("This is your list of restaurants", HttpStatus.OK);
    }
}
