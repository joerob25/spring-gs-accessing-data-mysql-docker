package io.vosy.gsaccessingdatamysqldocker.service;

import io.vosy.gsaccessingdatamysqldocker.model.User;
import io.vosy.gsaccessingdatamysqldocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserService {

    @Autowired
    private UserRepository repository;

    @PostMapping(path = "/add/user")
    public User addNewUser(@RequestParam String name,
                           @RequestParam String email) {
        return repository.save(User.builder()
                        .name(name)
                        .email(email)
                .build());
    }

    @GetMapping(path = "/get/users")
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }
}
