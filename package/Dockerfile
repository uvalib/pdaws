# builder
FROM openjdk:8 as builder

# update and install dependancies
RUN apt-get -y update && apt-get -y install maven

# copy assets
WORKDIR /build
COPY src ./src
COPY pom.xml ./

# build the tartet WAR file
RUN mvn clean package

# base image
FROM tomcat:8.0

# install updates
RUN apt-get -y update

# port and run command
EXPOSE 8080

# copy the WAR file
COPY --from=builder /build/target/pdaws-1.0.war /usr/local/tomcat/webapps/

#
# end of file
#
