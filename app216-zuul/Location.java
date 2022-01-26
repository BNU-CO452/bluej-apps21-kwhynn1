/**
 * This class is used to create, set and print the directions the player
 * can travel in the game 
 */
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Location 
{
    // variable for description
    private String description;
    // variable for location
    private HashMap <String, Location> location; 
    
    //Constructor for Location class
    public Location(String description) 
    {
        this.description = description;
        location = new HashMap<>();
    }

    // set the direction for location
    public void setDirection(String direction, Location neighbor) 
    {
        location.put(direction, neighbor);
    }

    // returns desscription
    public String getShortDescription()
    {
        return description;
    }

    // returns description + direction in a string
    public String getLongDescription()
    {
        return " You are " + description + ".\n" + getExitString();
    }

    // returns directions in a string 
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
  
    //returns direction of location
    public Location getExit(String direction) 
    {
        return location.get(direction);
    }

     
}

