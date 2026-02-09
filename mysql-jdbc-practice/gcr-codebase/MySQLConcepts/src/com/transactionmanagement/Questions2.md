# 🏦 SQL Challenge: Transaction Management System

## Difficulty: Medium → Advanced  
**Topics:** SQL Transactions, Stored Procedures, ACID Properties, Database Design  

---

## Problem Statement

You are tasked with building a simple **Banking Transaction Management System** using MySQL.

The system must support secure money transfers between accounts while ensuring data consistency using **transactions**. You will also implement balance checks and maintain a transaction history.

---

## Requirements

### Step 1 — Create Database
Create a database named: banking_system

---

### Step 2 — Create Tables

Create the following tables:

### `accounts`

| Column | Data Type | Constraints |
|--------|------------|--------------|
| account_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| holder_name | VARCHAR(100) | NOT NULL |
| balance | DECIMAL(12,2) | NOT NULL |
| created_at | TIMESTAMP | DEFAULT CURRENT_TIMESTAMP |

---

### `transactions`

| Column | Data Type | Constraints |
|--------|------------|--------------|
| txn_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| from_account | INT | — |
| to_account | INT | — |
| amount | DECIMAL(12,2) | NOT NULL |
| txn_time | TIMESTAMP | DEFAULT CURRENT_TIMESTAMP |
| status | VARCHAR(20) | — |

---

## Tasks

### Task 1 — Add Accounts
Insert at least **5–10 bank accounts** with an initial balance.

---

### Task 2 — Check Balance
Write a query to view the balance of a specific account using `account_id`.

---

### Task 3 — Transfer Money Using Transactions
Perform a money transfer from one account to another by ensuring:

- Deduct money from the sender  
- Add money to the receiver  
- Record the transaction  
- Use:

---

### Task 4 — Create a Stored Procedure
Create a stored procedure named:


The procedure should:

- Accept sender_id, receiver_id, and transfer_amount  
- Lock rows using `FOR UPDATE`  
- Handle SQL exceptions  
- Commit on success  
- Rollback on failure  
- Insert transaction status (`SUCCESS` or `FAILED`)  

---

### Task 5 — View Transaction History
Write queries to:

View all transactions  
View transactions for a specific account  
Identify successful vs failed transfers  

---

## Expected Outcome

After completing this challenge, you should understand:

- How database transactions work  
- ACID properties (Atomicity, Consistency, Isolation, Durability)  
- Safe money transfers  
- Stored procedures  
- Error handling in SQL  
- Row-level locking (`FOR UPDATE`)  
- Maintaining audit/history tables  

---

## Bonus Challenge (Highly Recommended 🚀)

Try implementing:

⭐ **Insufficient Balance Check** inside the procedure  
⭐ Add **FOREIGN KEY constraints**  
⭐ Create an **index** on `from_account` and `to_account`  
⭐ Prevent negative balances  
⭐ Generate a mini **bank statement query**

---



