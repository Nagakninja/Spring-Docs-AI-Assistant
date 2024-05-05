# Spring Boot Reference Documentation Assistant

This is a little demo put together to show off the features of [Spring AI](https://spring.io/projects/spring-ai). This
is a command line utility that utilizes Open AI. To augment GPT-4 it is using a technique called Retrieval Augmented Generation (RAG)
to provide an up to date information about Spring Boot using the Spring Boot Reference documentation. If you want to see
how this application is built you can check out the video below. 

[YouTube Tutorial](https://youtu.be/ZoPVGrB8iHU)

## Dependencies 

- Web 
- Shell
- JDBC API
- Open AI
  - spring-ai-pdf-document-reader (not available in the Spring Initializr)
- PgVector
- Docker Compose 
- GraalVM Native Support

[Spring Initiliazr](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.2.5&packaging=jar&jvmVersion=21&groupId=com.example&artifactId=aidocs&name=aidocs&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.aidocs&dependencies=web,spring-shell,jdbc,spring-ai-openai,spring-ai-vectordb-pgvector,docker-compose,native)