public class Employee {
    private String employeeId;
    private String name;
    private double basicSalary;
    private double allowances;
    private double deductions;

    public Employee (String employeeId, String name, double basicSalary, double allowances, double deductions){
        if (employeeId == null || employeeId.trim().isEmpty()
                || name == null || name.trim().isEmpty()
                || basicSalary < 0 || allowances < 0 || deductions < 0){
            throw new IllegalArgumentException("❌ Invalid input!");
        }
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    public void setEmployeeId (String employeeId){
        if (employeeId == null || employeeId.trim().isEmpty()){
            throw new IllegalArgumentException("❌ ID cannot be null or empty!");
        }
        this.employeeId = employeeId;
    }
    public void setName (String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("❌ Name cannot be null or empty!");
        }
        this.name = name;
    }
    public void setBasicSalary (double basicSalary){
        if (basicSalary < 0){
            throw new IllegalArgumentException("❌ BasicSalary must be greater than zero!");
        }
        this.basicSalary = basicSalary;
    }
    public void setAllowances (double allowances){
        if (allowances < 0){
            throw new IllegalArgumentException("❌ Allowances must be greater than zero!");
        }
        this.allowances = allowances;
    }
    public void setDeductions (double deductions){
        if (deductions < 0){
            throw new IllegalArgumentException("❌ Deductions must be greater than zero!");
        }
        this.deductions = deductions;
    }

    public String getEmployeeId () { return employeeId; }
    public String getName () { return name; }
    public double getBasicSalary () { return basicSalary; }
    public double getAllowances () { return allowances; }
    public double getDeductions () { return deductions; }

    @Override
    public String toString() {
        return String.format("ID: %s%nName: %s%nBasic Salary: %.2f%nAllowances: %.2f%nDeductions: %.2f%n",
                employeeId, name, basicSalary, allowances, deductions
        );
    }
}
