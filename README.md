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
- **Backend**: Spring Boot REST API with MySQL database integration
- **Database**: MySQL with Spring Data JPA for data persistence
- **Form Handling**: Contact form data stored in database
- **API Endpoints**: RESTful endpoints for form submission and data retrieval

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher
- MySQL database named `contact_db`

## Running the Application

### Database Setup

1. Open MySQL command line:
   ```bash
   mysql -u root -p
   ```

2. Create the database:
   ```sql
   CREATE DATABASE contact_db;
   ```

3. Update database credentials in `src/main/resources/application.properties` if needed.

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
3. Fill out the form and submit - the data will be saved to the database

## API Endpoints

### POST /api/contact

Handles contact form submissions.

**Request Parameters:**
- `name` (String): User's name
- `email` (String): User's email address
- `message` (String): User's message

**Response:** "Form submitted successfully!"

### GET /api/contacts

Returns all stored contact submissions in JSON format.

**Response:** Array of contact objects with id, name, email, and message.

## Database Schema

**contacts table:**
- `id` (BIGINT, AUTO_INCREMENT, PRIMARY KEY)
- `name` (VARCHAR, NOT NULL)
- `email` (VARCHAR, NOT NULL)
- `message` (VARCHAR(1000), NOT NULL)

## Viewing Data

### Via API
```bash
curl http://localhost:8080/api/contacts
```

### Via MySQL Command Line
```sql
USE contact_db;
SELECT * FROM contacts;
```

## Technologies Used

- **Frontend**: HTML5, Tailwind CSS, Font Awesome
- **Backend**: Java 17, Spring Boot 3.2.0, Spring Data JPA
- **Database**: MySQL 8.0
- **Build Tool**: Maven

## Future Enhancements

- Email notifications for new submissions
- Form validation improvements
- Admin dashboard for viewing submissions
- Pagination for contacts list
- Search and filter functionality
- Export contacts to CSV/Excel

## Author

Created by Amey Codes for Maincrafts Task 2
