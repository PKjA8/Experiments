abstract class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void displayModel() {
        System.out.println("Car model: " + model);
    }

    abstract void avg();
    abstract void mode();
}

class Maruti extends Car {
    Maruti(String model) {
        super(model);
    }

    void avg() {
        System.out.println(model + " average is 80 km/l");
    }

    void mode() {
        System.out.println(model + " mode: Automatic");
    }
}

class Santro extends Car {
    Santro(String model) {
        super(model);
    }

    void avg() {
        System.out.println(model + " average is 60 km/l");
    }

    void mode() {
        System.out.println(model + " mode: Manual");
    }
}

public class Car_Design {
    public static void main(String[] args) {
        Car car1 = new Maruti("Toyota Fortuner");
        Car car2 = new Santro("Mahindra Scorpio");

        car1.displayModel();
        car1.avg();
        car1.mode();

        System.out.println();

        car2.displayModel();
        car2.avg();
        car2.mode();
    }
}
