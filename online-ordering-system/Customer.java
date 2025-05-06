import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    public void viewCart()
    {
        if(cart.isEmpty())
        {
            System.out.println("Cart is Empty");

        }
        else{
            System.out.println(name +" 's Cart : ");
            for(Product product : cart)
            {
                System.out.println(product);
            }
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
            System.out.println("Total Amount is "+total);
            cart.clear();
        }
    }
}

