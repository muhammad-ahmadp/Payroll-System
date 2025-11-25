# Employee Payroll Management System

A robust, console-based application developed in Java to manage employee records and accurately calculate salaries, including allowances and deductions. This project demonstrates strong Object-Oriented Programming (OOP) principles, comprehensive data validation, and clear separation of concerns.

[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

---

## 1. Overview

This system provides a complete solution for managing a small company's payroll operations. It focuses on data integrity and accurate financial calculations, ensuring that all employee records are handled correctly and salary computations are precise.

### Core Features

*   **Employee Management:** Functions to add, view, and manage employee records.
*   **Salary Calculation:** Automatic computation of Gross Salary (Basic + Allowances) and Net Salary (Gross - Deductions).
*   **Data Validation:** Comprehensive input validation to ensure all financial and personal data is non-negative and correctly formatted.
*   **Duplicate Prevention:** Logic to prevent the creation of employees with duplicate IDs.
*   **Search Functionality:** Ability to quickly retrieve employee details by ID.
*   **User Interface:** A clean, menu-driven Command Line Interface (CLI) for ease of use.

---

## 2. Technical Architecture

The system is structured around four primary classes, adhering to the Single Responsibility Principle (SRP) for modularity and maintainability.

### Project Structure

```
employee-payroll-system/
│
├── Employee.java         # Employee entity with validation
├── Payroll.java          # Salary calculation logic
├── CompanyManager.java   # Employee management operations
└── Manager.java          # Main entry point with CLI
```

### Key Classes and Responsibilities

| Class | Responsibility | Key Concepts Demonstrated |
| :--- | :--- | :--- |
| `Employee.java` | Data model for an employee, including personal and financial attributes. | Encapsulation, Data Validation, Constructor Overloading. |
| `Payroll.java` | Handles all salary-related computations. | Business Logic Implementation, Calculation Accuracy. |
| `CompanyManager.java` | Manages the collection of `Employee` objects. | Collection Management (`ArrayList`), Search Logic, Duplicate Prevention. |
| `Manager.java` | Provides the interactive Command Line Interface (CLI). | User Interface Design, Input Handling, Exception Handling. |

---

## 3. Design Decisions

The following decisions were made to ensure the system is robust and professional:

*   **Defensive Programming:** All financial inputs (Basic Salary, Allowances, Deductions) are validated to be non-negative at the point of object creation, preventing invalid state.
*   **Separation of Concerns:** The core business logic (`Payroll.java`) is completely decoupled from the data management (`CompanyManager.java`) and the user interface (`Manager.java`). This allows for easier future migration to a GUI or web interface.
*   **Clear Error Handling:** `try-catch` blocks are used extensively in the `Manager` class to handle non-numeric user input gracefully, ensuring the application does not crash due to user error.
*   **Duplicate ID Check:** A proactive check is implemented in `CompanyManager` to ensure the uniqueness of employee IDs, which is critical for any real-world database system.

### Code Example: Salary Calculation Logic

```java
public double calculateGrossSalary() {
    // Gross Salary = Basic Salary + Allowances
    return employee.getBasicSalary() + employee.getAllowances();
}

public double calculateNetSalary() {
    // Net Salary = Gross Salary - Deductions
    return calculateGrossSalary() - employee.getDeductions();
}
```

---

## 4. How to Run

### Prerequisites
*   Java Development Kit (JDK) 8 or higher

### Installation and Execution

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/employee-payroll-system.git
    cd employee-payroll-system
    ```

2.  **Compile the project:**
    ```bash
    javac *.java
    ```

3.  **Run the application:**
    ```bash
    java Manager
    ```

### Sample Workflow

```
==== EMPLOYEE PAYROLL SYSTEM ====
1. Add New Employee
2. View All Employees
3. Calculate Salary
4. Exit
Enter your choice: 3
Enter Employee ID: E001
--- Salary Details ---
Basic Salary: 50000.00
Allowances: 10000.00
Deductions: 5000.00
Gross Salary: 60000.00
Net Salary: 55000.00
```

---

## 5. Limitations and Future Enhancements

### Known Limitations

*   **In-Memory Storage:** All data is stored in memory and is lost upon application exit.
*   **Interface:** The application is limited to a console-only interface.
*   **Scope:** Lacks advanced features such as tax calculation, pay period tracking, and user authentication.

### What I'd Do Next

*   Implement **database persistence** (e.g., using JDBC with MySQL or PostgreSQL) to ensure data is saved permanently.
*   Develop a **Graphical User Interface (GUI)** using JavaFX or Swing to improve user experience.
*   Integrate **tax calculation logic** based on defined salary slabs.
*   Add a **leave management** module and **overtime calculation** functionality.

---

## 6. Contact and License

### Author

**[Muhammad Ahmad]**

*   GitHub: [@muhammad-ahmadp](https://github.com/muhammad-ahmadp)
*   LinkedIn: [muhammad-ahmadcs](https://linkedin.com/in/muhammad-ahmadcs)
### License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

### Acknowledgments

This project was built as a practical demonstration of core Java and OOP fundamentals, inspired by the need for robust, real-world business applications.
