# builder
FROM openjdk:8 as builder

# update and install dependancies
RUN apt-get -y update && apt-get -y install maven

# copy assets
WORKDIR /build
COPY src ./src
COPY pom.xml ./

# copy the configuration file
COPY src/main/resources/pda.properties.prod src/main/resources/pda.properties

# build the tartet WAR file
RUN mvn clean package

# base image
FROM tomcat:8.0

# install updates
RUN apt-get -y update

# add the healthcheck
RUN mkdir /usr/local/tomcat/webapps/healthcheck && echo "OK" > /usr/local/tomcat/webapps/healthcheck/index.html

# copy the Oracle JDBC driver
COPY src/main/resources/ojdbc14-10.2.0.4.0.jar /usr/local/tomcat/lib

# port and run command
EXPOSE 8080

# copy the WAR file
COPY --from=builder /build/target/pdaws-1.0.war /usr/local/tomcat/webapps/pdaws.war

#
# end of file
#
