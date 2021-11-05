import java.util.*;

/**
* This class contains information about the different courses. Methods
* allow for adding of modules and printing of the course and module information.
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
    // Constant for modules to be entered
    public final static int MAXN_MODULES = 4;
    // array for modules
    public ArrayList<Module> modules= new ArrayList<Module>();
    // array for marks
    private ArrayList<ModuleMark> marks;
    // final grade for modules
    private Grades grade;
    // Object for module
    private Module module;
    // Object for Module Mark
    private ModuleMark modulemark;
    
    /**
     *This constructor creates a student object with a
     *fixed course code and title. 
     */
    public Course()
    {
        this("BT1CWD1", "BSc Computing & Web");
        createModules();
    }
    
    /**
     *Create a course object with course code and title. 
     */
    public Course(String code, String title)
    {
        this.code = code;
        this.title = title;
    }
    
    /**
     *Print the details of the course
     */
    public void print()
    {   
        System.out.println("Course Code : " + code + " Course Title: " +  title);
    }
   
    /**
     * Get course code
     */ 
    public String getCode()
    {
      return code;
    }
    
    /**
     *Get course title
     */
    public String getTitle()
    {
      return title;
    }
    
    /**
     *Creates Modules for testing
     */
    public void createModules()
    {   
        Module moduleCo452 = new Module ("CO452","Programming Concepts");
        Module moduleCo450 = new Module ("CO450","Computer Architectures");
        Module moduleCo456 = new Module ("CO456","Web Development");
        Module moduleCo454 = new Module ("CO454","Professional Practice");
        
        addModules(moduleCo450);
        addModules(moduleCo452);       
        addModules(moduleCo456); 
        addModules(moduleCo454);
    }
    
    /**
     * Adds module  object to course.
     */
    public void addModules(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
      
    /***
     * Adds module object to course object
    */ 
    public void addModule(Module module)
    {
      if(modules.size() < MAXN_MODULES)
      {
        this.module = module;
        modules.add(module);
      } 
      
      else 
      {
          System.out.println("Module Cannot be Added");  
      }
      
    } 
    
    /**
     * Convert Mark into Grade
     */
    public Grades convertToGrade(int mark)
    {
        if (mark > Grades.A.getValue())
        {
            return Grades.NS;
        }
   
        else if (mark > Grades.B.getValue())
        {
            return Grades.A;
        }
        
        else if (mark >=Grades.B.getValue()) 
        {
            return Grades.B;
        }
        
        else if (mark >= Grades.C.getValue())
        {
            return Grades.C;
        }
        
        else if (mark >= Grades.D.getValue()) 
        {
            return Grades.D;
        }
        
        else if (mark >=Grades.F.getValue()) 
        {
            return Grades.F;
        }
        
            return Grades.NS;
    }
    
    /**
     * Caculates and returns the average grade for student
     */
    public Grades averageGrade(ArrayList<ModuleMark> marks)
    {  
        int avgGrade=0;
        
       for (ModuleMark mark: marks)
       {
           avgGrade =  avgGrade + mark.getValue();
       }
        
        avgGrade = avgGrade / MAXN_MODULES;
        grade = convertToGrade (avgGrade);
        return grade;
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
         for (Module module:modules)
        {
            module.print();
        }
    }
    
}
