# Contact Form Application

A modern landing page with a functional contact form powered by Spring Boot backend.

## Project Structure

```
task0.1/
├── src/main/java/com/maincrafts/task01/
│   ├── Task01Application.java     # Main Spring Boot application
│   └── controller/
│       └── ContactController.java # REST controller for contact form
├── index.html                      # Landing page
├── contact.html                    # Contact form page
├── pom.xml                         # Maven configuration
└── README.md                       # This file
```

## Features

- **Frontend**: Modern, responsive landing page with Tailwind CSS
- **Backend**: Spring Boot REST API to handle form submissions
- **Form Handling**: Contact form data is printed to console (no database yet)

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Running the Application

### Backend (Spring Boot)

1. Navigate to the project directory:
   ```bash
   cd task0.1
   ```

2. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

3. The server will start on `http://localhost:8080`

### Frontend

1. Open `index.html` in your browser to view the landing page
2. Navigate to the contact form page
3. Fill out the form and submit - the data will be printed to the console

## API Endpoint

### POST /contact

Handles contact form submissions.

**Request Parameters:**
- `name` (String): User's name
- `email` (String): User's email address
- `message` (String): User's message

**Response:**
- Returns "Form submitted successfully!" message

**Console Output:**
The submitted form data (name, email, message) is printed to the console.

## Technologies Used

- **Frontend**: HTML5, Tailwind CSS, Font Awesome
- **Backend**: Java 17, Spring Boot 3.2.0, Maven
- **Build Tool**: Maven

## Future Enhancements

- Database integration for storing contact submissions
- Email notifications for new submissions
- Form validation improvements
- Admin dashboard for viewing submissions

## Author

Created by Amey Codes for Maincrafts Task 0.1
