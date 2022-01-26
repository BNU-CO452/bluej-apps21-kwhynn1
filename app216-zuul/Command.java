/**
* This is class is used a template for the commands of the game
* 
*/

public abstract class Command
{
    //variable for the game
    protected Game KZ;
    //variable for command word
    protected String secondWord;

    /**
     * Constructor for Command Class
     */
    public Command(Game game)
    {
       KZ = game;
    }

    
}
