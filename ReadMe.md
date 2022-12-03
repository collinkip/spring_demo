# Getting Started

## Endpoints
### Post a single Person
Method: Post localhost:8080/api/v1/person
```yaml
{
    "name": "Nelson Mandela"
}
```
###  Get  all people posted
Method:
get localhost:8080/api/person

result
```javascript
[
    {
        "id": "da8d2adc-1a61-4910-8d12-1d5d1a44fff7",
        "name": "John Hammond"
    },
    {
        "id": "223bc3d2-687b-4ffe-a2b6-148669901104",
        "name": "Nelso Mandela"
    },
    {
        "id": "69b821d0-8777-4214-8f8e-a5f4dfc17755",
        "name": "Anna Brenda "
    }
]
```
### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#web)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#io.webservices)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)

