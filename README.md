# Spring-Boot-Microservices
Java Spring Boot Microservices


In this application – two microservices for Student and Course created and details of students and courses can be accessed or updated from Postman. Also REST Template used to make  REST calls -  Student microservice requests details of course from Course Microservice, thereby  REST API facilitating communication between two microservices . The Microservices are registered on Eureka Server for service discoverability and routing impleneted with Spring Cloud Gateway.A distributed log tracing implemented through Zipkin server  and can be verified for different REST calls.Backend developed using Spring Data JPA and MySQL database. Application developed on Spring Tool Suite and steps followed are -


1.Created two microservices for Student and Course details. 
2. MySQL Client used for backend database configuration.
3. Student Microservice requests information from Course microservice through REST API calls. 
4.A service registry - Eureka server created to register all microservices for service discovery.
5.A Gateway server created to route requests from client or REST API requests to appropriate microservice.
6.Distributed log tracing system implemented using zipkin.
