import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * 
 * @author Kyle Whynn
 * @version 1
 */
public class StockList
{
    // Prodcut object
    private ArrayList<Product> stock;

    /**
     * Create stock list for products.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Adds items to stocklist
     */
    public void add(Product item)
    {   
            stock.add(item);   
    }
     
    /**
     * Increases stock quantity for products
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product == null)
        {
            System.out.println("NOT FOUND");  
        }
        else
        {
             product.increaseQuantity(amount);
        } 
    }
    
    /**
     * Search for product using product id and return product object.
     */
    public Product findProduct(int productID)
    {
         for(Product product : stock)
        {
            if(product.getID() == productID)
            {
                return product;
            }
            
        }
        
        return null;
    }
    
    /**
     * Search for product using product id and return product id.
     */
    public int findProductID(int productID)
    {
        int find=0;
        
        for(Product product : stock)
        {
            if(product.getID() == productID)
            {
               find = product.getID();
            }
            else
            {
               find=find;
            }
        }
          
         return find;
    }
    
    /**
     * Decreases stock quanitiy for a product
     */
    public void sellProduct(int productID, int sellQuantity)
     {
        System.out.println("Selling Stock\n");
        
        Product product = findProduct(productID);
        int stockQuantity = product.getQuantity();
        
        if(product != null) 
        {
            if(stockQuantity > 0)
            {
                if(stockQuantity > sellQuantity)
                {
                    product.decreaseQuantity(sellQuantity);
                    System.out.println("Selling " + sellQuantity + " " + product.getID());
                    
                }
                else
                {
                    System.out.println("All stock is sold!!");
                    System.out.println("Selling " + stockQuantity + " " + product.getID());
                    product.decreaseQuantity(stockQuantity);
                }
                
            }
            else
            {
                System.out.println("No Stock " + product.getID());
            }
        }
    }    

    /**
     * Prints products low stock (lower than 3)
     */
    public void LowStock()
    {
        System.out.println("Products With Low Stock");
        System.out.println("");
        
        for(Product product : stock)
        {
            if(product.getQuantity() < 3 )
            {
                 System.out.println(product);
            }
        }
    }
    
    /**
     * Buys 4 Stock for products with low stock (lower than 3) 
     */
    public void reStock()
    {
        System.out.println("");
        int restock = 4;
        for(Product product : stock)
        {
            if(product.getQuantity() < 3 )
            {
              product.increaseQuantity(restock);
              System.out.println("Product is reStock");
            } 
            else
            {
             System.out.println("Product has enough Stock");
            }
        }
    }
    
    /**
     * Allows user to search for
     * product by name
     */
    public void search(String phrase)
    {
         for(Product product : stock)
        {
           String productname=product.getName();
           
            if(productname.contains(phrase))
            {
                 System.out.println(product);
            } 
            else
            {
                 System.out.println ("Product Not Found");
            }
        }
    }
    
    /**
     * Allows user to remove product from stock list
     * Input is the last number of the i
     */
      public void RemoveProduct(int value)
    {    
        Product product = findProduct(value);
        if(product != null)
        {
                 System.out.println("Product Is Removed");
                 stock.remove(product);
        } 
        else
        {
                 System.out.println ("Product Not Found");
        } 
    }
    
    /**
     * prints stock list with products
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock list
     */
    public void print()
    {
        printHeading();
        for(Product product : stock)
        {
            System.out.println(product);
        }
    }
    
    /**
     *Prints a heading above stock output 
     */
    private void printHeading()
    {
        System.out.println();
        System.out.println(" Kyle's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}