import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Customer {
    private String name;
    private List<Product>cart;

    Customer(String name)
    {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    
    
    public void addToCart(CatalogManager catalogManager ,String productName, int quantity)
    {
        Product product = catalogManager.getProductByName(productName);
        if (product == null) {
            System.out.println("Product not found");
            return;
        }
        if (product.getStock() >= quantity) {
            for (int i = 0; i < quantity; i++) {
                cart.add(product);
            }
            product.reduceStock(quantity);
            System.out.println(quantity + " " + product.getName() + " added to cart.");
        } else {
            System.out.println("Not enough stock");
        }
    }

    public void removeCart(Product product , int quantity)
    {
        int count = 0;
        Iterator <Product> iterator =  cart.iterator();
        while(iterator.hasNext() && count<1)
        {
            if(iterator.next().getID() == product.getID())
            {
                iterator.remove();
                count++;
            }
        }
        System.out.println(count + " " + product.getName() + " removed from cart.");
        
    }
    public void viewCart() {
    if (cart.isEmpty()) {
        System.out.println("Cart is Empty");
        return;
    }

    System.out.println(name + "'s Cart:");

    // Map to track quantity of each product
    Map<String, Integer> itemCount = new HashMap<>();
    Map<String, Double> itemPrice = new HashMap<>();

    for (Product product : cart) {
        itemCount.put(product.getName(), itemCount.getOrDefault(product.getName(), 0) + 1);
        itemPrice.put(product.getName(), product.getPrice());
    }

    for (String productName : itemCount.keySet()) {
        int quantity = itemCount.get(productName);
        double price = itemPrice.get(productName);
        System.out.printf("%s (x%d) - ₹%.2f each\n", productName, quantity, price);
    }
}

    public void placeOrder()
    {
        if(cart.isEmpty())
        {
            System.out.println("Lets Shop first ! ;)");
        }
        else{
            double total =0;
            System.out.println("Order Placed successfully of "+name +" !");
            for(Product product : cart)
            {
                total +=product.getPrice();
            }
            System.out.printf("Total Amount is %.2f",total);
            System.out.println();
            cart.clear();
        }
    }
}

