public class ClothingItem {
    private String name;
    private double price;

    public ClothingItem (String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    //setup for the name and price
    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
    //get the name and price for enter
    @Override
    public String toString()
    {
        return this.name + " " + this.price;

    }
}
//return for name and price