# tasks
[CURRENT] Bug tracking system (Java 8+Spring 4+Hibernate 5+PostgreSQL 9.6)

!IMPORTANT!
  Frontend is in progress, so don't blame me, use REST API instead))

### Configuring:

  1. src/main/resources/config.properties - Hibernate config (contains localhost config example)
  2. src/main/resources/log4j.properties - Logging config (contains console config example)

### Deploying:

  1. mvn clean package
  2. simply copy to Tomcat's 'webapps' folder
  3. go to 'localhost:8080/tasks/index.html'
