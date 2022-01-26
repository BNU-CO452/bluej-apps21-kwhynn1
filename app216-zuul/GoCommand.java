/**
 * This class allow the player to move from locattion to location. Inlcued in this class 
 * is also the attack command and take commands simplied into logical operations
 */

import java.util.Scanner; 


public class GoCommand extends Command
{
    //variable for diraction
    String direction;
    //variable for item
    Item item;
    //variable for user input
    Scanner reader;
    //variable for player
    Player player;
    //variable for enemy
    Enemy enemy;
    
    //Constructor For GoComand Class
    public GoCommand(Game game, String direction)
    {
        super(game);
        this.direction = direction;
        reader = new Scanner(System.in);
    }    

    // Runs the Go, attack, take comand
    public void execute()
    {
        String ans;
        
        if(direction == null) 
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        Map map = KZ.MAP;
        Player player = KZ.player;
        
        
        // Try to leave current room.
        Location currentLocation = map.getCurrentLocation();
        Location nextLocation = currentLocation.getExit(direction);
       
        if (nextLocation == null) 
        {
            System.out.println("There is no way to go!");
        }
        else 
        {
            
            map.enterLocation(nextLocation);
            System.out.println(map.getCurrentLocation().getLongDescription());   
            
            if (nextLocation.getShortDescription() == "Inside the school's library" )
        {
            Item item = new Item ("Sword","Damage", 15);
            map.addItem(item );
            System.out.println(" " + item .getName() +" " + "Found!" + "Do you want to Take It? Y or N" );
            System.out.print(" > ");
            ans = reader.nextLine().toLowerCase();
            int damage = item.getValue();
            
            if (ans.equals("y"))
            {   
                System.out.println(" " + item.getType() + " increased by "+ item .getValue() + " using " + item .getName());
                player.increaseDamage(damage);
                item  = null;
                System.out.println(); 
                System.out.println(map.getCurrentLocation().getLongDescription());  
              
            } 
            else if (ans.equals("n"))
            {
            
            item  = null;
            map.addItem(item );
            System.out.println(); 
            System.out.println(map.getCurrentLocation().getLongDescription());  
            }
            
        }
        
        else  if (nextLocation.getShortDescription() == "Inside the Admin area" )
        {
            Item item = new Item ("Hammer","Damage", 5);
            map.addItem(item);
            System.out.println(" " + item.getName() +" " + "Found!" + "Do you want to Take It? Y or N" );
            System.out.print(" > ");
            ans = reader.nextLine().toLowerCase();
            int itemvalue = item.getValue();
            
            if (ans.equals("y"))
            {   
                System.out.println(" " + item.getType() + " increased by "+ item .getValue() + " using " + item .getName());
                player.increaseDamage(itemvalue);
                item = null;
                System.out.println(); 
                System.out.println(map.getCurrentLocation().getLongDescription());  
               
            } 
            else 
            {
                item = null;
                map.addItem(item);
                System.out.println(); 
                System.out.println(map.getCurrentLocation().getLongDescription());  
            }
            
        }
        else  if (nextLocation.getShortDescription() == "Inside the school's hallway" || nextLocation.getShortDescription() ==  "Inside the Classroom" )
        {
            Item item = new Item ("Candy","Health", 80);
            map.addItem(item);
            System.out.println(" " + item.getName() +" " + "Found!" + "Do you want to Take It? Y or N" );
            System.out.print(" > ");
            ans = reader.nextLine().toLowerCase();
            int itemvalue = item.getValue();
        
            if (ans.equals("y"))
            {   
                
            if (player.getHealth() <= 50)
            {
            
                System.out.println(" " + item.getType() + " increased by "+ item .getValue() + " using " + item .getName());
                player.increaseHealth(itemvalue);
                item = null;
                System.out.println(); 
                System.out.println(map.getCurrentLocation().getLongDescription());  
                
            } 
            
            else
            {
          
            System.out.println(" Sorry, you can't use this item");
            System.out.println(); 
            System.out.println(map.getCurrentLocation().getLongDescription());  
            }

            } 
            else 
            {
            item = null;
            map.addItem(item);
            System.out.println(); 
            System.out.println(map.getCurrentLocation().getLongDescription());  
            }
            
        }
        
          else  if (nextLocation.getShortDescription() == "Inside the Reception area" || nextLocation.getShortDescription() == "Inside the school's caterteria" || nextLocation.getShortDescription() == "Inside the school's Gym") 
        {
            Enemy enemy = new Enemy();
            enemy.increaseHealth(100);
            enemy.increaseDamage(20);
            int Edamage = enemy.getDamage();
            int Pdamage = player.getDamage();
            map.addEnemy(enemy);
            
            boolean counter = false;
            System.out.println(); 
            System.out.println(" A Zombie Has Appeared, You have to Fight him!" );
            
            while (counter != true)
            {
            System.out.println();     
            System.out.println(" Would You like to Attack The Zombie?  Y or N" );
            System.out.print(" > ");
            ans = reader.nextLine().toLowerCase();
            
             
            if (ans.equals("y"))
            {   
                enemy.decearseHealth(Pdamage);
                System.out.println(" Player Has Attacked the Zombie! " + player.getDamage() + " was done to the Zombie. " + " Zombie Has " + enemy.getHealth() + " Health");
                player.decearseHealth(Edamage);
                System.out.println(" Zombie Has Attacked Player! " + enemy.getDamage() + " was done to the Player. " + " Player Has " + player.getHealth() + " Health");
                
                
                if (player.getHealth() <= 0)
                {
                System.out.println(); 
                System.out.println(" You Lost the Fight!");
                System.exit(0);
                counter = true;
                System.out.println(); 
                System.out.println(map.getCurrentLocation().getLongDescription());  
                
                }
                else if (enemy.getHealth() <= 0)
                {
                int score = 5;
                player.increaseScore(score);
                System.out.println(); 
                System.out.println(" You won the Fight! " +  "You Got " + score + " points ");
                counter = true;
                System.out.println(); 
                if (player.getScore() == 15 )
                {
                System.out.println(); 
                System.out.println (" You won the game!");
                System.exit(0);
                }
                System.out.println(map.getCurrentLocation().getLongDescription());  
                }

            }  
            else if (ans.equals("n"))
            {
                Edamage = 30;
                enemy.increaseDamage(Edamage);
                player.decearseHealth(enemy.getDamage());
                System.out.println(" You Ran From The Fight! When Escaping the Zombie did " + enemy.getDamage() + " damage to the Player");
                System.out.println(); 
                System.out.println(map.getCurrentLocation().getLongDescription());  
                
                if (player.getHealth() <= 0)
                {
                System.out.println();     
                System.out.println(" You Lost the Fight!");
                System.exit(0);
                }
                counter = true;
            }
            }           
        }
    
      }           
        
    }
            
            
}
        
        
        
        
        
        
        
    
        
    
    
    
    

