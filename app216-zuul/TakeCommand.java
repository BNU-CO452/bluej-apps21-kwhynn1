
public class TakeCommand extends Command
{
    String item;
    
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String item)
    {
        super(zuul);
        this.item = item;
    }    

    public void execute()
    {
        if(item == null) 
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Take what?");
            return;
        }

        Map map = sk.MAP;
        // remove the item from the current room
        // and add it to the player's inventory
        // Print out a suitable message.
    }
}
