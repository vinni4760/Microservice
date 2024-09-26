# Microservice
The project aims to implement a microservices architecture for managing employees and departments within an organization. Project consist of two main services: Employee Service and Department Service. Each service will operate independently and communicate through RESTful APIs, allowing for scalability and ease of maintenance.
API Gateway: Use an API gateway (like Spring Cloud Gateway ) to route requests to the appropriate microservice.
Service Discovery: Implement service discovery using Netflix Eureka to allow services to find each other dynamically.
Config Server : Spring Cloud Config Server to manage configurations in a microservices architecture
Zipkin Server : for distributed tracing in  microservices architecture to monitor and troubleshoot service endpoints and requests.
