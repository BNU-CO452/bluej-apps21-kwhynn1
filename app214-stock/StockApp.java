
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
        
        return false;
    }
   
    /**
     * Adds the product entered by the
     * user to the stocklist
     */
    private void addProduct()
    {
        System.out.println("Add New Product");
        System.out.println();  
        int id = reader.getInt("Enter Product ID");
        String name = reader.getString("Enter Product Name");
        Product product = new Product (id, name);
        stock.add(product);
    }
    
    /**
     * Prints the user choices 
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the program title and the author name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Kyle");
        System.out.println("********************************");
    }
}