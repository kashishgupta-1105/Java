package week2;

abstract class Employee {
    String employeeName;
    int empId;

    public abstract void calculateSalary();

    public void displayDetails() {
        System.out.println("Employee name is: " + employeeName);
        System.out.println("Employee Id is: " + empId);
    }
}
    class FullTimeEmployee extends Employee{

        @Override
        public void calculateSalary() {
            System.out.println("Salary is 2,00,0000");
        }
    }
    class PartTimeEmployee extends Employee{

        @Override
        public void calculateSalary() {
            System.out.println("Salary is 1,00,000");
        }
    }

public class AssignmentP3 {
   public static void main(String[] args){
       FullTimeEmployee e = new FullTimeEmployee();// creating subclass object.
       e.displayDetails(); // Accessing the concrete method using the subclass object.
       e.calculateSalary();

       PartTimeEmployee p = new PartTimeEmployee();
       p.calculateSalary();
   }
}


// Runtime polymorphism is achieved using method overriding. Here, we are overriding the same calculateSalary class
// in both subclasses of the Employee class.

//Runtime polymorphism is the process in which a call to an overridden method is resolved at runtime based on the object being referenced.