FROM openjdk:18

ADD /build/libs/admin.jar /home/admin.jar
CMD ["java","-jar","/home/admin.jar"]