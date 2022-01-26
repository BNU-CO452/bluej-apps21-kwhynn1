/**
 * This is the class for the enemy. It is used to set the enemy's health and damage
 * 
 */
public class Enemy
{
    //variable for enemy's damage
    int damage;
    //variable for enemy's health
    int health;
    
    //Constructor for Enemy class
    public Enemy()
    {
        getDamage();
        getHealth();
    }
    
    // Return Player's Damage
    public int getDamage()
    {
       return  damage;
    }
    
    // Return enemy's  Health
    public int getHealth()
    {
       return health;
    }
   
    // Decrease enemy's  Health
    public void decearseHealth (int amount) 
    {    
        health = getHealth() - amount;
    }
    
    // Increase enemy's  Health
    public void increaseHealth (int amount) 
    {    
        health = getHealth() + amount;
    }
   
    // Increase enemy's  Damage
    public void increaseDamage (int amount) 
    {    
        damage = getDamage() + amount;
    }
   
}
