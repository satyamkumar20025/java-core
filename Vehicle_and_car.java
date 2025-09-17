package Single_Inheritance_Question;

public class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Brand: " + brand);
    }

    // Add this method below:
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "Gol");
        myCar.start();
        myCar.drive();
    }
}

class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    void drive() {
        System.out.println("Driving " + brand + " " + model);
    }
    

}
