/**
* This class is for the commands to be used by the player.
* 
*/

import java.util.Scanner;
import java.util.ArrayList;

public class CommandReader 
{
    // variable for the game
    private Game game;
    // variable for the input
    private Scanner reader; 
    // variables for commands entered by the user
    private String commandWord = null;
    private String word2 = null;
   
    // Creates a Command Reader Object
    public CommandReader(Game game) 
    {
        this.game = game;
        reader = new Scanner(System.in);
    }
    
    // Gets Command From User
    public boolean getCommand() 
    {
        String inputLine;  
        
        System.out.print(" > ");
        inputLine = reader.nextLine().toLowerCase();
        
        Scanner tokenizer = new Scanner(inputLine);
        
        if(tokenizer.hasNext()) 
        {
            commandWord = tokenizer.next();      
        
            if(tokenizer.hasNext()) 
            {
                word2 = tokenizer.next();      
            }
            else word2 = null;
        }

        return executeCommand();
    }

    //Runs the Command entered by User
    private boolean executeCommand()
    {
        if(commandWord.equals(CommandWords.GO.word))
        {
            GoCommand go = new GoCommand(game, word2);
            go.execute();
        }        
        else if(commandWord.equals(CommandWords.HELP.word))
        {
            HelpCommand help = new HelpCommand(game);
            help.execute();
        }
        else if(commandWord.equals(CommandWords.QUIT.word))
        {
            return true;  
        }
        else if(commandWord.equals(CommandWords.MAP.word))
        {
           MapCommand map = new MapCommand (game);
           map.execute();
            
        }
        else if(commandWord.equals(CommandWords.STATS.word))
        {
           PlayerStatsCommand stats = new PlayerStatsCommand (game);
           stats.execute();
        }
               
        return false;
    }
}
