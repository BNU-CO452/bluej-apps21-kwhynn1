/**
 * Contains information about products
 * 
 * @author  Kyle Whynn
 * @version 1
 */
public class Product
{
    // product id
    private int id;
    // name of prroduct
    private String name;
    // quantity of product
    private int quantity;

    /**
     * Creates a Project object
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * gets the product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * gets the product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * gets the amount of quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * allows user to set the quantity for a product
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    /**
     * adds new stock to old stoch quantity
     */
    public void increaseQuantity(int amount)
    {
        quantity = quantity + amount;
    }
    
    /**
     * decreases the number of stock
     */
    public void decreaseQuantity(int amount)
    {
        if(quantity >= amount)
        {
            quantity = quantity - amount;
        } 
        else if (quantity ==0)
        {
            System.out.println("There is no stock to remove");
        }
    }
    
    /**
     * return the product information as a string
     */
    public String toString()
    {   
        return " ID " + id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * prints the product information
     */
    public void print()
    {
        System.out.println(toString());
    }
}