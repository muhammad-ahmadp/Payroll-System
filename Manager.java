import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        CompanyManager companyManager = new CompanyManager();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("====  EMPLOYEE PAYROLL SYSTEM ====");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Calculate Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid choice! Enter a number from 1 to 4.");
                sc.nextLine();
                continue;
            }

            switch (choice){
                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    String employeeId = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    try {
                        System.out.print("Enter Basic Salary: ");
                        double basicSalary = sc.nextDouble();
                        System.out.print("Enter Allowances: ");
                        double allowances = sc.nextDouble();
                        System.out.print("Enter Deductions: ");
                        double deduction = sc.nextDouble();
                        sc.nextLine(); // Clear buffer

                        Employee employee = new Employee(employeeId, name, basicSalary, allowances, deduction);
                        companyManager.addEmployee(employee);
                    } catch (Exception e) {
                        System.out.println("Invalid input! Enter numbers only.");
                        sc.nextLine();
                    }
                    System.out.println("----------------------------------");
                }
                case 2 -> {
                    companyManager.displayAllEmployees();
                }
                case 3 -> {
                    System.out.print("Enter Employee ID: ");
                    String id = sc.nextLine();
                    companyManager.findEmployeeById(id);
                }
                case 4 -> {
                    exit = true;
                    System.out.println("Exiting the system...");
                }
                default -> System.out.println("Invalid choice! Enter 1-4.");
            }
        }
    }
}
