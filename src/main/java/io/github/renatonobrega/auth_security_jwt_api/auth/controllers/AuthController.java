package io.github.renatonobrega.auth_security_jwt_api.auth.controllers;

import io.github.renatonobrega.auth_security_jwt_api.auth.service.AuthorizationService;
import io.github.renatonobrega.auth_security_jwt_api.user.dtos.AuthenticationDto;
import io.github.renatonobrega.auth_security_jwt_api.user.dtos.RegisterDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    @Autowired
    AuthorizationService authorizationService;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Valid AuthenticationDto authenticationDto) {
        return authorizationService.login(authenticationDto);
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterDto registerDto) {
        return authorizationService.register(registerDto);
    }
}
