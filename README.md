# 💼 Employee Payroll Management System

A robust console-based payroll management system that calculates employee salaries with allowances and deductions. Built with clean code principles and comprehensive validation.

[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## ✨ Features

- 👤 **Employee Management** - Add and manage employee records
- 💰 **Salary Calculation** - Automatic gross and net salary computation
- 🔍 **Search Functionality** - Find employee by ID
- ✅ **Input Validation** - Comprehensive error checking and data validation
- 🛡️ **Duplicate Prevention** - Prevents duplicate employee IDs
- 🎨 **User-Friendly Interface** - Clean CLI with emoji feedback
- ⚠️ **Error Handling** - Robust exception handling for user inputs

## 🚀 Quick Start

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/yourusername/employee-payroll-system.git
cd employee-payroll-system
```

2. **Compile the project**
```bash
javac *.java
```

3. **Run the application**
```bash
java Manager
```

## 📖 Usage

### Main Menu
```
==== EMPLOYEE PAYROLL SYSTEM ====
1. Add New Employee
2. View All Employees
3. Calculate Salary
4. Exit
```

### Example Workflow

#### 1. Add Employee
```
Enter your choice: 1
Enter Employee ID: E001
Enter Name: Ahmad Ali
Enter Basic Salary: 50000
Enter Allowances: 10000
Enter Deductions: 5000
✅ Employee Added Successfully!
```

#### 2. View All Employees
```
Enter your choice: 2
===== All Employees =====
ID: E001
Name: Ahmad Ali
Basic Salary: 50000.00
Allowances: 10000.00
Deductions: 5000.00
```

#### 3. Calculate Salary
```
Enter your choice: 3
Enter Employee ID: E001
--- Salary Details ---
Basic Salary: 50000.00
Allowances: 10000.00
Deductions: 5000.00
Gross Salary: 60000.00
Net Salary: 55000.00
```

## 🏗️ Project Structure
```
employee-payroll-system/
│
├── Employee.java         # Employee entity with validation
├── Payroll.java          # Salary calculation logic
├── CompanyManager.java   # Employee management operations
├── Manager.java          # Main entry point with CLI
└── README.md             # This file
```

## 🔧 Technical Details

### Key Classes

#### `Employee`
Represents an employee with:
- Employee ID, name
- Basic salary, allowances, deductions
- Comprehensive input validation
- Formatted string representation

#### `Payroll`
Handles salary calculations:
- **Gross Salary** = Basic Salary + Allowances
- **Net Salary** = Gross Salary - Deductions
- Formatted salary breakdown

#### `CompanyManager`
Manages employee operations:
- Add employees with duplicate prevention
- Display all employees
- Search by employee ID
- Centralized employee storage

#### `Manager`
User interface:
- Interactive menu system
- Input validation and error handling
- Exception handling for numeric inputs
- User-friendly error messages

## 💡 Key Features Explained

### 1. Salary Calculation
```java
public double calculateGrossSalary() {
    return employee.getBasicSalary() + employee.getAllowances();
}

public double calculateNetSalary() {
    return calculateGrossSalary() - employee.getDeductions();
}
```

### 2. Duplicate Prevention
```java
for (Employee e : employees) {
    if (e.getEmployeeId().equals(employee.getEmployeeId())) {
        System.out.println("❌ Employee ID already exists!");
        return;
    }
}
```

### 3. Input Validation
```java
if (employeeId == null || employeeId.trim().isEmpty()
    || name == null || name.trim().isEmpty()
    || basicSalary < 0 || allowances < 0 || deductions < 0){
    throw new IllegalArgumentException("❌ Invalid input!");
}
```

## 📊 Sample Output
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

## 🛡️ Validation & Error Handling

### Input Validation
- ✅ Employee ID cannot be null or empty
- ✅ Name cannot be null or empty
- ✅ Salary values must be non-negative
- ✅ All numeric inputs validated
- ✅ Duplicate employee IDs prevented

### Error Handling
- ✅ Try-catch for numeric inputs
- ✅ Clear error messages
- ✅ Graceful handling of invalid data
- ✅ No application crashes

## ⚠️ Known Limitations

- 📝 In-memory storage only (data lost on exit)
- 💾 No database persistence
- 🌐 Console-only interface
- 👤 No user authentication
- 📅 No pay period tracking
- 💳 No tax calculation

## 🔮 Future Enhancements

- [ ] Add database integration (MySQL/PostgreSQL)
- [ ] Implement file-based persistence
- [ ] Add tax calculation based on salary slabs
- [ ] Create GUI with JavaFX
- [ ] Add pay period tracking (monthly/weekly)
- [ ] Generate PDF salary slips
- [ ] Add employee performance tracking
- [ ] Implement leave management
- [ ] Add overtime calculation
- [ ] Multi-user support with authentication

## 🎓 Learning Objectives

This project demonstrates:
- ✅ Object-Oriented Programming principles
- ✅ Encapsulation and data validation
- ✅ Business logic implementation
- ✅ ArrayList usage and management
- ✅ Exception handling
- ✅ User interface design (CLI)
- ✅ Real-world problem solving

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Muhammad Ahmad**

- GitHub: [@muhammad-ahmadp](https://github.com/muhammad-ahmadp)
- LinkedIn: [muhammad-ahmadcs](https://linkedin.com/in/muhammad-ahmadcs)
- Email: muhammadahmadseng@gmail.com

## 🙏 Acknowledgments

- Built as a practical project demonstrating Java fundamentals
- Inspired by real-world HR payroll systems
- Thanks to the Java community for excellent documentation

## 📧 Contact

Have questions or suggestions? Feel free to:
- Open an issue
- Submit a pull request
- Contact me directly

---

⭐ **If this project helped you learn, please give it a star!** ⭐

**Made with ❤️ and Java**

---

## 📈 Project Stats

![Lines of Code](https://img.shields.io/badge/Lines%20of%20Code-~300-blue)
![Classes](https://img.shields.io/badge/Classes-4-green)
![Methods](https://img.shields.io/badge/Methods-15+-orange)
