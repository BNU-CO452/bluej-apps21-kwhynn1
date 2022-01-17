
/**
 * 
 */
public class Map
{
    // variables for locations
    private Location caterteria, library, entrance, reception, hallway, admin, gym, classroom ;
    
    //variable for current location
    private Location currentLocation;

    /**
     * Creates map for game
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Creates locations for game
     */
    private void createLocations()
    {
        entrance();
        reception();
        admin(); 
        hallway();
        gym();
        library();
        classroom();
        caterteria();
        currentLocation = entrance;  // starts the player at the entrance
    }
    
    /**
     * Creates entrance location
     */
    private void entrance()
    {
        entrance = new Location("You are at the Entrance of the school");
        
    }
        
    /**
     * Creates library location
     */
    private void library()
    {
        library = new Location("Inside the school's library");
        entrance.setDirection("west",library);
        library.setDirection("east",entrance);
    }
    
    /**
     * Creates reception location
     */
    private void reception()
    {
        reception = new Location("Inside the Reception area");
           
        reception.setDirection("north",entrance);
        entrance.setDirection("south",reception); 
    }
    
    /**
     * Creates admin location 
     */
    private void admin()
    {
        admin = new Location("Inside the Admin area");

        reception.setDirection("east",admin);
        admin.setDirection("west",reception);
    }
    
    /**
     * Creates hallway location 
     */
    private void hallway()
    {
        hallway = new Location("Inside the school's hallway");

        reception.setDirection("south",hallway);
    }
    
    /**
     * Creates gym location
     */
    private void gym()
    {
        gym = new Location("Inside the school's Gym");
        
        hallway.setDirection("east",gym);
        gym.setDirection("west",hallway);
    }
    
    /**
     * Creates classroom location
     */
    private void classroom()
    {
        classroom = new Location("Inside the Classroom");
        
        gym.setDirection("south",classroom);
    }
    
    /**
     * Creates caterteria location
     */
    private void  caterteria()
    {
        caterteria = new Location("Inside the school's caterteria");
        
        caterteria.setDirection("north",entrance);
        classroom.setDirection("south",caterteria);
    }
    
    /**
     * The current location of the player
     */
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    /**
     * Allows the player to change locations
     */
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
