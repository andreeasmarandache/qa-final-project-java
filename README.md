# QA Final Project - Java

A Java project demonstrating object-oriented programming, exception handling, and data validation through a simple user management system.

This project is part of my portfolio and highlights my skills in Java OOP, custom exceptions, and list management.

---

## Overview

In this project, I implemented a small user management system covering:

- Creating custom exception classes for validation (`InvalidUserDataException`)  
- Designing base and derived classes (`User` and `AdminUser`) with encapsulated fields  
- Implementing a repository class to store valid users and enforce validation rules  
- Testing all functionalities with a runner class (`TestUserRunner`)  

---

## Project Details

### User and AdminUser Classes

- **User**: has `username` (String) and `age` (int), with getters and `toString()` for display  
- **AdminUser**: extends `User`, adds `permissionLevel` (String) and overrides `toString()`  

### InvalidUserDataException

- Custom exception extending `Exception`  
- Thrown when invalid user data is added to the repository  

### UserRepository

- Stores valid users in a private `List<User>`  
- Method `addUser(User user)` validates the user and throws `InvalidUserDataException` if any rule fails  
- Method `getUsers()` returns the list of valid users  

### TestUserRunner

- Tests all implemented functionalities  
- Adds users inside try-catch blocks to ensure the program continues even if one user is invalid  
- Prints error messages for invalid users  
- Prints all valid users at the end  

---

## Highlights

- Demonstrates OOP principles: inheritance, encapsulation, polymorphism  
- Implements custom exception handling  
- Shows ability to validate and manage data collections  
- Includes a simple runner class to test and verify all features  
- Continuous Integration verified using **GitHub Actions**  
- Supports running in a **Docker container** for consistent environment  

---

This project is a concrete example from my portfolio, showing how I structure Java programs, handle exceptions, and implement object-oriented designs for small systems.
