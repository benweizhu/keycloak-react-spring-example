https://medium.com/@bcarunmail/securing-rest-api-using-keycloak-and-spring-oauth2-6ddf3a1efcc2

## What you need to config for resource server
https://docs.spring.io/spring-security-oauth2-boot/docs/current/reference/htmlsingle/#boot-features-security-oauth2-resource-server

https://projects.spring.io/spring-security-oauth/docs/oauth2.html#jwt-tokens

## jwks
http://localhost:8080/auth/realms/KEYCLOAK_REALM_EXAMPLE/.well-known/openid-configuration
https://stackoverflow.com/questions/28658735/what-are-keycloaks-oauth2-openid-connect-endpoints
http://localhost:8080/auth/realms/KEYCLOAK_REALM_EXAMPLE/protocol/openid-connect/certs

## How token is parsed?
DefaultAccessTokenConverter.extractAuthentication

https://www.oauth.com/oauth2-servers/access-tokens/

# Oauth2 Application Properties
https://docs.spring.io/spring-security-oauth2-boot/docs/current/reference/html/common-application-properties.html

# The Authorization Process of keycloak to protect a resource

https://www.keycloak.org/docs/latest/authorization_services/#the-authorization-process

There you can enable any registered client application as a resource server and start managing the resources and scopes you want to protect.