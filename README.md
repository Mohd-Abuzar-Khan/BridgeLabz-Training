# Java DSA Practice – Week 3

Focused implementation of **core Data Structures, Algorithms, and Analysis in Java**,  
with emphasis on **performance, complexity, and interview relevance**.

---

## 📅 Day 1 – Data Structures Overview & Linked Lists  
**Date:** 03-Jan-2026

### 📘 Key Learnings
- Role of data structures in efficient data storage and retrieval.
- Overview of:
  - Linear structures (Array, Linked List, Stack, Queue)
  - Hierarchical structures (Tree, Heap)
  - Hash-based structures (HashMap)
- Deep dive into **Linked Lists**:
  - Node-based structure
  - Dynamic memory allocation
  - Advantages over arrays

### 🧠 Java-Specific Insights
- Java Collections Framework vs custom implementations
- Generics for type safety
- Overview of thread-safe collections

🔗 **Code:**  
👉 [Linked List Implementations](https://github.com/Mohd-Abuzar-Khan/BridgeLabz-Training/tree/dsa-practice/dsa-java-practice/gcr-codebase/JavaDsaPractice/src/com/linkedlist)

---

## 📅 Day 2 – Stack, Queue & Hashing  
**Date:** 04-Jan-2026

### 📘 Key Learnings
- **Stack (LIFO)**:
  - Core operations: push, pop, peek
  - Balanced Parentheses Checker
- **Queue (FIFO)**:
  - Implementations using `LinkedList`, `ArrayDeque`, `PriorityQueue`
  - Ticket Counter simulation
- **Hashing & HashMap**:
  - Hashing, buckets, collision handling
  - `hashCode()` & `equals()` contract
  - Comparison with `LinkedHashMap` and `ConcurrentHashMap`

### ⏱ Complexity Focus
- Stack / Queue operations: **O(1)**
- HashMap average lookup: **O(1)**

🔗 **Code:**  
👉 [Stack, Queue & HashMap](https://github.com/Mohd-Abuzar-Khan/BridgeLabz-Training/tree/dsa-practice/dsa-java-practice/gcr-codebase/JavaDsaPractice/src/com)

---

## 📅 Day 3 – Sorting Algorithms  
**Date:** 05-Jan-2026

### 📘 Algorithms Implemented
- Bubble Sort
- Insertion Sort
- Selection Sort
- Counting Sort
- Merge Sort
- Quick Sort
- Heap Sort

### 📊 Complexity Overview

| Algorithm   | Avg Time     | Space | Stable |
|------------|--------------|-------|--------|
| Bubble     | O(n²)        | O(1)  | Yes    |
| Insertion  | O(n²)        | O(1)  | Yes    |
| Selection  | O(n²)        | O(1)  | No     |
| Counting   | O(n + k)     | O(k)  | Yes    |
| Merge      | O(n log n)   | O(n)  | Yes    |
| Quick      | O(n log n)   | O(log n) | No |
| Heap       | O(n log n)   | O(1)  | No     |

🔗 **Code:**  
👉 [Sorting Algorithms](https://github.com/Mohd-Abuzar-Khan/BridgeLabz-Training/tree/dsa-practice/dsa-java-practice/gcr-codebase/JavaDsaPractice/src/com/sorting)

---

## 📅 Day 4 – Searching Algorithms  
**Date:** 06-Jan-2026

### 📘 Topics Covered
- **Linear Search**
  - Suitable for unsorted or small datasets
- **Binary Search**
  - Efficient lookup on sorted data

### 🔍 Supporting Java Concepts
- `StringBuilder` vs `StringBuffer`
- `FileReader` vs `InputStreamReader`

🔗 **Code:**  
👉 [Searching Algorithms](https://github.com/Mohd-Abuzar-Khan/BridgeLabz-Training/tree/dsa-practice/dsa-java-practice/gcr-codebase/JavaDsaPractice/src/com/sorting)

---

## 📅 Day 5 – Algorithm Analysis & Big O Notation  
**Date:** 07-Jan-2026

### 📘 Key Learnings
- Time & Space Complexity fundamentals
- Big O Notation:
  - O(1), O(log n), O(n), O(n log n), O(n²)
- Comparative analysis of:
  - Linear Search vs Binary Search
  - Bubble Sort vs Merge Sort vs Quick Sort
- Recursive vs Iterative approaches (Fibonacci case study)


🔗 **Code:**  
👉 [Analysis Algorithms](https://github.com/Mohd-Abuzar-Khan/BridgeLabz-Training/tree/dsa-practice/dsa-java-practice/gcr-codebase/JavaDsaPractice/src/com/algorithmananlysis)
