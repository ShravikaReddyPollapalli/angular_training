package com.stackroute.authservice.AuthControllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login/{user}")
    public ResponseEntity<String> authenticateUser(@PathVariable String user){
        return new ResponseEntity<String>("Hi, " + user + "i have verifyed you and here is your access_token" + "asdiasdiu.asjkdkhaksd.aksjdhkjashkd", HttpStatus.OK);
    }
}
