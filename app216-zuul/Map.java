
/**
 * 
 */
public class Map
{
    // variables for locations
    private Location caterteria, library, entrance, reception, hallway, admin, gym, classroom ;
    
    //variable for current location
    private Location currentLocation;
 
    private Game game;
    
    private Item item;
    
    private Enemy enemy;
    
    
    
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
        createEntrance();
        createReception();
        createAdmin(); 
        createHallway();
        createGym();
        createLibrary();
        createClassroom();
        createCaterteria();
        
    }
    
    /**
     * Creates entrance location
     */
    private void createEntrance()
    {
        entrance = new Location("You are at the Entrance of the school");  
        currentLocation = entrance; 
    }
        
    /**
     * Creates library location
     */
   public void createLibrary()
    {
        library = new Location("Inside the school's library");
        entrance.setDirection("west",library);
        library.setDirection("east",entrance);
    }
    
    /**
     * Creates reception location
     */
    private void createReception()
    {
        reception = new Location("Inside the Reception area");
        reception.setDirection("north",entrance);
        entrance.setDirection("south",reception); 
    }
    
    /**
     * Creates admin location 
     */
    private void createAdmin()
    
    {
        admin = new Location("Inside the Admin area");
        reception.setDirection("east",admin);
        admin.setDirection("west",reception);
    }
    
    /**
     * Creates hallway location 
     */
    private void createHallway()
    {
        hallway = new Location("Inside the school's hallway");
        reception.setDirection("south",hallway);
    }
    
    /**
     * Creates gym location
     */
    private void createGym()
    {
        gym = new Location("Inside the school's Gym");
        hallway.setDirection("east",gym);
        gym.setDirection("west",hallway);
    }
    
    /**
     * Creates classroom location
     */
    private void createClassroom()
    {
        classroom = new Location("Inside the Classroom");
        gym.setDirection("south",classroom);
    }
    
    /**
     * Creates caterteria location
     */
    private void  createCaterteria()
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
    
    public  void addItem (Item item)
    {
        this.item = item;
    }
    
    public Item getItem()
    {
    return item;
    }
    
    public  void addEnemy (Enemy enemy)
    {
        this.enemy = enemy;
    }
    
    
    
}
