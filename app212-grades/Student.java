import java.util.*;
/**
 * This class contains information about
 * students. Methods allow for enrollment, adding of student marks and
 * printing details to terminal.
 * 
 * @author  Kyle Whynn
 * @version 1
 */
public class Student
{
    // ID number
    private int id;
    // Student name
    private String name;
    // Course object
    private Course course;
    // Marks given for course to the student
    private ArrayList<ModuleMark> marks = new ArrayList<ModuleMark>();
    // Module object
    private Module module;
    // Object for Module Mark
    private ModuleMark modulemark;

    
    /**
     * This constructor creates a student object with a
     * fixed name and id. 
     */
    public Student()
    {
        this("Kyle", 22137070);
    }
    
    /**
     * Create student object with a name and ID number. Initializes 
     *  Arraylist.
     */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    /**
     * Enrolls student object to a course object.     
     */
    public void enroll(Course course)
    {
        this.course = course;
    }
     
    /**
     *  print the student's name and ID number to terminal.
     */
    public void print()
    {
        System.out.println("Student ID: "+ id + " Student Name: "+ name);
    }
     
    /**
     * Add Mark to sudent object
     */
    public void addMark(ModuleMark mark)
    {
        marks.add(mark);
    }
    
    /**
     * Prints the detail of course.
     */
    public void printCourse()
    {
        course.print();
    }
    
    /**
     *Creates Mark objects for testing
     */
    public void createMarks()
    {   
      
        int value= 140;
         
        for (Module module: course.modules)
        {
           
            ModuleMark mark = new ModuleMark (module);
            mark.setMark(value);
            marks.add(mark);
            value=value-20;
        }
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
         for (ModuleMark modulemark:marks)
        {
             modulemark.print();
             System.out.print(" \t" + course.convertToGrade(modulemark.getValue()));
             System.out.println("");
        } 
    }
    
    /**
     * Prints the Student's information to the terminal
     */
    public void printTranscript()
    {
        System.out.println(" ------------------------------------");
        System.out.println(" App21-02: Exam Board Transcript 2021");
        System.out.println("        by student name");
        System.out.println(" ------------------------------------");
        print();
        System.out.println();
        printCourse();
        System.out.println();
        System.out.println("---- \t -------------------------- \t ------\t ----- \t-----");
        System.out.println("Code \t Module \t\t\t Credit\t Mark \tGrade");
        System.out.println("---- \t -------------------------- \t ------\t ----- \t-----");
        System.out.println();
        printModules();
        
        Grades finalGrade = course.averageGrade(marks);
        
        System.out.println();
        System.out.println();
        
        if(finalGrade == Grades.NS)
        {
            System.out.println(" Student hasn't passed yet.");
        }
        else
        {
            System.out.println(" Final Course Grade = " + finalGrade);
        }
    }

}