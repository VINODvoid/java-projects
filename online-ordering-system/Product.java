public class Product{
    int ID;
    String name;
    double price; 
    int  stock;

    Product(int ID , String name , double price , int stock){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getID()
    {
        return this.ID;
    }

    public int getStock()
    {
        return this.stock;
    }

    public String getName()
    {
        return this.name;
    }

    public double getPrice()
    {
        return this.price;
    }
    public void reduceStock(int quantity)
    {
        if(quantity <= this.stock )
        {
            this.stock -=quantity;
        }
        else{
            System.out.println("Stock is Empty");
        }
    }
    @Override
    public String toString()
    {
        return this.ID+" | "+this.name+" | "+this.price+" | "+this.stock;
    }
}
