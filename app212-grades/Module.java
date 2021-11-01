/**
* This class contains information about the different
* modules. Methods allows for the getting and printing of 
* information.
* 
* @author Kyle Whynn
* @version 1
*/
public class Module
{
    // credit value for module
    private int creditvalue=15;
    // code for module
    private String code;
    // title for module
    private String title;
    // Module Mark object
    private ModuleMark modulemark;
    // Course Object
    Course course;
    
    /**
     * This constructor creates a student object with a
     * fixed module code and title. 
     */
    public Module() 
    {
        this("CO452", "Programming Concepts");
    }
    
    /**
     * Create a module object with module code and title.
     */
    public Module(String code,String title)
    {
        this.code=code;
        this.title=title;      
    }
       
    /**
     * Get module code String
     */
    public String getCode()
    {
        return code;  
    }
    
    /**
     * Get module title String
     */ 
    public String getTitle()
    {
        return title;
    }
    
    /** 
     * Get module credit value
     */
    public int getCreditValue()
    {
        return creditvalue;
    }
    
    /** 
     * set credit value of a module
     */
    public void setCreditvalue(int creditvalue)
    {  
        this.creditvalue=creditvalue;
    }

    /**
     * Print the details of the module
     */
    public void print()
    {    
        System.out.println("Module Code : " + getCode() + " Module Title: " + getTitle() + " Credit Value: " + getCreditValue());
    }
}
