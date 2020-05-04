# keycloak-react-spring-example

### How to simply setup a keycloak server

https://www.keycloak.org/getting-started/getting-started-docker

```
docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:9.0.3
```

Follow the tuturial to setup keycloak REALM

You may define your own naming.

Client Root Url http://localhost:3000

Client Valid Redirect URIs http://localhost:3000/*

Web Origins http://localhost:3000

Realm setting page can set User registration etc.

Can support internationalization on reaml setting

Theme https://www.keycloak.org/docs/latest/server_development/#_themes

### Keycloak cluster
https://www.keycloak.org/2019/04/keycloak-cluster-setup.html

https://hub.helm.sh/charts/codecentric/keycloak

### Authorization Services(RBAC etc)

https://www.keycloak.org/docs/latest/authorization_services/

### authorization-code-grant-type

https://developer.okta.com/blog/2018/04/10/oauth-authorization-code-grant-type

### What does keycloak default clients within a realm do?

https://lists.jboss.org/pipermail/keycloak-user/2016-April/005731.html

### Scope

If you define a client with pulic access type, you will see client scope tab.

There are default client scope email, profile, roles, web-orgins.

Each of them has a protocal mapper, which will will do transform on token and documents.

For example, profile will get the user profile information and put into token in certern format mapping logic.

Roles scope mappper will to realm and applicaiton roles mapping.

You can define scope and role relationship, which can group a set of scope into a role. If user has this role, user will has this scope and protocal mapper.

What is the meaning of scope in oauth2?

https://security.stackexchange.com/questions/17506/what-is-the-benefit-of-the-scope-in-oauth2

### Audience

https://www.keycloak.org/docs/latest/server_admin/index.html#_audience

Audience mean: Who are this token for?

If you want to specify the audience in token. For resources server, you need to create another client to represent the resources server.

This protocol mapper will check all the clients for which current token(user) has at least one client role available. Then the client ID of each of those clients will be added as an audience automatically. 

Create a API client, and add role in client, assign the role to user, then the token will contain clientId as the audience.

Client role been assign to user will automately add client id as audience to the token.

### What is a client?
```
Clients are trusted browser apps and web services in a realm. These clients can request a login. You can also define client specific roles.
```

### Roles

There are three different roles: realm roles, client roles and composite role

https://www.keycloak.org/docs/latest/server_admin/index.html#roles

### Different java adapter

https://www.keycloak.org/docs/latest/securing_apps/#java-adapters

https://www.keycloak.org/docs/latest/securing_apps/index.html#_java_adapter_config

keycloak.json

https://medium.com/@bcarunmail/securing-rest-api-using-keycloak-and-spring-oauth2-6ddf3a1efcc2

### How to user matadata or user custom claims to token?

https://www.keycloak.org/docs/latest/server_admin/index.html#_protocol-mappers

## References:
1.https://www.keycloak.org/getting-started/getting-started-docker

2.https://github.com/manfredsteyer/angular-oauth2-oidc/issues/484

3.https://stackoverflow.com/questions/45352880/keycloak-invalid-parameter-redirect-uri?rq=1