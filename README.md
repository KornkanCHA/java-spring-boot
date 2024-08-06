# Overview
This Spring Boot application provides a simple REST API that returns a ready status message and the current date and time in a specific format. The application demonstrates the use of Spring Boot for creating a basic web service with endpoint mappings for handling requests.

# Running the Application
1. Ensure you have Java and Maven installed.
2. Clone the repository.
3. Navigate to the project directory:
4. Build and run the application:
5. Access the API at the following endpoints:
- Check the service status: [http://localhost:8080/check](http://localhost:8080/check)
- Get the current date and time: [http://localhost:8080/date](http://localhost:8080/date)

# Notes
- The `/check` endpoint returns a simple message indicating that the Spring Boot application is ready.
- The `/date` endpoint returns the current date and time formatted as "dd-MM-yyyy HH:mm:ss" based on the Asia/Bangkok timezone.
- Ensure that you have the required dependencies specified in the `pom.xml` file to successfully run the application.

# IDE
This project was developed using Apache NetBeans IDE.

