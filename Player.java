public class Player
{
   private String name;
   private int number;
   
   
   public Player(int n, String s)
   {
      number = n;
      name = s;
   }
   public int getPlayer()
   {
      return number;
   }
   
   public String getName()
   {  
      return name;
   }
   
}