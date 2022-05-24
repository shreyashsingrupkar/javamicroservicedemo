FROM openjdk:11
ADD target/docker-demo-employee.jar docker-demo-employee.jar
EXPOSE 4444
ENTRYPOINT ["java", "-jar" , "docker-demo-employee.jar"]