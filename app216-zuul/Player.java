/**
 * This the class for the player. The player's atributes are defined here.
 */

public class Player
{
    //variable for the player's health
    private int health;
    //variable for the player's damage
    private int damage;
    //variable for the player's score
    private int score;
   
    //Constructor for the PLayer class
    public Player()
    {
        getHealth();
        getDamage();
        getScore();
    }
    
    // Returns player's health
    public int getHealth()
    {
       return health;
    }
   
    // Returns player's damage
    public int getDamage()
    {
       return damage;
    }
   
    // Returns player's score
    public int getScore()
    {
       return score;
    } 
   
    // Increases the player's heatlh
    public void increaseHealth (int amount) 
    {    
    health = getHealth() + amount;
    }
   
    // Decreases the player's health
    public void decearseHealth (int amount) 
    {    
    health = getHealth() - amount;
    }
   
    // Increases the player's score
    public void increaseScore (int amount) 
    {    
    score = getScore() + amount;
    }
   
    // Increases the player's Damage
    public void increaseDamage (int amount) 
    {    
    damage = getDamage() + amount;
    }
}
