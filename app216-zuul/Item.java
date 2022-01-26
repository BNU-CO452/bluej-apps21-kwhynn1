
public class Item
{
    // variable for item's vaue
    private int value;
    // variable for item's name
    private String name;
    // variable for item's type
    private String type;    

    // Constructor for objects of class Item
    public Item(String name, String type, int value)
    {
         this.name = name;
         this.type = type;
         this.value = value;
    }

    // Return Item's value
     public  int getValue ()
    {
        return value;
    }
    
    // Return Item's Name
     public  String getName ()
    {
        return name;
    }
    
    // Return Item's Type
    public  String getType ()
    {
        return type;
    }
}
