## Naming Security Roles

**https://www.keycloak.org/docs/latest/securing_apps/index.html#naming-security-roles**

Spring Security, when using role-based authentication, requires that role names start with ROLE_. For example, an administrator role must be declared in Keycloak as ROLE_ADMIN or similar, not simply ADMIN.


**https://www.keycloak.org/docs/latest/securing_apps/index.html#java-adapters**

When use-resource-role-mappings to false

Realm Role(For has role assertion)

Client Role(For audience verification)

When use-resource-role-mappings to true

The adapter will look inside the token for application level role mappings for the user.

