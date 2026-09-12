# Week 6 - Classes and Objects Revision

Java solutions for the Classes and Objects revision assignment.

## Exercises

### M1 - Library Inventory Management

Uses a `BookInventory` class with title, author, and available-copy fields. Four books are stored in an array and printed in a loop.

### M2 - Payroll Salary Management

Uses encapsulated salary and bonus fields. The class validates opening salary, bonus credits, and tax percentages while exposing net salary through a getter.

### M3 - Employee Profile Creation

Demonstrates constructor overloading and constructor chaining with permanent employees and interns.

### M4 - Exam Hall Ticket Reference Management

Demonstrates shared object references and the difference between `==` for the same object and separate objects with identical values.

### M5 - Employee and Company Information Management

Demonstrates static company information and an employee counter shared across all `Employee` objects.

## Folder Structure

```text
M1_LibraryInventory/
M2_PayrollSalaryManagement/
M3_EmployeeProfileCreation/
M4_ExamHallTicketReferenceManagement/
M5_EmployeeCompanyInformationManagement/
```

Each folder contains its `.java` source file and compiled `.class` files.

## Compile and Run

From the repository root, compile an exercise with:

```powershell
javac M1_LibraryInventory\M1LibraryInventory.java
```

Run it with:

```powershell
java -cp M1_LibraryInventory M1LibraryInventory
```

Replace the folder and class names with the exercise you want to run.