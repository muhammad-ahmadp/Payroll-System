import java.util.ArrayList;
public class CompanyManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee (Employee employee){
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employee.getEmployeeId())) {
                System.out.println("Employee ID already exists!");
                return;
            }
        }
        employees.add(employee);
        System.out.println("Employee Added Successfully!");
    }

    public void displayAllEmployees(){
        System.out.println("===== All Employees =====");
        for (Employee employee : employees){
            System.out.println(employee.toString());
        }
        System.out.println("-------------------------");
    }

    public void findEmployeeById(String id){
        for (Employee employee : employees){
            if (employee.getEmployeeId().equals(id)){
                Payroll payroll = new Payroll(employee);
                System.out.println("--- Salary Details ---");
                System.out.println(payroll.toString());
                return;
            }
        }
        System.out.println("Employee ID not found!");
    }


}
