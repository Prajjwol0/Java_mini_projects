
// Employee Payroll System: Create an Employee base class, then extend it to create FullTimeEmployee, PartTimeEmployee and ContrtactEmployee. 


// Base class for all employees
class Employee {
    String name;
    int id;

    // Constructor for Employee
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to calculate salary — to be overridden
    public double calculateSalary() {
        return 0.0; // Default value
    }

    // Display basic employee info
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Full-time employee subclass
class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id); // Call base class constructor
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee subclass
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Contract employee subclass
class ContractEmployee extends Employee {
    double contractAmount;

    public ContractEmployee(String name, int id, double contractAmount) {
        super(name, id);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}

// Main class to run the app
public class PayrollApp {
    public static void main(String[] args) {
        // Create objects for each type of employee
        FullTimeEmployee emp1 = new FullTimeEmployee("Ram", 101, 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Hari", 102, 300, 20);
        ContractEmployee emp3 = new ContractEmployee("Sita", 103, 45000);

        // Store in array to demonstrate polymorphism
        Employee[] employees = { emp1, emp2, emp3 };

        // Loop through all employees and display their salaries
        for (Employee emp : employees) {
            emp.displayInfo();  // Calls method from base class
            System.out.println("Salary: ₹" + emp.calculateSalary()); // Polymorphic method
            System.out.println("----------------------------------");
        }
    }
}
