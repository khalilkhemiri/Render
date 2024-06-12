package com.example.audit.controllers;

import com.example.audit.Repositories.UserRepository;
import com.example.audit.models.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserRepository repo;
    Userr user;
    @PostMapping("/login")
    public ResponseEntity<Userr> loginUser(@RequestBody Userr userData) {
        System.out.println(userData);
        System.out.println(userData.getEmail());
        System.out.println(userData.getId());

        Userr user = repo.findByEmail(userData.getEmail());
        if (user != null && user.getMotdepasse().equals(userData.getMotdepasse())) {
            return ResponseEntity.ok(user);


        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }


}