FROM openjdk:11 AS BUILD_IMAGE
<<<<<<< HEAD
RUN command apt update && apt install maven -y
RUN git clone https://github.com/DeucesDevops/vprofile-project.git
RUN cd vprofile-project && git checkout docker && mvn install

FROM tomcat:9.0-jre11
LABEL "Project"="Vprofile"
LABEL "Author"="Bernard"
=======
RUN apt update && apt install maven -y
RUN git clone https://github.com/devopshydclub/vprofile-project.git
RUN cd vprofile-project && git checkout docker &&  mvn install 

FROM tomcat:9-jre11
LABEL "Project"="Vprofile"
LABEL "Author"="Imran"
>>>>>>> f95b762d12759fb580e677a155c7a068e20387ad
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=BUILD_IMAGE vprofile-project/target/vprofile-v2.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
<<<<<<< HEAD
CMD [ "catalina.sh", "run" ]
=======
CMD ["catalina.sh", "run"]
>>>>>>> f95b762d12759fb580e677a155c7a068e20387ad
