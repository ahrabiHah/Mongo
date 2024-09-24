# Use an official Tomcat as the base image
FROM tomcat:10.1-jdk21

# Remove the default webapps from Tomcat (optional, for a clean state)
RUN rm -rf /usr/local/tomcat/webapps/*

# Change Tomcat's default port from 8080 to 8888
RUN sed -i 's/port="8080"/port="8888"/g' /usr/local/tomcat/conf/server.xml

# Copy your WAR file to the Tomcat webapps directory
COPY target/WebApp-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8888
EXPOSE 8888

# Start Tomcat server
CMD ["catalina.sh", "run"]
