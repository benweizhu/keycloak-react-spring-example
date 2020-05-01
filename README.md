# keycloak-react-spring-example

```
docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:9.0.3
```

Follow the tuturial to setup keycloak REALM

You may define your own naming.

Client Root Url http://localhost:3000/

Client Valid Redirect URIs http://localhost:3000/*

Web Origins *

Realm setting page can set User registration etc.

Can support internationalization on reaml setting

Theme https://www.keycloak.org/docs/latest/server_development/#_themes

Keycloak cluster??????
https://www.keycloak.org/2019/04/keycloak-cluster-setup.html

https://hub.helm.sh/charts/codecentric/keycloak

### RBAC

https://www.keycloak.org/docs/4.8/authorization_services/#_policy_rbac


### authorization-code-grant-type

https://developer.okta.com/blog/2018/04/10/oauth-authorization-code-grant-type

### keycloak default clients within a realm

https://lists.jboss.org/pipermail/keycloak-user/2016-April/005731.html

### Audience(relate to the scope)
For secure the access in the services

https://www.keycloak.org/docs/latest/server_admin/index.html#_audience

This protocol mapper will check all the clients for which current token(user) has at least one client role available. Then the client ID of each of those clients will be added as an audience automatically. 

Create a API client, and add role in client, assign the role to user, then the token will contain clientId as the audience.


References:
1.https://www.keycloak.org/getting-started/getting-started-docker

2.https://github.com/manfredsteyer/angular-oauth2-oidc/issues/484

3.https://stackoverflow.com/questions/45352880/keycloak-invalid-parameter-redirect-uri?rq=1