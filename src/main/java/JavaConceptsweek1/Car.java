package JavaConcepts;


// Polymorphism

class Vehicle{
    String design;

    public void vehicleDesign(){
        System.out.println("This is a vehicle");
    }
}

public class Car extends Vehicle{

    @Override
    public void vehicleDesign() {
        System.out.println("This is a car");
    }

    static void main() {
        Vehicle v2 = new Vehicle();
        // Parent class reference (Vehicle) pointing to child class object (Car)
         Vehicle v1 = new Car();

        // Calls Car's version of vehicleDesign()
        // This is runtime polymorphism (method overriding)
        v1.vehicleDesign();

        // Calls Vehicle's version of vehicleDesign()
        v2.vehicleDesign();

    }
}
