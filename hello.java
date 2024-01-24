public class hello {
    private int id;
    private String name;
    private double salary;

    public hello(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            double increaseAmount = salary * (percent / 100);
            salary += increaseAmount;
            System.out.println("Salary raised by " + percent + "%. New salary: $" + salary);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    public static void main(String[] args) {
        hello employee1 = new hello(1, "Aamir", 50000.0);

        System.out.println("Employee Details:");
        System.out.println("ID: " + employee1.getId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary: $" + employee1.getSalary());

        employee1.raiseSalary(10);

        System.out.println("Updated Salary: $" + employee1.getSalary());
    }
}