import java.util.ArrayList;
/**
 * 
 * This class is used to show the commands to the player
 * 
 */
public class HelpCommand extends Command
{
    
    
    // Constructor for HelpCommand Class
    public HelpCommand(Game game)
    {
        super(game);
    }

    /**
     * Prints out commands and thier descirptions.
     */
    public void execute()
    {
        System.out.println();
        System.out.println(" Your command words are:");
        System.out.println();
        
        for(CommandWords command : CommandWords.values())
        {
            System.out.println(" " + command.word + 
                               "\t  : " + command.description);                        
        }   
        System.out.println();
        System.out.println();
        System.out.println(KZ.MAP.getCurrentLocation().getLongDescription());
    }
}
