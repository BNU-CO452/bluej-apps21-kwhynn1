public abstract class Command
{
    protected Game sk;
    protected String secondWord;

    /**
     * Constructor for objects of class ZuulCommand
     */
    public Command(Game game)
    {
        sk = game;
    }

    public abstract void execute();
}
