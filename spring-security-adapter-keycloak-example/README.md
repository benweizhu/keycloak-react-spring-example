### Naming Security Roles

https://www.keycloak.org/docs/latest/securing_apps/index.html#naming-security-roles

For Spring Security, when using role-based authentication, requires that role names start with ROLE_. For example, an administrator role must be declared in Keycloak as ROLE_ADMIN or similar, not simply ADMIN in Keycloak.

### keycloak.json

**https://www.keycloak.org/docs/latest/securing_apps/index.html#java-adapters**

When specifiy the **resource**, it will verify the audience.

When **use-resource-role-mappings** set to false, it will use Realm Role for role grant.

When **use-resource-role-mappings** set to true, the adapter will look inside the token for application level role mappings for the user.

