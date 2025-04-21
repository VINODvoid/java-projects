class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product {
    private String brand;
    private int warranty;

    public Electronics(String name, double price, String brand, int warranty) {
        super(name, price);
        this.brand = brand;
        this.warranty = warranty;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty (months): " + warranty);
    }
}
class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Product eProduct = new Electronics("Laptop", 1000.0, "Dell", 12);
        Product cProduct = new Clothing("T-Shirt", 25.0, "L", "Cotton");

        eProduct.displayDetails();
        System.out.println();
        cProduct.displayDetails();
    }
}