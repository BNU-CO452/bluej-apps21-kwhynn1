import java.util.*;

/**
* This class contains information about the different courses. Methods
* allow for printing to the terminal screen.
*
* @author  Kyle Whynn
* @version 1.0 
*/
public class Course
{
    // Code for course
    private String code;
    // Course title
    private String title;
    // Module oject
    private Module module;
    
    /**
    * Create a course object with course code and title. 
    */
        public Course(String code, String title)
    {
        this.code = code;
        this.title = title;
    }

    /**
    * Print heading to the terminal.
    */
        private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("           Course Details        ");
        System.out.println(" --------------------------------");
        System.out.println();
    }
    
    /**
    * Print the details of the course
    */
        public void print()
    {
        printHeading();
        
        System.out.println(" Course Code : " + code  );
        System.out.println(" Course Title: " +  title);
        System.out.println();
        module.print();
    }
    
    /***
    * Adds module object to course object
    */ 
        public void addModule(Module module)
    {
        this.module = module;
    }

}
