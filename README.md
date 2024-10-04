# Sunbase-Pvt.-Ltd.-Assignment
Assignment given by Sunbase Pvt. Ltd.

## Overview

The Customer Management System is a comprehensive web application designed to efficiently manage customer data. It provides functionalities for user authentication, CRUD operations for customer information, and advanced search capabilities. Additionally, it supports synchronization of customer data with an external API.

## Features

- **Authentication**: Secure login and token-based session management.
- **CRUD Operations**: Add, Edit, Delete, and View Customer Data.
- **Search**: Search for customers by using first name, city, email, and phone.
- **Pagination**: View customer lists with pagination.
- **Sync**: Synchronize customer data with an external API (Sunbase API) and update the database accordingly.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Spring Boot
- **Database**: MySQL

## Getting Started

### Prerequisites

- Java JDK 17+
- Springboot
- MySQL

- ### Installation

1. **Clone the Repository**

   ```bash
   https://github.com/Kajol1106/Sunbase-Pvt.-Ltd.-Assignment
2. **Set Up the Database**
- Create a MySQL database "SunbaseCustomerManagementSystem" and update the database credentials in the `application.properties` file.

3. **Build and Run the Application**

- Open the project in your IDE (e.g., IntelliJ IDEA, Eclipse).
- Configure application.properties with your MySQL database credentials.
- Build and run the Spring Boot application.

4. **Access the Application**
- Open your web browser and navigate to http://localhost:8080 to access the application.

## Usage
### Register a New User

**POST** `http://localhost:8080/api/auth/registerCustomer`

**Headers:**
- Content-Type: application/json
- Accept: application/json

**Body:**
```json
{
  "email": "test@sunbasedata.com",
  "password": "Test@123",
  "firstName": "Kajol",
  "lastName": "Kolagir",
  "phone": "1236547896",
  "street": "Street-1",
  "address": "House No. 1",
  "city": "Pune",
  "state": "Maharashtra"
}
```
![img](https://github.com/Kajol1106/Sunbase-Pvt.-Ltd.-Assignment/blob/main/SunbaseCustomerManagementSystem/src/main/resources/static/images/Registration%201.png)

### Login
**POST** `http://localhost:8080/api/auth/loginCustomer`

**Headers:**
- Content-Type: application/json
- Accept: application/json

**Body:**
```json
{
  "email": "test@sunbasedata.com",
  "password": "Test@123"
}
```
![img](https://github.com/Kajol1106/Sunbase-Pvt.-Ltd.-Assignment/blob/main/SunbaseCustomerManagementSystem/src/main/resources/static/images/Login%201.png)

### Add New Customer

**POST** `http://localhost:8080/api/customers/saveCustomer`

**Headers:**
- Content-Type: application/json
- Accept: application/json
- Authorization: Bearer [Your_JWT_Token_Here]

**Body:**
```json
{
  "email": "kajol@gmail.com",
  "password": "Kaju@123",
  "firstName": "Kajol",
  "lastName": "Kolagir",
  "phone": "1236547896",
  "street": "Street-1",
  "address": "House No. 1",
  "city": "Pune",
  "state": "Maharashtra"
}
```
![img](https://github.com/Kajol1106/Sunbase-Pvt.-Ltd.-Assignment/blob/main/SunbaseCustomerManagementSystem/src/main/resources/static/images/add%20customer.png)

### Edit a Customer

**PUT** `http://localhost:8080/api/customers/updateCustomer`

**Headers:**
- Content-Type: application/json
- Accept: application/json
- Authorization: Bearer [Your_JWT_Token_Here]

**Body:**
```json
{
  "email": "kajol@gmail.com",
  "password": "Kaju@123",
  "firstName": "Kajol",
  "lastName": "Kolagir",
  "phone": "1236547896",
  "street": "Street-1",
  "address": "House No. 1",
  "city": "Pune",
  "state": "Maharashtra"
}
```

### Delete a Customer

**DELETE** `http://localhost:8080/api/customers/deleteCustomerByUuid?uuid=3`

**Headers:**
- Accept: application/json
- Authorization: Bearer [Your_JWT_Token_Here]


### Search
- Use the search functionality to filter customers based on criteria like first name, city, email, and phone. Designed in front-end

![img](https://github.com/Kajol1106/Sunbase-Pvt.-Ltd.-Assignment/blob/main/SunbaseCustomerManagementSystem/src/main/resources/static/images/Search.png)

### Sync Button And Pagination
- Located on the customer list screen, this button fetches customer data from a remote API and updates your database. If a customer already exists, their details are updated rather than creating a duplicate entry.
- Pagination functionality add

![img](https://github.com/Kajol1106/Sunbase-Pvt.-Ltd.-Assignment/blob/main/SunbaseCustomerManagementSystem/src/main/resources/static/images/after%20sync.png)

## Contact
For further suggestions, enquiries, or issues, please contact `kajolkolagir@gmail.com`
