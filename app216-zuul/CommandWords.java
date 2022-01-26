/**
 * This class is for the commands that the will use in the game
 */
public enum CommandWords
{
    GO    ("go","Go to location in <direction>"),
    HELP  ("help", "List all available commands"),
    QUIT  ("quit", "End the game"),
    MAP   ("map", "display a map of the school"),
    STATS ("stats", "display player information");
    
    // variable for command words
    public final String word;
    public final String description;
    
    //Constructor for the ComandWord class
    CommandWords(String word, String description)
    {
        this.word = word;
        this.description = description;
    }
}
