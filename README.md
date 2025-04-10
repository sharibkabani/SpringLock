## About The Project

SpringLock is a user authentication and authorization service built using Spring Boot, Spring Security, and JWT (JSON Web Tokens). It provides a secure and robust way to manage user accounts, authentication, and authorization in your Spring Boot applications. The application implements user registration with email verification, login functionality, and JWT-based authentication for securing API endpoints.

### Key Features

- **User Registration:** Allows new users to register with a unique username, email, and password.
- **Email Verification:** Sends a verification code to the user's email address upon registration to ensure the validity of the email.
- **JWT Authentication:** Generates JWT tokens upon successful login for secure authentication of subsequent requests.
- **Protected API Endpoints:** Secures API endpoints using JWT tokens, ensuring that only authenticated users can access them.
- **Password Encoding:** Uses BCryptPasswordEncoder to securely store user passwords.
- **Role-Based Authorization:** (Potentially extendable) Provides a foundation for implementing role-based authorization to control access to different parts of the application.
- **Token Expiration:** Implements token expiration to enhance security.

## Architecture

The application follows a layered architecture:

- **Controllers:** `AuthController` handles user registration, login, and email verification. `UserController` manages user-related operations, such as retrieving the currently authenticated user or a list of all users.
- **Services:** `AuthService` contains the business logic for user registration, authentication, and verification. `UserService` provides methods for retrieving user information. `JwtService` is responsible for generating and validating JWT tokens. `EmailService` handles sending emails for account verification.
- **Entities:** `User` represents the user entity, storing user information such as username, email, password, and verification status.
- **Repositories:** `UserRepo` provides data access methods for the `User` entity, using Spring Data JPA.
- **Configuration:** `AppConfig`, `EmailConfig`, `JwtAuthConfig`, and `SecurityConfig` configure the application's security, email settings, and JWT authentication.

**Technologies Used:**

- **Spring Boot:** A framework for building Java-based web applications and microservices.
- **Spring Security:** A powerful and customizable authentication and authorization framework.
- **JWT (JSON Web Tokens):** A standard for securely transmitting information between parties as a JSON object.
- **Spring Data JPA:** Simplifies data access with JPA repositories.
- **PostgreSQL:** A relational database used for storing user data.
- **Lombok:** A library that reduces boilerplate code by automatically generating getters, setters, constructors, and other common methods.
- **JavaMailSender:** An interface that provides functionality for sending emails.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- PostgreSQL database

### Installation

1.  **Clone the repository:**

    ```sh
    git clone https://github.com/sharibkabani/springlock.git
    cd springlock
    ```

2.  **Configure the application:**

    Create a `.env` file in the root directory of the project and set the following environment variables:

    ```
    PSQL_URL=jdbc:postgresql://localhost:5432/your_database_name
    PSQL_USER=your_database_user
    PSQL_PASSWORD=your_database_password
    JWT_SECRET=your_jwt_secret_key
    JWT_EXPIRES_IN=3600000 # Example: 1 hour in milliseconds
    EMAIL_USERNAME=your_email_username
    EMAIL_PASSWORD=your_email_password
    ```

    Replace the placeholder values with your actual database credentials, JWT secret key, and email settings.

3.  **Build the application:**

    ```sh
    ./mvnw clean install
    ```

4.  **Run the application:**

    ```sh
    ./mvnw spring-boot:run
    ```

    The application will start on port 8080 by default.
