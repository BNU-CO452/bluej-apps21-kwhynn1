
/**
 * This command transfers the player from
 * one location to another location provided the
 * two locations are linked by a valid exit
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 */
public class MapCommand extends Command
{
   
    public MapCommand(Game game)
    {
        super(game);
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and
     * a list of the command words.
     */
    public void execute()
    {
        System.out.println();
        System.out.println("Here is a Map of the School, stay safe!");
        System.out.println();
        System.out.println("[Library]<---->[Entrance]");
        System.out.println("                    |    ");
        System.out.println("               [Reception]<---->[Admin]");
        System.out.println("                    |    ");
        System.out.println("               [Hallways]<---->[Gym]");
        System.out.println("                                 |     ");
        System.out.println("                            [Classroom]");
        System.out.println("                                 |     ");
        System.out.println("                             [Entrance]");
    }
}
    

