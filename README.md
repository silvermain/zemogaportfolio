#Portfolio Java Web App
Simple portfolio Web application to display some character information and 5 Tweets list

#Getting started
Simple project to show a Twiteer timeline of five tweets, besides retrieve some info from a database.

#Warning
Be aware of Twitter policy about the number of attempts to retrieve data throughout public API

#Prerequisites
- MySQL Db
- Java JDK 
- Spring Boot
- Maven
- Thymeleaf templeate engine
- Maven

#IDE PREFERRED
- IDEA IntelliJ (User for the implementation)

#Installing
How to get local dev running

Clone repo: https://github.com/silvermain/zemogaportfolio.git

$ mvn clean install
$ mnv spring-boot:run

Go to http://localhost:8080, be aware of Twiteer's API consumption rate an limit

#Step by step setup of local
1. $ git clone https://github.com/silvermain/zemogaportfolio.git
2. $ cd zemogaportfolio
3. $ mvn clean test
4. $ mvn clean install
5. $ mvn spring-boot:run

#Running the test
$ mvn clean test

#REST API Documentation
Go to http://localhost:8080/swagger-ui.html

#Deployment
At this point manual using Git push

#Versioning
0.0.1-SNAPSHOT

#Author
-Ivan A. David <ivan.david@gmail.com>
