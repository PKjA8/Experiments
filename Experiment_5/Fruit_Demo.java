class Fruit {
    String Name;
    String type;
    float price;

    public Fruit(String name, String type, float price) {
        this.Name = name;
        this.type = type;
        this.price = price;
    }

    public void displayFruit() {
        System.out.println("Fruit Name : " + Name);
        System.out.println("Fruit Type : " + type);
        System.out.println("Fruit Price : " + price);
    }
}

public class Fruit_Demo {

    public static void main(String[] args) {

        Fruit f1 = new Fruit("Apple", "Single", (float) 98.87);
        f1.displayFruit();
    }
}
