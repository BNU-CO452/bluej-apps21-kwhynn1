
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
       int health = 100;
       return health;
   }
   
   public int getDamage()
   {
       int damage = 5;
       return damage;
   }
   
   public int getScore()
   {
       int score = 0;
       return score;
   }
   
   public void increaseHealth (int amount) {    
    health = getHealth() + amount;
    }
   
   public void decearseHealth (int amount) {    
    health = getHealth() - amount;
   }
   
   public void increaseScore (int amount) {    
    health = getScore() + amount;
    }
   
}
