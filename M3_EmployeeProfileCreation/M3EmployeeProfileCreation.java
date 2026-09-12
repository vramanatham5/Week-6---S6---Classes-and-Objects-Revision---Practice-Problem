class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    void printProfile() {
        System.out.println("ID: " + empId + " | Name: " + empName
                + " | Salary: " + salary + " | Intern: " + isIntern);
    }
}

public class M3EmployeeProfileCreation {
    public static void main(String[] args) {
        Employee permanentEmployee = new Employee("E101", "Anika Sharma", 65000);
        Employee intern = new Employee("I201", "Rohan Mehta");

        permanentEmployee.printProfile();
        intern.printProfile();
    }
}