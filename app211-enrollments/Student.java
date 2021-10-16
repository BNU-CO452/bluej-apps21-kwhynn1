/**
* This class contains information about
* students. Methods allow for enrollment and
* printing to terminal.
* 
* @author  Kyle Whynn
* @version 1.0
*/


public class Student
{
    // ID number
    private int id;
    // Student Name
    private String name;
    // Course object
    private Course course;
    
    /**
    * Create student object with a name and ID number.
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
    * Print heading to the terminal.
    */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("           Student Details       ");
        System.out.println(" --------------------------------");
        System.out.println();
    }
    
    /**
    * Print the student's name and ID number to terminal.
    */
    public void print()
    {
        printHeading();
        System.out.println("Student ID: " + id);
        System.out.println("Name      : " + name);
    }
    
    /**
    * Print course that the student object is enrolled on.
    */
    public void printCourse()
    {
        course.print();
    }
}
