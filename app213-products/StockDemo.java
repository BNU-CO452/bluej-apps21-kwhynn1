import java.util.Random;
/**
 * This class is a demo used for testing, inlcudes methods from
 * the Stocklist class.
 * 
 * Author   Kyle Whynn
 * @version 1
 */
public class StockDemo
{
    // Stocklist object
    private StockList stock;
    
    /**
     * Creates a 10 projects.
     * 
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        stock.add(new Product(100, "Samsung Galaxy S9"));
        stock.add(new Product(101, "PSP"));
        stock.add(new Product(102, "PS Vita"));
        stock.add(new Product(103, "Xbox"));
        stock.add(new Product(104, "PS3"));
        stock.add(new Product(105, "PS5"));
        stock.add(new Product(106, "IPhone"));
        stock.add(new Product(107, "IPOD"));
        stock.add(new Product(108, "Acer PC"));
        stock.add(new Product(109, "Dell PC"));
    }
    
    /**
     * Runs functions where products are sold and bought. The result
     * after each is printed on the screen.
     */
    public void runDemo()
    { 
        stock.print();
        buyProducts();
        stock.print();        
        sellProducts();
        stock.print();        
    }
    
    /**
     * Buys a number of products based on the value
     * given
     */
    public void buyProducts()
    {
       stock.buyProduct(101,10);
       stock.buyProduct(102,1);
       stock.buyProduct(103,4);
       stock.buyProduct(104,3);
       stock.buyProduct(105,2);
       stock.buyProduct(106,8);
       stock.buyProduct(107,6);
       stock.buyProduct(108,7);
       stock.buyProduct(109,2);
       stock.buyProduct(110,1);
    }

    /**
     * Sells a number of proudces based on the number generated
     */
    public void sellProducts()
      {
        Product product;
        int quantity = 1;
        
        for(int id = 101; id <= 110; id++)
        {
            product = stock.findProduct(id);
            
            if(product == null)
            {
                System.out.println("Product " + id + " Not found");
            }
            else
            {
               stock.sellProduct(id, quantity);
            }
        }
        
    }     
}