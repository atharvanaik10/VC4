import java.util.*;

public class GameDriver
{
   public static void main(String[] args) throws Exception
   {
      Game game = new Game();
      System.out.println(game);
      Player p1 = new Player(1, "Jeff");
      Player p2 = new Player (2, "Humphrey");

      int playerCount = 0;
      while (!game.isGameOver())
      {
         //for player 1 - this is important because each player has a different piece
         if(playerCount % 2 == 0)
         { 
            System.out.println(p1.getName() + "'s turn.");
            TestVoice t = new TestVoice();
            String s = t.writeSpeech(game);
            int i = game.convert(s);
            boolean n = game.placePiece(p1, i);
            if (n == false)
            {
               System.out.println("Invalid move, try again");
               playerCount--;
            }
            System.out.println(game);
            
         }
         
         //for player 2 
         else if(playerCount%2 == 1)
         {
            System.out.println(p2.getName() + "'s turn.");

            TestVoice t = new TestVoice();
            String s = t.writeSpeech(game);
            int i = game.convert(s);
            boolean n = game.placePiece(p2, i);
            if (n == false)
            {
               System.out.println("Invalid move, try again");
               playerCount--;
            }
            System.out.println(game);

         }  
         playerCount++;
         
      }
      System.out.println(game);
      if(game.winner().equals("black"))
      {
         System.out.println(p2.getName() + " wins!");
      }
      else 
      { 
         System.out.println(p1.getName() + " wins!");
      }
      
   }
}