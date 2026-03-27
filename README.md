# RESTful-API
A Spring Boot REST API demonstrating CRUD operations and service-layer abstraction for any object management.

A lightweight Spring Boot application that provides a RESTful interface for managing a collection of topics. This project demonstrates the implementation of a 3-tier architecture (Controller, Service, and Model) in Java.

Features:

Full CRUD Operations: Create, Read, Update, and Delete topics.
RESTful Endpoints: Clean URL structures for resource manipulation.
In-Memory Storage: Uses a service-layer list to manage data state.
Dependency Injection: Utilizes Spring's @Autowired for clean, decoupled code.

Language: Java 11
Framework: Spring Boot 2.7.0
Build Tool: Maven

GET	/topics	Retrieve all topics

GET	/topics/{id}	Retrieve a specific topic by ID

POST	/topics	Add a new topic

PUT	/topics/{id}	Update an existing topic

DELETE	/topics/{id}	Remove a topic.
