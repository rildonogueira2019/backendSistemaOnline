package com.online.controller;

import com.online.model.entity.Login;
import com.online.repository.LoginUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/login")
@CrossOrigin("http://localhost:4200")
public class LoginController {
    private final LoginUsersRepository loginUsersRepository;

    @Autowired
    public LoginController(LoginUsersRepository UsersRepository) {
        this.loginUsersRepository = UsersRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Login salvarLoginUser(@RequestBody @Valid Login login ) {
        return loginUsersRepository.save(login);
    }

}
