import java.util.HashMap;
import java.util.Map;

public class CatalogManager {
    private Map<Integer,Product> catalog = new HashMap<>();

    public void addProduct(Product product )
    {
        catalog.put(product.ID, product);
    }
    public Product getProductByName(String name) {
        for (Product p : catalog.values()) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
    public void displayProducts()
    {
        System.out.println("Products Catalog");
        for(Product product : catalog.values())
        {
            System.out.println(product);
        }
    }
    public Product getProductbyId(int id)
    {
        return catalog.get(id);
    }

    public boolean hasProduct(int id)
    {
        return catalog.containsKey(id);
    }
}
