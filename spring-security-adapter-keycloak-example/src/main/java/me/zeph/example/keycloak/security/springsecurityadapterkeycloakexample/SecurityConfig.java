package me.zeph.example.keycloak.security.springsecurityadapterkeycloakexample;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.KeycloakDeployment;
import org.keycloak.adapters.KeycloakDeploymentBuilder;
import org.keycloak.adapters.spi.HttpFacade;
import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.authentication.session.NullAuthenticatedSessionStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

import java.io.InputStream;

@KeycloakConfiguration
public class SecurityConfig extends KeycloakWebSecurityConfigurerAdapter {
  /**
   * Registers the KeycloakAuthenticationProvider with the authentication manager.
   */
  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(keycloakAuthenticationProvider());
  }

  @Bean
  @Override
  protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
    return new NullAuthenticatedSessionStrategy();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    super.configure(http);
    http
        .authorizeRequests()
        .antMatchers("/public*").permitAll()
        .antMatchers("/private*").hasRole("USER")
        .anyRequest().permitAll();
  }

  /**
   * Overrides default keycloak config resolver behaviour (/WEB-INF/keycloak.json) by a simple mechanism.
   * <p>
   * This example loads other-keycloak.json when the parameter use.other is set to true, e.g.:
   * {@code ./gradlew bootRun -Duse.other=true}
   *
   * @return keycloak config resolver
   */
  @Bean
  public KeycloakConfigResolver keycloakConfigResolver() {
    return new KeycloakConfigResolver() {

      private KeycloakDeployment keycloakDeployment;

      @Override
      public KeycloakDeployment resolve(HttpFacade.Request facade) {
        if (keycloakDeployment != null) {
          return keycloakDeployment;
        }

        String path = "/keycloak.json";
        InputStream configInputStream = getClass().getResourceAsStream(path);

        if (configInputStream == null) {
          throw new RuntimeException("Could not load Keycloak deployment info: " + path);
        } else {
          keycloakDeployment = KeycloakDeploymentBuilder.build(configInputStream);
        }

        return keycloakDeployment;
      }
    };
  }
}
