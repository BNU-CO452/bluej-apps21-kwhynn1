import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 
 */

public class Location 
{
    private String description;
    private HashMap <String, Location> location;        

    /**
     * Create a location described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     */
    public Location(String description) 
    {
        this.description = description;
        location = new HashMap<>();
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setDirection(String direction, Location neighbor) 
    {
        location.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return " You are " + description + ".\n" + getExitString();
    }

    /**
     * Return a string describing the locations's exits, 
     * for example "Exits: north west".
     */
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

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Location getExit(String direction) 
    {
        return location.get(direction);
    }
}

