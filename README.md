# EVALUACION M5

Para probar:

ingresar con usuarios:

user: crebolledo (ADMIN)
password: 1122

user: ulara  ( USER)
password: 1122


## Agregar datos BD Mysql

cargar los datos de prueba que estan dentro del archivo import.sql (/src/main/resources/import.sql).
O cambiar la opcion de spring.jpa.hibernate.ddl-auto  a create-drop dentro del archivo aplication.properties.


```bash
pip install foobar
```

## Archivo aplication.properties

```java
spring.datasource.url=jdbc:mysql://localhost:3306/prueba_mod5?serverTimeZone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#spring.jpa.hibernate.ddl-auto=create-drop   #Activar si desea cargar el import.sql
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.globally_quoted_identifiers=true
spring.jpa.show-sql = true
server.port = 8093
```

## Integrantes

- René Calfin Olate
- Carlos Millaquipai
- Javier Lagos
- Valeria Manriquez
- Jose Contreras
