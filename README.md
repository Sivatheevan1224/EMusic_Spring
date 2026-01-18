# 🎵 E-Music Web Application

> A modern Spring Boot web application for managing and viewing music albums with secure user authentication.

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.9-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0+-blue.svg)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-Educational-yellow.svg)](LICENSE)

## 📖 Overview

E-Music is a full-stack Java web application that provides a comprehensive music album management system. Built with Spring Boot and following MVC architecture, it offers users a seamless experience to browse, search, and explore music albums with detailed track information.

## ✨ Features

- 🔐 **Secure Authentication** - User login system with encrypted passwords
- 📚 **Album Catalog** - Browse through a comprehensive collection of music albums
- 🎼 **Track Details** - View detailed information about albums and their tracks
- 👤 **Artist Information** - Explore artist profiles and their discography
- 🔒 **Spring Security** - Password encryption using BCrypt
- 🎨 **Responsive UI** - Clean JSP-based views with JSTL
- 🚀 **RESTful API** - Well-structured REST endpoints

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 17 | Core programming language |
| **Spring Boot** | 3.5.9 | Application framework |
| **Spring Data JPA** | - | Database operations |
| **Spring Security** | - | Password encryption |
| **MySQL** | 8.0+ | Relational database |
| **JSP & JSTL** | - | View layer |
| **Maven** | 3.6+ | Build & dependency management |
| **Apache Tomcat** | Embedded | Servlet container |

## 📁 Project Structure

```
activity08/
├── 📄 pom.xml                                # Maven configuration
├── 📄 README.md                              # Project documentation
├── 🔧 mvnw, mvnw.cmd                         # Maven wrapper scripts
│
└── src/
    ├── main/
    │   ├── java/my/app/activity08/
    │   │   ├── 🚀 Activity08Application.java      # Application entry point
    │   │   ├── ⚙️  ServletInitializer.java        # WAR deployment config
    │   │   ├── 🔧 WebConfig.java                  # MVC configuration
    │   │   │
    │   │   ├── controller/                        # 🎮 Request handlers
    │   │   │   └── MainController.java
    │   │   │
    │   │   ├── dto/                               # 📦 Data Transfer Objects
    │   │   │   └── LoginDTO.java
    │   │   │
    │   │   ├── entity/                            # 🗄️ JPA Entities
    │   │   │   ├── Album.java
    │   │   │   ├── Artist.java
    │   │   │   ├── Track.java
    │   │   │   └── User.java
    │   │   │
    │   │   ├── repository/                        # 💾 Data Access Layer
    │   │   │   ├── AlbumRepository.java
    │   │   │   └── UserRepository.java
    │   │   │
    │   │   └── service/                           # 💼 Business Logic
    │   │       ├── AlbumService.java              (interface)
    │   │       ├── AlbumServiceImplt.java         (implementation)
    │   │       ├── UserService.java               (interface)
    │   │       └── UserServiceImplt.java          (implementation)
    │   │
    │   ├── resources/
    │   │   ├── application.properties             # App configuration
    │   │   ├── static/                            # CSS, JS, images
    │   │   └── templates/                         # Template files
    │   │
    │   └── webapp/
    │       ├── images/                            # Application images
    │       └── WEB-INF/views/                     # 🎨 JSP Views
    │           ├── album-list.jsp                 (Album listing)
    │           ├── album-view.jsp                 (Album details)
    │           ├── error.jsp                      (Error page)
    │           └── sign-in.jsp                    (Login page)
    │
    └── test/
        └── java/my/app/activity08/
            └── Activity08ApplicationTests.java    # Unit tests
```

### 🏗️ Architecture

The application follows a **layered architecture pattern**:

```
┌─────────────────────────────────────┐
│     🎮 Controller Layer             │  ← HTTP Requests & Responses
├─────────────────────────────────────┤
│     💼 Service Layer                │  ← Business Logic
├─────────────────────────────────────┤
│     💾 Repository Layer             │  ← Data Access (JPA)
├─────────────────────────────────────┤
│     🗄️ Entity Layer                 │  ← Database Models
└─────────────────────────────────────┘
```

## 🗄️ Database Configuration

### Database Schema

The application uses a MySQL database named `emusic` with the following tables:

| Table | Description | Key Fields |
|-------|-------------|------------|
| **users** | User authentication | user_id, first_name, last_name, username, password |
| **albums** | Album information | album_id, name, artist_id, image_file |
| **artists** | Artist profiles | artist_id, name |
| **tracks** | Track details | track_id, album_id, name, duration |

### Configuration

Update `application.properties` with your MySQL credentials:

```properties
# Database Connection
spring.datasource.url=jdbc:mysql://localhost:3306/emusic
spring.datasource.username=root
spring.datasource.password=your_password_here

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- ☕ **Java JDK 17** or higher
- 🔨 **Maven 3.6+**
- 🐬 **MySQL Server 8.0+**
- 🌐 A modern web browser

## 🚀 Installation & Setup

### 1️⃣ Clone the Repository

```bash
git clone <repository-url>
cd activity08
```

### 2️⃣ Set Up the Database

```sql
-- Create database
CREATE DATABASE emusic CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Use the database
USE emusic;

-- Import your schema and sample data here
```

### 3️⃣ Configure Application Properties

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/emusic
spring.datasource.username=root
spring.datasource.password=your_password
```

### 4️⃣ Build the Project

```bash
mvn clean install
```

### 5️⃣ Run the Application

**Option A: Using Maven**
```bash
mvn spring-boot:run
```

**Option B: Using the WAR file**
```bash
java -jar target/activity08-0.0.1-SNAPSHOT.war
```

### 6️⃣ Access the Application

Open your browser and navigate to:
```
http://localhost:8080
```

## 🔗 API Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| `GET` | `/` | Sign-in page | ❌ |
| `POST` | `/login` | Process user login | ❌ |
| `GET` | `/view-albums` | Display album list | ✅ |
| `GET` | `/album-view?id={albumId}` | View album details | ✅ |

## 💡 Usage

1. **Start the application** using one of the methods above
2. **Navigate** to `http://localhost:8080`
3. **Sign in** with your credentials
4. **Browse** through the album catalog
5. **Click** on any album to view details and tracks
6. **Explore** artist information and discography

## 🏗️ Building for Production

### Create Production WAR

```bash
mvn clean package -DskipTests
```

The WAR file will be available at:
```
target/activity08-0.0.1-SNAPSHOT.war
```

### Deploy to External Tomcat

1. Copy the WAR file to Tomcat's `webapps/` directory
2. Start Tomcat server
3. Access via `http://localhost:8080/activity08`

## 🧪 Development

### Running Tests

```bash
# Run all tests
mvn test

# Run tests with coverage
mvn test jacoco:report

# Run specific test class
mvn test -Dtest=Activity08ApplicationTests
```

### Project Commands

```bash
# Clean build artifacts
mvn clean

# Compile source code
mvn compile

# Package without tests
mvn package -DskipTests

# Run in debug mode
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"
```

## 📚 Code Structure Details

### Service Layer Pattern

The application uses interface-based services for better maintainability:

```java
// Interface
public interface AlbumService {
    List<Album> getAllAlbums();
    Album getAlbumById(Long id);
}

// Implementation
@Service
public class AlbumServiceImplt implements AlbumService {
    // Implementation details
}
```

### Repository Layer

Spring Data JPA repositories provide database operations:

```java
public interface AlbumRepository extends JpaRepository<Album, Long> {
    // Custom query methods if needed
}
```

## 🛡️ Security

- 🔒 **Password Encryption**: BCrypt algorithm via Spring Security
- 🔐 **Session Management**: HTTP sessions for authenticated users
- ⚠️ **SQL Injection Prevention**: JPA parameterized queries

## 🐛 Troubleshooting

### Common Issues

**Port already in use**
```bash
# Change port in application.properties
server.port=8081
```

**Database connection failed**
- Verify MySQL is running
- Check credentials in `application.properties`
- Ensure database `emusic` exists

**JSP pages not rendering**
- Verify `tomcat-embed-jasper` dependency
- Check view prefix/suffix in `WebConfig.java`

## 🤝 Contributing

This is an educational project. To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is part of an educational activity (Activity 08) for APT coursework.

## 👨‍💻 Author

**Sivatheevan**
- GitHub: [@Sivatheevan1224](https://github.com/Sivatheevan1224)
- Email: sivatheevan1224@gmail.com
- Course: Advanced Programming Techniques
- Activity: Activity 08
- Academic Year: 2025-2026

## 🙏 Acknowledgments

- Spring Boot team for the excellent framework
- MySQL for the reliable database system
- APT course instructors for guidance

---

<div align="center">

**Made with ☕ and Spring Boot**

⭐ Star this repo if you find it helpful! ⭐

</div>
