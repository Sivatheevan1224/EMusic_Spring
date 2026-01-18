# Activity 08 - E-Music Web Application

A Spring Boot web application for managing and viewing music albums with user authentication.

## Overview

This is a Java-based web application built with Spring Boot that provides a music album management system. Users can sign in and browse through a collection of albums with their associated tracks and artist information.

## Technologies Used

- **Java 17**
- **Spring Boot 3.5.9**
- **Spring Data JPA** - For database operations
- **Spring Security** - For password encryption
- **MySQL** - Database
- **JSP & JSTL** - For views
- **Maven** - Build tool
- **Apache Tomcat** - Embedded servlet container

## Features

- User authentication (login system)
- View list of albums
- View detailed album information including tracks
- Password encryption using Spring Security
- RESTful architecture with MVC pattern

## Project Structure

```
src/
├── main/
│   ├── java/my/app/activity08/
│   │   ├── Activity08Application.java      # Main application entry point
│   │   ├── ServletInitializer.java         # WAR deployment initializer
│   │   ├── WebConfig.java                  # Web configuration
│   │   ├── controller/
│   │   │   └── MainController.java         # Main controller handling requests
│   │   ├── dto/
│   │   │   └── LoginDTO.java               # Data Transfer Object for login
│   │   ├── entity/
│   │   │   ├── Album.java                  # Album entity
│   │   │   ├── Artist.java                 # Artist entity
│   │   │   ├── Track.java                  # Track entity
│   │   │   └── User.java                   # User entity
│   │   ├── repository/
│   │   │   ├── AlbumRepository.java        # Album data access
│   │   │   └── UserRepository.java         # User data access
│   │   └── service/
│   │       ├── AlbumService.java           # Album service interface
│   │       ├── AlbumServiceImplt.java      # Album service implementation
│   │       ├── UserService.java            # User service interface
│   │       └── UserServiceImplt.java       # User service implementation
│   ├── resources/
│   │   ├── application.properties          # Application configuration
│   │   ├── static/                         # Static resources
│   │   └── templates/                      # Template files
│   └── webapp/
│       ├── images/                         # Image resources
│       └── WEB-INF/views/
│           ├── album-list.jsp              # Album listing page
│           ├── album-view.jsp              # Album detail page
│           ├── error.jsp                   # Error page
│           └── sign-in.jsp                 # Login page
└── test/
    └── java/my/app/activity08/
        └── Activity08ApplicationTests.java # Application tests
```

## Database Configuration

The application connects to a MySQL database named `emusic`. Update the following properties in `application.properties` to match your database configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/emusic
spring.datasource.username=root
spring.datasource.password=
```

### Database Schema

The application uses the following tables:
- **users** - Stores user credentials (user_id, first_name, last_name, username, password)
- **albums** - Stores album information (album_id, name, artist_id, image_file)
- **artists** - Stores artist information
- **tracks** - Stores track information associated with albums

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL Server 8.0+
- MySQL database named `emusic` with appropriate schema

## Installation & Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd activity08
   ```

2. **Set up the MySQL database**
   - Create a database named `emusic`
   - Import the required schema and sample data

3. **Configure database credentials**
   - Update `src/main/resources/application.properties` with your MySQL credentials

4. **Build the project**
   ```bash
   mvn clean install
   ```

5. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

   Or run the generated WAR file:
   ```bash
   java -jar target/activity08-0.0.1-SNAPSHOT.war
   ```

6. **Access the application**
   - Open your browser and navigate to: `http://localhost:8080`

## Application Endpoints

- `GET /` - Sign-in page
- `POST /login` - Process user login
- `GET /view-albums` - Display list of albums (requires authentication)
- `GET /album-view?id={albumId}` - View specific album details

## Usage

1. Start the application
2. Navigate to the home page (`http://localhost:8080`)
3. Sign in with your credentials
4. Browse through the album list
5. Click on an album to view its details and tracks

## Building for Production

To create a WAR file for deployment:

```bash
mvn clean package
```

The WAR file will be generated in the `target/` directory: `activity08-0.0.1-SNAPSHOT.war`

## Development

### Running Tests

```bash
mvn test
```

### Package Structure

The application follows a layered architecture:
- **Controller Layer**: Handles HTTP requests and responses
- **Service Layer**: Contains business logic
- **Repository Layer**: Data access layer using Spring Data JPA
- **Entity Layer**: JPA entities representing database tables
- **DTO Layer**: Data Transfer Objects for API communication

## License

This project is part of an educational activity (Activity 08).

## Author

Developed as part of APT coursework.
