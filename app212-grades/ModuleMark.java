
/**
 * This class contains information about the module marks.
 * Methods allow for the setting and printing of module details.
 *
 * @author  Kyle Whynn
 * @version 1
 */
public class ModuleMark
{
    private int mark = 0;
    public Module module;
    
    /**
     * Constructor for Module MArk objects 
     */
    public ModuleMark(Module module)
    {
        this.module = module;   
    }
    
    /**
     * Get course code
     */ 
    public int getValue()
    {
        return mark;
    }
    
    /**
     * Sets mark for a module
     */ 
    public void setMark(int mark)
    {
        this.mark = mark;
    }
    
    /**
     * Prints out the details of the module object
     */ 
    public void print () 
    {
    
        System.out.println("Module Code : " + module.getCode() + " Module Title: " + module.getTitle() + " Credit Value: " + module.getCreditValue() + " Module Mark: " + getValue());
    
    }
    
    
}
