# Employee_Management_System

<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
This is a backend API built using the Spring framework that handles various HTTP requests for an Employee Management System. The API allows users to manage employee information such as personal details, job roles, salary information, and more.

---
<br>

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Model
* ### Employee
```
Id : unique identifier for each employee
firstName : first of the employee
lastName : last of the employee
email : employee email
phoneNumber : number of the employee
role : role of employee
salary : salary of employee
```

* ### HR
```
hrId : unique identifier for each HR
firstName : first of the HR
lastName : last of the HR
email : HR email
phoneNumber : number of the HR
```

---

## Data Flow

```
The employee sends a request to the application through the API endpoints.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API receives the request and sends it to the appropriate controller method.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method makes a call to the method in service class.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
```

<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method returns a response to the API.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API sends the response back to the user.
```

---

## API Endpoints :-
### Employee

* PostMapping: "/employee"
```
In database we add a new user given through API.
```
* GetMapping: "/employee/{id}"
```
This endpoint returns data of specific employee based on employeeid through API
```

* PutMapping: "/employee/{id}"
```
In database we update a employee by userid given through API.
```

* DeleteMapping "/employee/{id}"
```
In database we delete a employee by userid given through API.
```

### HR

* PostMapping: "/hr"
```
In database we add a new HR given through API.
```

* GetMapping: "/hr/{id}"
```
This endpoint returns data of specific HR based on hr_id through API
```

* PutMapping: "/employee/{id}/{salary}/{role}"
```
This endpoint is accessible to HR & can update the Salary and Role of Employee
```

* PutMapping: "/hr/{id}"
```
In database we update a HR by ID given through API.
```

* DeleteMapping "/hr/{id}"
```
In database we delete a HR by ID given through API.
```

---

## DataBase Used
* MySQL
```
We have used MySQL as a database to implement CRUD Operations.
```
---

## Project Summary

The Employee Management System using Spring Boot is a user-friendly and efficient application that streamlines the management of employee data. This application provides an easy-to-use interface for HR personnel to manage employee information, and also allows employees to view and update their own personal details. With its advanced features such as reporting and user management, this application is a valuable tool for any organisation looking to manage their employee data effectively.
