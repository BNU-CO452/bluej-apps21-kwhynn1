/*
 * 
 * This is the main class for the game. The game is run in a loop using a boolean value.
 * 
 */

public class Game 
{
    //Constant For Map boject
    public final Map MAP;
    //variable for input
    private CommandReader reader;
    //varibale used for game loop
    private boolean gameOver;
        
    /**
     * Starts the game and creates a new map/
     */
    public Game() 
    {
        MAP = new Map();
        reader = new CommandReader(this);
    }

    /**
     *  Runs game until boolean value is true.
     */
    public void play() 
    {            
        Message();
        gameOver = false;
                
        while (! gameOver) 
        {
            gameOver = reader.getCommand();
        }
        
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void Message()
    {
        System.out.println();
        System.out.println(" You're a Janitor and Zombies have infested your school. Git rid of dem before school sarts!");
        System.out.println(" Type 'help' if you need help.");
        System.out.println();
        System.out.println(MAP.getCurrentLocation().getLongDescription());
    }
}
