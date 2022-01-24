
public class PlayerStatsCommand extends Command
{
    public Game game;
    private GoCommand go;
    private Player player;
    
    public PlayerStatsCommand(Game game)
    {
        super(game);
    }

    public void execute()
    {
        Player player = sk.player;
        System.out.println();
        System.out.println("Player's Health " + player.getHealth());
        System.out.println("Player's score " + player.getScore());
        System.out.println("The Player is Damage ability is " + player.getDamage());
        System.out.println();
    }
}
    

