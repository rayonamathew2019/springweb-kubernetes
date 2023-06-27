FROM openjdk
ADD target/springweb-kubernetes-0.0.1-SNAPSHOT.jar springweb-kubernetes-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "springweb-kubernetes-0.0.1-SNAPSHOT.jar"]
