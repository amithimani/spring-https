# Spring-HTTPS Demo Application

This is a sample Spring Boot application named "spring-https" that demonstrates how to enable HTTPS and redirect HTTP traffic to HTTPS. It includes a default endpoint ("/") that returns a greeting string when called.

## Project Structure

The project follows the package structure `dev.knowledgecafe` and includes the following configuration files:

- `SecurityConfig.java`: This file, located in the `config` folder, contains the configuration for redirecting traffic from the HTTP endpoint (port 8080) to the HTTPS endpoint (port 8443).
- `ServerConfig.java`: Also located in the `config` folder, this file includes the server configuration settings.

## Application Configuration

The application configuration can be found in the `application.yml` file, located in the `resources` folder. It includes the following settings:

- SSL Certificate Configuration: The `application.yml` file contains the configuration related to the SSL certificate and keystore used for HTTPS communication. Please ensure that the appropriate SSL certificate and keystore files are provided.
- Port Configuration: The file specifies the port settings for the application. By default, the application is configured to use port 8080 for HTTP and port 8443 for HTTPS.

## Requirements

To run this application, ensure you have the following:

- Java Development Kit (JDK) version 17 or higher installed.
- Maven or Gradle build tool for dependency management.

## Getting Started

Follow the steps below to run the application:

1. Clone the repository or download the source code.
2. Open a terminal or command prompt and navigate to the project's root directory.
3. Build the application using the following command:

   ```shell
   mvn clean install
   ```

4. Once the build is complete, run the application using the following command:

   ```shell
   mvn spring-boot:run
   ```

5. The application will start, and you can access it through the following URL:

   ```
   http://localhost:8080/
   ```

   Note that this URL will automatically redirect to the HTTPS endpoint (port 8043).

## Dependencies

The project uses Spring Boot version 3.1.0 and includes the necessary dependencies defined in the `pom.xml` file. Maven will automatically download these dependencies during the build process.

## Additional Notes

- Make sure to update the SSL certificate and keystore configuration in the `application.yml` file as per your specific setup.
- For production deployments, it is recommended to use a valid SSL certificate issued by a trusted certificate authority (CA).
- Customize the application's endpoints, logic, and configurations as per your requirements.

For any further assistance or questions, please contact [dev.knowledgecafe@example.com](mailto:amithimani@knowledge-cafe.dev).
