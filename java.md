# [JAVA](./java.md)

- [JAVA](#java)
  - [**Java Naming Conventions** 🚀](#java-naming-conventions-)
    - [**1️⃣ Class and Interface Names 📦**](#1️⃣-class-and-interface-names-)
    - [**2️⃣ Method Names 🔧**](#2️⃣-method-names-)
    - [**3️⃣ Variable Names 📊**](#3️⃣-variable-names-)
    - [**4️⃣ Constant Names 🔠**](#4️⃣-constant-names-)
    - [**5️⃣ Package Names 📂**](#5️⃣-package-names-)
    - [**6️⃣ File Names 📁**](#6️⃣-file-names-)
    - [**7️⃣ Naming Conventions in Java Collections**](#7️⃣-naming-conventions-in-java-collections)
      - [**Summary Table 📋**](#summary-table-)
      - [**Final Tip 💡**](#final-tip-)
  - [Languages That Supports OOPS Property](#languages-that-supports-oops-property)
    - [**Key Takeaways**](#key-takeaways)
## **Java Naming Conventions** 🚀

Naming conventions in Java help make code **readable, maintainable, and consistent**. Here are the standard naming rules:

---

### **1️⃣ Class and Interface Names 📦**

- **Use PascalCase** (Each word starts with an uppercase letter)
- **Examples**:
  ```java
  class Animal {}
  class StudentDetails {}
  interface Playable {}
  interface DataProcessor {}
  ```
- **Why?** Improves readability and differentiates from variables and methods.

---

### **2️⃣ Method Names 🔧**

- **Use camelCase** (First word is lowercase, next words start with uppercase)
- **Examples**:
  ```java
  void calculateSalary() {}
  void getStudentName() {}
  boolean isAvailable() {}
  ```
- **Why?** Clearly distinguishes methods from classes.

---

### **3️⃣ Variable Names 📊**

- **Use camelCase**
- **Must be meaningful & descriptive**
- **Examples**:
  ```java
  int age;
  String studentName;
  double accountBalance;
  ```
- **Avoid** using single letters (except for loop counters like `i, j, k`).

---

### **4️⃣ Constant Names 🔠**

- **Use UPPER*CASE with underscores (`*`)**
- **Examples**:
  ```java
  final double PI = 3.14159;
  final int MAX_USERS = 100;
  final String DATABASE_URL = "jdbc:mysql://localhost";
  ```
- **Why?** Constants should be easily identifiable.

---

### **5️⃣ Package Names 📂**

- **Use all lowercase letters**
- **Use reverse domain naming convention** (to avoid conflicts)
- **Examples**:
  ```java
  package com.example.project;
  package org.companyname.module;
  package myapp.utilities;
  ```
- **Why?** Ensures uniqueness across different organizations.

---

### **6️⃣ File Names 📁**

- **Must match the public class name**
- **Examples**:
  ```java
  public class Main {}   // File should be saved as Main.java
  public class StudentDetails {}   // File: StudentDetails.java
  ```

---

### **7️⃣ Naming Conventions in Java Collections**

| Type      | Naming Convention  | Example                             |
| --------- | ------------------ | ----------------------------------- |
| **Array** | Plural form        | `int[] numbers;`                    |
| **List**  | Singular + List    | `List<String> studentList;`         |
| **Map**   | Key + "To" + Value | `Map<Integer, String> idToNameMap;` |

---

#### **Summary Table 📋**

| Element       | Convention           | Example               |
| ------------- | -------------------- | --------------------- |
| **Class**     | PascalCase           | `StudentDetails`      |
| **Interface** | PascalCase           | `Runnable`            |
| **Method**    | camelCase            | `calculateSalary()`   |
| **Variable**  | camelCase            | `studentName`         |
| **Constant**  | UPPER_CASE           | `MAX_USERS`           |
| **Package**   | lowercase            | `com.example.project` |
| **File Name** | Same as public class | `Main.java`           |

---

#### **Final Tip 💡**

✅ **Follow these conventions** to make your Java code clean and professional.  
❌ **Avoid single-letter variable names** (except for loop counters).  
💡 **Be descriptive**—choose meaningful names!

---

## Languages That Supports OOPS Property
Here’s an expanded table covering **20 OOP properties** across **C, C++, Java, Python, C#, and JavaScript**:  

| **OOP Property**           | **C**  | **C++** | **Java** | **Python** | **C#** | **JavaScript** |
|---------------------------|--------|--------|--------|--------|--------|--------------|
| **Class & Objects**       | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes (ES6 Classes) |
| **Encapsulation**         | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes (Using Closures) |
| **Data Hiding**           | ❌ No | ✅ Yes (Private Members) | ✅ Yes | ✅ Yes (Using `_` & `__`) | ✅ Yes | ✅ Limited (Private Fields in ES6) |
| **Inheritance**           | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes (Prototype-based) |
| **Single Inheritance**    | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Multiple Inheritance**  | ❌ No | ✅ Yes | ❌ No (Only via Interfaces) | ✅ Yes | ❌ No | ❌ No |
| **Multilevel Inheritance**| ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Hybrid Inheritance**    | ❌ No | ✅ Yes | ❌ No (Using Interfaces) | ✅ Yes (Using Mixins) | ✅ Yes (Using Interfaces) | ❌ No |
| **Polymorphism**          | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes (Duck Typing) |
| **Method Overloading**    | ❌ No | ✅ Yes | ✅ Yes | ❌ No (Simulated) | ✅ Yes | ❌ No |
| **Method Overriding**     | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Abstraction**           | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Partial (No true abstract classes) |
| **Abstract Classes**      | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ❌ No |
| **Interfaces**            | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes (Duck Typing) | ✅ Yes | ❌ No |
| **Constructors**          | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Destructors**           | ❌ No | ✅ Yes | ❌ No (Uses Garbage Collection) | ❌ No (Uses Garbage Collection) | ✅ Yes (Finalizers) | ❌ No |
| **Operator Overloading**  | ❌ No | ✅ Yes | ❌ No | ✅ Yes | ✅ Yes | ❌ No |
| **Function Overloading**  | ❌ No | ✅ Yes | ✅ Yes | ❌ No | ✅ Yes | ❌ No |
| **Static Binding**        | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Dynamic Binding**       | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Multiple Dispatch**     | ❌ No | ❌ No | ❌ No | ✅ Yes | ❌ No | ❌ No |
| **Exception Handling**    | ❌ No | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes (Try-Catch) |

### **Key Takeaways**
1. **C lacks OOP features** completely.
2. **C++ supports full OOP**, including multiple inheritance and operator overloading.
3. **Java is fully OOP** but **does not support multiple inheritance** (replaced by interfaces).
4. **Python supports all OOP features**, including multiple inheritance.
5. **C# is fully OOP**, but it does **not support multiple inheritance** (uses interfaces instead).
6. **JavaScript uses prototype-based inheritance**, lacks method overloading, and has limited abstraction.
