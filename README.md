# Library Management System

A console-based Library Management System built with Java.

## Project Overview

This project is a menu-driven application that allows users to manage books, reference books, members, and librarians in a library system. Built as part of the OOP course at African University College of Admission (AUCA).

## Features

- **Book Management**
  - Add regular books
  - Add reference books
  - Display all books
  - Display reference books with borrowing status

- **Member Management**
  - Register new library members
  - Store member contact information
  - Display all registered members

- **Librarian Management**
  - Add librarian staff
  - Track work shifts
  - Display librarian information

- **Error Handling**
  - Graceful handling of invalid inputs
  - Array overflow protection
  - User-friendly error messages

## Project Structure
```
library-management-system-java/
│
├── Library/
│   ├── Book/
│   │   ├── Book.java              # Base book class
│   │   └── ReferenceBook.java     # Extended reference book class
│   │
│   └── Member/
│       └── Member.java            # Library member class
│
├── Staff/
│   └── Liberian/
│       └── Librarian.java         # Librarian staff class
│
├── Entry.java                     # Main application entry point
└── README.md                      # Project documentation
```

## How to Run

### Compilation Steps

1. **Clone the repository**
```bash
   git clone https://github.com/yourusername/library-management-system-java.git
   cd library-management-system-java
```

2. **Compile all Java files**
```bash
   javac Library/Book/*.java
   javac Library/Member/*.java
   javac Staff/Liberian/*.java
   javac Entry.java
```

3. **Run the application**
```bash
   java Entry
```