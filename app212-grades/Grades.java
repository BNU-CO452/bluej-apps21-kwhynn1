
/**
 * These are the grades used by BNU to classify 
 * students at the completion of their course
 * Each value is the top percentage mark for that grade
 * 
 * @author  Kyle Whynn
 * @version 1
 */
public enum Grades
{
    NS (0), 
    F  (39), 
    D  (49), 
    C  (59), 
    B  (69), 
    A  (100);
    
    //Constant for grade
    private final int value;
    
    //Sets the value for grade
    private Grades(int value)
    {
        this.value = value;
    }
    
    /**
     * Returns value 
     */
    public int getValue()
    {
        return value;
    }
}
