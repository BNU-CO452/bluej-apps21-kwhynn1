
/**
 * This class contains information about the module marks.
 * Methods allow for the setting and printing of module details.
 *
 * @author  Kyle Whynn
 * @version 1
 */
public class ModuleMark
{
    private int mark ;
    public Module module;
    private Course course;
  
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
        System.out.print(module.getCode() + "\t " + module.getTitle() + "\t\t " + module.getCreditValue() + "\t " + getValue() + " ");
    }
     
    
}
