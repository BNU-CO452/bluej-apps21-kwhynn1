
public class Item
{
    // instance variables - replace the example below with your own
    private int value;
    private String name;
    private String type;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String type, int value)
    {
         this.name = name;
         this.type = type;
         this.value = value;
    }

    public int getValue ()
    {
        return value;
    }
    
    public String getName (){
        return name;
    }
    
    public String getType (){
        return type;
    }
}
