FROM eclipse-temurin:17 
Copy target/towsoft.jar twosoft.jar
CMD [ "java","-jar","twosoft.jar" ]

