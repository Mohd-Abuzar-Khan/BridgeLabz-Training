#Employee Management System

## Difficulty: Easy → Medium  
**Topics:** SQL, CRUD Operations, Database Design  

---

## Problem Statement

You are tasked with building a simple **Employee Management System** using MySQL.

Create a database and table, then write SQL queries to perform various employee management operations.

---

## Requirements

### Step 1 — Create Database
Create a database named:


---

### Step 2 — Create Table

Create a table called `employees` with the following columns:

| Column | Data Type | Constraints |
|--------|------------|--------------|
| id | INT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(100) | UNIQUE |
| department | VARCHAR(50) | — |
| salary | DECIMAL(10,2) | — |
| created_at | TIMESTAMP | DEFAULT CURRENT_TIMESTAMP |

---

## Tasks

### Task 1 — Add Employees
Insert at least **two employees** into the table.

---

### Task 2 — View Employees
Write a query to display all employee records.

---

### Task 3 — Search Employee
Write a query to find employees whose name contains a specific keyword.

---

### Task 4 — Update Salary
Update the salary of an employee using their **id**.

---

### Task 5 — Delete Employee
Delete an employee record using their **id**.

---

## Expected Outcome

After completing this challenge, you should be comfortable with:

- Database creation  
- Table design  
- INSERT  
- SELECT  
- UPDATE  
- DELETE  
- Filtering with WHERE  
- Pattern matching using LIKE  

---



