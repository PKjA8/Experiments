class Product {
    private String productId;
    private String name;
    private String categoryId;
    private double unitPrice;

    public Product(String productId, String name, String categoryId, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Category ID: " + categoryId);
        System.out.println("Unit Price: $" + unitPrice);
    }
}

class ElectricalProduct extends Product {
    private String voltageRange;
    private int wattage;

    public ElectricalProduct(String productId, String name, String categoryId, double unitPrice, String voltageRange, int wattage) {
        super(productId, name, categoryId, unitPrice); 
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    public String getVoltageRange() {
        return voltageRange;
    }

    public void setVoltageRange(String voltageRange) {
        this.voltageRange = voltageRange;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    // Method to update wattage and price
    public void updateWattageAndPrice(int newWattage, double newPrice) {
        this.wattage = newWattage;
        this.setUnitPrice(newPrice); 
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Display details of the Product (superclass)
        System.out.println("Voltage Range: " + voltageRange);
        System.out.println("Wattage: " + wattage + " watts");
    }
}

public class Product_Demo {
    public static void main(String[] args) {

        ElectricalProduct electricalProduct = new ElectricalProduct("EP0", "Electric Heater", "E04", 15.00, "110V-240V", 1500);

        System.out.println("Initial Product Details:");
        electricalProduct.displayDetails();

        // Update wattage and price
        electricalProduct.updateWattageAndPrice(2000, 180.00);

        System.out.println("\nUpdated Product Details:");
        electricalProduct.displayDetails();
    }
}

