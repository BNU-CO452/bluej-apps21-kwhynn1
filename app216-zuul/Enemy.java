
public class Enemy
{
    int damage;
    int health;
    
    public Enemy()
    {
        getDamage();
        getHealth();
    }
    
    public int getDamage()
    {
        return  damage;
    }
    
    public int getHealth()
   {
       return health;
   }
   
   public void decearseHealth (int amount) 
   {    
    health = getHealth() - amount;
   }
    
   public void increaseHealth (int amount) 
   {    
    health = getHealth() + amount;
   }
   
   public void increaseDamage (int amount) 
   {    
    damage = getDamage() + amount;
   }
   
}
