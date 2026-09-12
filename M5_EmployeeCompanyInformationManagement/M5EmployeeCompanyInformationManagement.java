class Employee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount;

    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee count: " + employeeCount);
    }
}

public class M5EmployeeCompanyInformationManagement {
    public static void main(String[] args) {
        new Employee("Aarav Singh", 55000);
        new Employee("Meera Patel", 62000);
        new Employee("Kabir Rao", 58000);

        Employee.printCompanyInfo();
    }
}