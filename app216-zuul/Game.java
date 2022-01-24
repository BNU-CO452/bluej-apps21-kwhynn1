import java.util.Scanner;


public class Game 
{
    //Constant For Map boject
    public final Map MAP;
    //variable for input
    private CommandReader reader;
    //varibale used for game loop
    private boolean gameOver;
    
    public Player player;
    
    public Enemy enemy;
        
    /**
     * Starts the game and creates a new map/
     */
    public Game() 
    {
        MAP = new Map();
        reader = new CommandReader(this);
        player = new Player();
        enemy = new Enemy();
    }

    /**
     *  Runs game until boolean value is true.
     */
    public void play() 
    {            
            
        Message();
        gameOver = false;
        player.increaseHealth(100);
        player.increaseDamage(10);
        
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
        System.out.println(" Kill All The Zombies In Your School, be careful not to die!");
        System.out.println(" Zombies = 5 points, You need 15 to win!"+ " Be careful how You Travel!");
        System.out.println(" Type 'help'to see commands.");
        System.out.println();
        System.out.println(MAP.getCurrentLocation().getLongDescription());      
    }
        
    }


    
    

