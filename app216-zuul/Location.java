import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;


public class Location 
{
    private String description;
    private HashMap <String, Location> location; 
    
    public Location(String description) 
    {
        this.description = description;
        location = new HashMap<>();
    }


    public void setDirection(String direction, Location neighbor) 
    {
        location.put(direction, neighbor);
    }

    
    public String getShortDescription()
    {
        return description;
    }


    public String getLongDescription()
    {
        return " You are " + description + ".\n" + getExitString();
    }

  
    private String getExitString()
    {
        String returnString = " Directions:";
        Set<String> keys = location.keySet();
        
        for(String exit : keys) 
        {
            returnString += " " + exit;
        }
        return returnString;
    }

   
    public Location getExit(String direction) 
    {
        return location.get(direction);
    }

     
}

