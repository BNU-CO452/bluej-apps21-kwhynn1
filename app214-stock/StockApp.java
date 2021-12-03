
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Kyle Whynn
 * @version 1
 */
public class StockApp
{
    //Inputreader object
    private InputReader reader;
    //Stocklist object
    private StockList stock;
    
    /**
     * Creates for objects for class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of choices and runs
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    /**
     * Runs the choice selected by the
     * user
     */
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            RemoveProduct();
        }
         else if(choice.equals("low stock"))
        {
            stock.LowStock();
        }
        else if(choice.equals("restock"))
        {
            stock.reStock();
        }
        else if(choice.equals("search"))
        {
            search();
        }
        else if(choice.equals("buy"))
        {
            buyProduct();
        }
        else if(choice.equals("sell"))
        {
            sellProduct();
        }
        
        
        return false;
    }
   
    /**
     * Buys a certain amount of 
     * stock for a product 
     */
    private void buyProduct()
    {
        System.out.println("Buy New Product");
        System.out.println();  
        int id = reader.getInt("Enter Product ID ");
        int amount = reader.getInt("Enter Amount ");
         if (stock.findProductID(id) == id )
        {
            System.out.println(""); 
            System.out.println("The Stock has been bought"); 
            stock.buyProduct(id,amount);
        }
        else
        {   System.out.println(""); 
            System.out.println("Invalid Product ID"); 
        }
        
    }
    
    /**
     * Buys a sell amount of 
     * stock for a product
     */private void sellProduct()
    {
        System.out.println("Sell Product");
        System.out.println();  
        int id = reader.getInt("Enter Product ID ");
        int amount = reader.getInt("Enter Amount to be Sold");
         if (stock.findProductID(id) == id )
        {
            System.out.println(""); 
            System.out.println("The Stock has been Sold"); 
            stock.sellProduct(id,amount);
        }
        else
        {   System.out.println(""); 
            System.out.println("Invalid Product ID"); 
        }
        
    }
    
    
    /**
     * Adds the product entered by the
     * user to the stocklist
     */
    private void addProduct()
    {
        System.out.println("Add New Product");
        System.out.println();  
        int id = reader.getInt("Enter Product ID ");
        String name = reader.getString("Enter Product Name ");
        Product product = new Product (id, name);
        if (stock.findProductID(id) == id )
        {
            System.out.println(""); 
            System.out.println("The ID is already in The System"); 
        }
        else
        {
            stock.add(product);
        }
    }
    
    /**
     * Search for a product in the stock list
     */
    private void search()
    {
        System.out.println("");
        System.out.println("Search Products ");
        System.out.println();  
        String name = reader.getString("Enter Product Name ");
        stock.search(name);
    }
    
    /**
     * Removes a product in the stock list
     */
    private void RemoveProduct()
    {
        System.out.println("Remove ID");
        System.out.println();  
        int id = reader.getInt("Enter Product ID ");
        if (stock.findProductID(id) == id )
        {
            System.out.println(""); 
            stock.RemoveProduct(id);
            System.out.println("The Product is removed from the System"); 
        }
        else
        {
            System.out.println("The Product is not in the System "); 
        }
    }
    
    
    /**
     * Prints the user choices 
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Low Stock:  Print Products with Low Stock");
        System.out.println("    Restock:    Restock Products with Low Stock");
        System.out.println("    Search:     Search For Products");
        System.out.println("    Print:      Print all products");
        System.out.println("    Buy:        Buy Stock products");
        System.out.println("    Sell:       Sell Stock");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the program title and the author name
     */
    private void printHeading()
    {
        System.out.println("");
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Kyle");
        System.out.println("********************************");
    }
}