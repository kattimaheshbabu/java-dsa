// Encapsulation in Java
// Encapsulation is a mechanism of wrapping the data and methods together into a single unit

public class Encapsulation {
    
    // Private variables - cannot be accessed directly from outside
    private String name;
    private int age;
    private double salary;
    
    // Constructor
    public Encapsulation(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
    
    // Getter for salary
    public double getSalary() {
        return salary;
    }
    
    // Setter for salary with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    
    public static void main(String[] args) {
        // Creating object
        Encapsulation employee = new Encapsulation("John", 30, 50000);
        
        // Accessing data through getters
        System.out.println("Initial Data: " + employee);
        
        // Modifying data through setters
        employee.setName("Jane");
        employee.setAge(28);
        employee.setSalary(60000);
        
        System.out.println("Updated Data: " + employee);
        
        // Invalid input - setter will reject
        employee.setAge(150);
        employee.setSalary(-5000);
    }
}
