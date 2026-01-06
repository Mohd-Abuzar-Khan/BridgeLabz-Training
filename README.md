# Java DSA-Practice - Week 3

## Week 3 Dsa Java Practice

---

### 📅 Week 3 Day 01 – Data Structures Overview & Linked Lists  
**(Date: 03-Jan-2026)**

### 📘 Topics Covered

- Understood the **fundamentals of Data Structures**:
  - Learned how data structures organize and store data efficiently.
  - Explored their role in optimizing operations like searching, sorting, and updating.
  - Studied common examples such as Arrays, Stacks, Queues, Linked Lists, Trees, and Graphs.
  - Identified **Linked Lists** as a key structure for dynamic memory management.

- Explored **Key Features of Data Structures in Java**:
  - **Predefined and Custom Implementations**:
    - Used Java Collections Framework (Lists, Maps, Sets).
    - Designed custom data structures using classes and objects.
  - **Dynamic Memory Allocation**:
    - Learned how structures like Lists and Maps grow and shrink dynamically.
  - **Generics Support**:
    - Ensured type safety and reduced runtime errors.
  - **Thread-Safe Options**:
    - Studied concurrent collections such as `ConcurrentHashMap` and `CopyOnWriteArrayList`.

- Studied **Types of Data Structures in Java**:
  - **Linear Data Structures**:
    - Array (fixed-size, contiguous memory).
    - Linked List (dynamic node-based structure).
    - Stack (LIFO).
    - Queue (FIFO).
  - **Hierarchical Data Structures**:
    - Tree, Binary Tree, Binary Search Tree (BST).
    - Heap for priority-based operations.
  - **Graph Data Structures**:
    - Directed and undirected graphs representing relationships.
  - **Hash-Based Data Structures**:
    - HashMap for

🔗 **Code Link:**  
👉 [*Week 3 Day 01 – Scenario-Based OOP Programs (Encapsulation & Polymorphism)*](https://github.com/Mohd-Abuzar-Khan/BridgeLabz-Training/tree/dsa-practice/dsa-java-practice/gcr-codebase/JavaDsaPractice/src/com/linkedlist)

---

### 📅 Week 3 Day 02 – Stack, Queue & Hashing Fundamentals  
**(Date: 04-Jan-2026)**

### 📘 Topics Covered

- Studied **Stack Data Structure (LIFO)**:
  - Understood core operations: `push`, `pop`, `peek`, `isEmpty`.
  - Explored real-world use cases:
    - Function call stack in recursion.
    - Undo/Redo operations.
    - Expression evaluation and parenthesis matching.
  - Implemented **Balanced Parentheses Checker** using Stack:
    - Validated proper nesting of `()`, `{}`, and `[]`.
    - Applied stack-based traversal and matching logic.
  - Analyzed:
    - Time Complexity: **O(n)**
    - Space Complexity: **O(n)**

- Learned **Queue Data Structure (FIFO)**:
  - Understood key operations: `offer`, `poll`, `peek`, `isEmpty`.
  - Explored Java Queue implementations:
    - `LinkedList`
    - `PriorityQueue`
    - `ArrayDeque`
  - Implemented **Ticket Counter Management System**:
    - Enqueued customers as they arrived.
    - Dequeued customers in order of service.
  - Studied queue usage in:
    - Task scheduling.
    - BFS traversal.
    - Request handling systems.

- Explored **HashMap & Hashing Concepts**:
  - Understood key-value pair storage using `HashMap`.
  - Learned core methods: `put`, `get`, `remove`, `containsKey`.
  - Implemented word frequency counting using HashMap.
  - Studied internal working of HashMap:
    - Hashing and bucket indexing.
    - Collision handling using separate chaining.
    - Load factor (default: 0.75) and resizing.
  - Compared:
    - `HashMap` vs `LinkedHashMap`
    - `HashMap` vs `ConcurrentHashMap`

- Learned **Hashing Functions in Java**:
  - Understood `hashCode()` and its role in hash-based collections.
  - Studied rules for overriding `hashCode()` and `equals()`.
  - Implemented custom `hashCode()` for user-defined classes.
  - Learned best practices to minimize collisions and ensure consistency.

- Focused on:
  - Choosing the right data structure based on problem requirements.
  - Understanding internal mechanics for interview readiness.
  - Writing clean, efficient, and safe data-structure-based code.

🔗 **Code Link:**  
👉 [*Week 3 Day 02 – Stack, Queue & HashMap Implementations*](https://github.com/Mohd-Abuzar-Khan/BridgeLabz-Training/tree/dsa-practice/dsa-java-practice/gcr-codebase/JavaDsaPractice/src/com)


---

### 📅 Week 3 Day 03 – Sorting Algorithms (Core & Advanced)  
**(Date: 05-Jan-2026)**

### 📘 Topics Covered

- Studied the importance of **Sorting Algorithms**:
  - Organizing data efficiently for faster searching, processing, and analysis.
  - Compared algorithms based on time complexity, space usage, and stability.

### 🔹 Core Sorting Algorithms

- **Bubble Sort**
  - Concept: Repeatedly swaps adjacent elements; largest element bubbles to the end.
  - Time Complexity:
    - Best: O(n)
    - Average/Worst: O(n²)
  - Space Complexity: O(1)
  - Stable: Yes
  - Use Case: Small or nearly sorted datasets.

- **Insertion Sort**
  - Concept: Builds the sorted array incrementally by inserting elements in correct positions.
  - Time Complexity:
    - Best: O(n)
    - Average/Worst: O(n²)
  - Space Complexity: O(1)
  - Stable: Yes
  - Use Case: Small datasets, adaptive sorting, nearly sorted data.

- **Merge Sort (Divide & Conquer)**
  - Concept: Recursively divides the array and merges sorted halves.
  - Time Complexity: O(n log n) in all cases.
  - Space Complexity: O(n)
  - Stable: Yes
  - Use Case: Large datasets, linked lists, when stability is required.

- **Quick Sort (Divide & Conquer)**
  - Concept: Partition-based sorting using a pivot element.
  - Time Complexity:
    - Best/Average: O(n log n)
    - Worst: O(n²) (poor pivot selection)
  - Space Complexity: O(log n)
  - Stable: No
  - Use Case: High-performance systems, large datasets with randomized pivot.

### 🔹 Additional Sorting Algorithms (Overview)

- Explored:
  - Selection Sort
  - Heap Sort
  - Counting Sort
  - Radix Sort
  - Bucket Sort
- Compared algorithms based on:
  - Best, average, and worst-case time complexity.
  - Space complexity.
  - Stability and use cases.


🔗 **Code Link:**  
👉 [*Week 3 Day 03 – Sorting Algorithms Implementations*]()




✨ *More updates coming as I continue my Java & DSA journey...*
