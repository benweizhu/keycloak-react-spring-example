package me.zeph.example.spring.keycloak.springkeycloakexample.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
  @GetMapping("/whoami")
  public String whoami() {
    SecurityContextHolder.getContext();
    return "";
  }
}