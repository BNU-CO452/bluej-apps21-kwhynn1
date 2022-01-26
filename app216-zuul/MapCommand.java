
/**
 * This class is for the map command. It outputs a map to the user
 */
public class MapCommand extends Command
{
   
    // Constructor for MapCommand Class
    public MapCommand(Game game)
    {
        super(game);
    }

    // Shows the user a map
    public void execute()
    {
        System.out.println();
        System.out.println("Here is a Map of the School, stay safe!");
        System.out.println();
        System.out.println("[Library]<---->[Entrance]");
        System.out.println("                    |    ");
        System.out.println("               [Reception]<---->[Admin]");
        System.out.println("                    |    ");
        System.out.println("               [Hallways]---->[Gym]");
        System.out.println("                                 |     ");
        System.out.println("                            [Classroom]");
        System.out.println("                                 |     ");
        System.out.println("                             [Entrance]");
        System.out.println();
        System.out.println();
        System.out.println(KZ.MAP.getCurrentLocation().getLongDescription());
    }
}
    

