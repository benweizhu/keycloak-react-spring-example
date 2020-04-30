package me.zeph.example.spring.keycloak.springkeycloakexample.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
  @GetMapping("/whoami")
  public String whoami(@AuthenticationPrincipal(expression = "name") String name) {
    return name;
  }
}