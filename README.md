# Employee Management System

## Task 1: Employee Management System

**Level:** 2 (Intermediate)  
**Language:** Java  
**Concept:** Object-Oriented Programming (OOP)

## 📌 Project Overview

The **Employee Management System** is a simple Java console application used to manage employee records.

The project implements basic **CRUD operations**:

- **Create** – Add a new employee
- **Read** – View employee details
- **Update** – Modify employee information
- **Delete** – Remove an employee record

Employee data is stored temporarily in an **ArrayList**.

## 🎯 Objectives

- Create an `Employee` class with details such as ID, name, department, and salary.
- Add new employee records.
- View all employee records.
- Update existing employee information.
- Delete employee records.
- Use `ArrayList` to store employee data.
- Understand basic Object-Oriented Programming concepts in Java.

## 🛠️ Technologies Used

- **Java**
- **ArrayList**
- **Scanner**
- **Object-Oriented Programming (OOP)**

## 📋 Employee Details

Each employee contains:

| Field | Description |
|---|---|
| ID | Unique employee ID |
| Name | Employee name |
| Department | Employee department |
| Salary | Employee salary |

## ⚙️ Features

### 1. Add Employee
Allows the user to enter employee ID, name, department, and salary.

### 2. View Employees
Displays all employees stored in the ArrayList.

### 3. Update Employee
Searches for an employee using their ID and updates their details.

### 4. Delete Employee
Removes an employee from the employee list using their ID.

### 5. Exit
Closes the program.

## 📂 Project Structure

```text
EmployeeManagementSystem/
│
├── EmployeeManagementSystem.java
└── README.md
```

## ▶️ How to Run

### Step 1: Install Java

Make sure Java JDK is installed on your computer.

Check the installation using:

```bash
java -version
```

### Step 2: Compile the Program

Open Command Prompt or Terminal in the project folder and run:

```bash
javac EmployeeManagementSystem.java
```

### Step 3: Run the Program

```bash
java EmployeeManagementSystem
```

## 🖥️ Sample Menu

```text
--- Employee Management ---
1. Add Employee
2. View Employees
3. Update Employee
4. Delete Employee
5. Exit

Enter choice:
```

## 📚 OOP Concepts Used

### Class
The `Employee` class represents an employee.

### Object
Each employee record is created as an object of the `Employee` class.

### Constructor
The constructor initializes employee details.

### Encapsulation
Employee information is grouped inside the `Employee` class.

### ArrayList
`ArrayList<Employee>` is used to store multiple employee objects.

## 🔄 CRUD Operations

```text
Create  → Add Employee
Read    → View Employees
Update  → Update Employee
Delete  → Delete Employee
```

## ⚠️ Note

This is a basic educational project. Employee data is stored **in memory**, so the records will be lost when the program is closed.

## 👨‍💻 Author

**Student Project – BCA**

## ⭐ Conclusion

This project demonstrates how Java and Object-Oriented Programming can be used to create a simple Employee Management System with CRUD functionality.
