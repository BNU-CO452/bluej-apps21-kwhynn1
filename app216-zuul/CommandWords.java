
public enum CommandWords
{
    GO   ("go","Exit location in <direction>"),
    TAKE ("take", "Take <item> from location"),
    HELP ("help", "List all available commands"),
    QUIT ("quit", "End the game"),
    MAP  ("map", "display a map of thw school"),
    STATS ("stats", "display player information");
    
    public final String word;
    public final String description;
    
    CommandWords(String word, String description)
    {
        this.word = word;
        this.description = description;
    }
}
