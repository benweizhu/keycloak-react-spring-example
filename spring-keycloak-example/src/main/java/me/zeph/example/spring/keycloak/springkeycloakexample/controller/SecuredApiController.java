package me.zeph.example.spring.keycloak.springkeycloakexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredApiController {
  @GetMapping(value = "/secured-api")
  public ResponseEntity securedApi() {
    return new ResponseEntity("A secured api", HttpStatus.OK);
  }
}
