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
    @Override
    public String toString()
    {
        return this.ID+" | "+this.name+" | "+this.price+" | "+this.stock;
    }
}
