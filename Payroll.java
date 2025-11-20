public class Payroll {

    private Employee employee;

    public Payroll(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null!");
        }
        this.employee = employee;
    }

    public double calculateGrossSalary() {
        return employee.getBasicSalary() + employee.getAllowances();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - employee.getDeductions();
    }

    @Override
    public String toString() {
        return String.format("Basic Salary: %.2f%nAllowances: %.2f%nDeductions: %.2f%nGross Salary: %.2f%nNet Salary: %.2f%n",
                employee.getBasicSalary(), employee.getAllowances(), employee.getDeductions(), calculateGrossSalary(), calculateNetSalary()
        );
    }
}
