
public class Player
{
    
    private int health;
    private int damage;
    private int score;
   
    public Player()
    {
        getHealth();
        getDamage();
        getScore();
    }

   public int getHealth()
   {
       return health;
   }
   
   public int getDamage()
   {
       return damage;
   }
   
   public int getScore()
   {
       return score;
   }
   
   public void increaseHealth (int amount) 
   {    
    health = getHealth() + amount;
   }
   
   public void decearseHealth (int amount) 
   {    
    health = getHealth() - amount;
   }
   
   public void increaseScore (int amount) 
   {    
    score = getScore() + amount;
   }
   
   public void increaseDamage (int amount) 
   {    
    damage = getDamage() + amount;
   }
}
