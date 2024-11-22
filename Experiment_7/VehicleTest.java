
class Vehicle {
    String name;
    String type;

    Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void maxSpeed() {
        System.out.println("Maximum speed is undefined for " + type);
    }
}

class Car extends Vehicle {
    int speed;

    Car(String name, int speed) {
        super(name, "Car"); 
        this.speed = speed;
    }

    @Override
    void maxSpeed() {
        System.out.println("The maximum speed of the car " + name + " is " + speed + " km/h");
    }
}

class Bicycle extends Vehicle {
    int speed;

    // Constructor for Bicycle class
    Bicycle(String name, int speed) {
        super(name, "Bicycle");  
        this.speed = speed;
    }

    @Override
    void maxSpeed() {
        System.out.println("The maximum speed of the bicycle " + name + " is " + speed + " km/h");
    }
}

class Scooter extends Vehicle {
    int speed;

    Scooter(String name, int speed) {
        super(name, "Scooter");  
        this.speed = speed;
    }

    // Override maxSpeed method for Scooter
    @Override
    void maxSpeed() {
        System.out.println("The maximum speed of the scooter " + name + " is " + speed + " km/h");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", 250);
        Bicycle bicycle = new Bicycle("Mountain Bike", 45);
        Scooter scooter = new Scooter("Honda Activa", 80);

        car.maxSpeed();
        bicycle.maxSpeed();
        scooter.maxSpeed();
    }
}
