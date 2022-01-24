import java.util.Scanner;
import java.util.ArrayList;

public class CommandReader 
{
    private Game game;
    private Scanner reader; 

    private String commandWord = null;
    private String word2 = null;
   
    public CommandReader(Game game) 
    {
        this.game = game;
        reader = new Scanner(System.in);
    }
    
    
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
