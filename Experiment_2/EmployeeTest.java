class Employee {
    private String name;
    private String lastName;
    private double monthlySalary;

    public Employee(String name, String lastName, double monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        this.monthlySalary = Math.max(monthlySalary, 0); 
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100);
    }

    public void displaySalary() {
        System.out.printf("%s %s: Yearly Salary = %f%n", name, lastName, getYearlySalary());
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Amit", "Kumar", 15000);
        Employee emp2 = new Employee("Sumit", "Jat", 20000);

        System.out.println("Initial Yearly Salaries:");
        emp1.displaySalary();
        emp2.displaySalary();

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nYearly Salaries After 10% Raise:");
        emp1.displaySalary();
        emp2.displaySalary();
    }
}
