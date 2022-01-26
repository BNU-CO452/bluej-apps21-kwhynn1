/**
 * This command class for displaying the player's stats
 * 
 */
public class PlayerStatsCommand extends Command
{
    // variable for the game
    public Game game;
    // variable for the Go Command
    private GoCommand go;
    // variable for the player
    private Player player;
    
    //Constructor for the PlayerStatsCommand class
    public PlayerStatsCommand(Game game)
    {
        super(game);
    }

    //Outpus players information
    public void execute()
    {
        Player player = game.player;
        System.out.println();
        System.out.println("Player's Health " + player.getHealth());
        System.out.println("Player's score " + player.getScore());
        System.out.println("The Player is Damage ability is " + player.getDamage());
        System.out.println();
        System.out.println();
        System.out.println(KZ.MAP.getCurrentLocation().getLongDescription());
    }
}
    

