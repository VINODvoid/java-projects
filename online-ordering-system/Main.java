public class Main {
    public static void main(String[] args) {
    
        // it will help to create product inside the catalog
        CatalogManager catalogManager = new CatalogManager();
        catalogManager.addProduct(new Product(1, "Laptop", 49999.99, 10));
        catalogManager.addProduct(new Product(2, "VR Set", 12899.99, 3));
        catalogManager.addProduct(new Product(3, "Television", 12999.99, 17));

        // create a customer
        Customer customer = new Customer("kalki");

        catalogManager.displayProducts();

        customer.addToCart(catalogManager,"Laptop" ,4);
        customer.addToCart(catalogManager, "Television", 2);

        customer.viewCart();
        customer.placeOrder();


    }   
}