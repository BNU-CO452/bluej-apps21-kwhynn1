
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
    private int creditvalue=0;
    // code for module
    private String code;
    // title for module
    private String title;
    
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
        public String Getcode()
    {
        return code;
    }
    
    
    /**
    * Get module title String
    */ 
        public String Gettitle()
    {
        return title;
    }
    
    /** 
    * Get module credit value
    */
        public int GetCreditvalue()
    {
        return creditvalue;
    }
    
    /** 
    * set credit value of a module
    */
        public void SetCreditvalue(int creditvalue)
    {
      this.creditvalue=creditvalue;
    }
    
    /**
    * Print heading to the terminal.
    */
        private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("           Module Details        ");
        System.out.println(" --------------------------------");
        System.out.println();
    }
    
    /**
    * Print the details of the module
    */
         public void print()
    {
        printHeading();
        
        System.out.println("Module Code : " + code);
        System.out.println("Module Title: " + title);
        System.out.println("Credit Value: " + creditvalue);
        System.out.println();
    }
}
