import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Kyle Whynn
 * @version    1
 */
public class InputReader
{
    //Scanner Object
    private Scanner reader;

    /**
     * Create a new InputReader that reads input from the terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from the terminal
     * and return it as a string.
     */
    public String getString(String prompt)
    {
        String inputLine = null;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt);       
            inputLine = reader.nextLine();
            
            if(!inputLine.isEmpty())
                isValid = true;
            else 
                System.out.println("\nYour input is blank!\n");
        }

        return inputLine;
    }
    
    /**
     * Read an int from terminal
     * and return it as an interger.
     */
    public int getInt(String prompt)
    {
        int number = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.println(prompt);         
            number = reader.nextInt();
            
            if(number > 0)
            {
                isValid = true;
            }
            else 
                System.out.println("Your value is less than zero!");
        }

        return number;
    }
}