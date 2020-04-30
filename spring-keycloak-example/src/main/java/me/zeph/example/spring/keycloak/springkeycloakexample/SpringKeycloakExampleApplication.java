package me.zeph.example.spring.keycloak.springkeycloakexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class SpringKeycloakExampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringKeycloakExampleApplication.class, args);
  }

}
