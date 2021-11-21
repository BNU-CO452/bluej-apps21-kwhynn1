
/**
 * This class is used to run the program
 * with a user interface.
 *
 * @author  Kyle Whynn
 * @version 1
 */
public class Program
{
    //StockApp Object  
    private static StockApp app;
    
    //Used to run the Stock progam
    public static void main(String[] args)
    {
        app = new StockApp();
        app.run();
    }
}
