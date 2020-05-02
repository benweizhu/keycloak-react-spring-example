package me.zeph.example.keycloak.security.springsecurityadapterkeycloakexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @GetMapping(value = "/public")
  public ResponseEntity publicApi() {
    return new ResponseEntity("This is public api", HttpStatus.OK);
  }

  @GetMapping(value = "/private")
  public ResponseEntity privateApi() {
    return new ResponseEntity("This is private api", HttpStatus.OK);
  }

}
