# Spring-Boot-Microservices
Java Spring Boot Microservices


In this application – two microservices for Student and Course created and details of students and courses can be accessed or updated from Postman. Also REST calls are implemented wherein Student microservice requests details of course from Course Microservice. Application developed on Spring Tool Suite and steps followed are -


1.Created two microservices for Student and Course details. 
2. MySQL Client used for backend database configuration.
3. Student Microservice requests information from Course microservice through REST API calls. 
4.A service registry - Eureka server created to register all microservices for service discovery.
5.A Gateway server created to route requests from client or REST API requests to appropriate microservice.
6.Distributed log tracing system implemented using zipkin.
