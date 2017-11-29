[![Build Status][travis-badge]][travis-badge-url]

![](./img/x.png)

Spring Boot with Jersey and Swagger Example
=============================================
This is an example on how to integrate Spring Boot, with Jersey, 
Swagger, and Swager UI.  

### Build
To build the JAR, execute the following command from the parent directory:

```
mvn clean install
```

### Run
To run the application fromm command line,

```
java -jar target/springfox-ui-from-json-example-1.0.0.jar
```

### Access Swagger Endpoints

##### Swagger UI
You can view the Swagger UI at `http://localhost:8080/swagger-ui.html`.


##### Swagger JSON
You can view Swagger JSON doc at `http://localhost:8080/swagger.json`


[travis-badge]: https://travis-ci.org/indrabasak/spring-jersey-swagger-example.svg?branch=master
[travis-badge-url]: https://travis-ci.org/indrabasak/spring-jersey-swagger-example/