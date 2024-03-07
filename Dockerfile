FROM eclipse-temurin:17 
Copy target/twosoft.jar twosoft.jar
CMD [ "java","-jar","twosoft.jar" ]

