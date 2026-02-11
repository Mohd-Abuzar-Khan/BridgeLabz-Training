#Library Management System

## Difficulty: Medium  
**Topics:** Database Design, SQL Joins, Filtering, Aggregation, Constraints  

---

## Problem Statement

Design and implement a **Library Management System** using MySQL.

The system should manage book inventory, track student borrowings, calculate fines for overdue books, and provide powerful search functionality with multiple filters.

---

## Requirements

### Step 1 — Create Database
Create a database named:


---

### Step 2 — Design Tables

Create the following tables with appropriate relationships.

#### 📖 `books`

| Column | Data Type | Constraints |
|--------|------------|--------------|
| book_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| title | VARCHAR(150) | NOT NULL |
| author | VARCHAR(100) | NOT NULL |
| genre | VARCHAR(50) | — |
| published_year | INT | — |
| total_copies | INT | NOT NULL |
| available_copies | INT | NOT NULL |

---

#### 🎓 `students`

| Column | Data Type | Constraints |
|--------|------------|--------------|
| student_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(100) | UNIQUE |
| course | VARCHAR(100) | — |
| created_at | TIMESTAMP | DEFAULT CURRENT_TIMESTAMP |

---

#### 🔄 `borrow_records`

| Column | Data Type | Constraints |
|--------|------------|--------------|
| record_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| student_id | INT | FOREIGN KEY |
| book_id | INT | FOREIGN KEY |
| borrow_date | DATE | NOT NULL |
| due_date | DATE | NOT NULL |
| return_date | DATE | — |
| fine | DECIMAL(8,2) | DEFAULT 0 |

---

## Tasks

### Task 1 — Add Books
Insert at least **8–10 books** into the inventory with varying genres and authors.

---

### Task 2 — Register Students
Add at least **5 students** to the system.

---

### Task 3 — Borrow a Book
When a student borrows a book:

Create a borrow record  
Reduce `available_copies`  
Ensure books cannot be borrowed if no copies remain  

*(Hint: Use transactions for safety.)*

---

### Task 4 — Return a Book
When a book is returned:

Update `return_date`  
Increase `available_copies`  
Calculate fine if returned after `due_date`  

**Fine Rule Example:**  


---

### Task 5 — Fine Calculation Query
Write a query to:

- Identify overdue books  
- Calculate pending fines  
- Display student name, book title, days overdue, and fine amount  

---

### Task 6 — Search with Multiple Filters
Implement flexible search queries such as:

Search books by author  
Filter by genre  
Find books published after a certain year  
Show only available books  
Combine multiple filters (e.g., genre + availability)

---

### Task 7 — View Borrowing History
Write queries to:

- View all borrowed books  
- Check borrowing history for a specific student  
- Identify the most borrowed books  

---

## Expected Outcome

After completing this challenge, you should be comfortable with:

- Real-world database design  
- Foreign keys and relationships  
- Transactions  
- Conditional queries  
- Multi-table joins  
- Aggregations  
- Dynamic filtering  
- Fine calculation logic  

---

## Bonus Challenge (For Interview-Level Skills )

⭐ Prevent the same student from borrowing the same book twice without returning it  
⭐ Create a stored procedure for borrowing books  
⭐ Automatically calculate fines using a trigger  
⭐ Add indexes for faster search  
⭐ Build a query to recommend popular books  

---





