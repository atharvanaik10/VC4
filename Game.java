public class Game
{  
   private Piece[][] board;
   private String wincolor;
  
   public Game()
   {
      board = new Piece[8][8];
      for (int r = 0; r < 8; r++)
      {
         for (int c = 0; c < 8 ; c++)
         {
            board[r][c] = null;
         }
      } 
   }
   
   public Piece[][] getBoard()
   {
      return board;
   }
   
   public boolean placePiece(Player p, int c)
   {
      c = c-1;
      String s;
      Piece piece;
      int r;
      if(c < 8 && c >= 0)
      {
         r = setPos(c);
      }
      else
      {
         return false;
      }
      if (c < 8 && c >= 0 && r !=-1)
      {
         
         if (p.getPlayer() == 1)
         {
            piece = new White(r,c);
         }
         else
         {
            piece = new Black(r,c);     
         }
         board[r][c] = piece; 
         return true;
      }
      else
      { 
         return false;
      }
   }
   
   public String toString()
   {
      String s = "";
      for(int r = 0; r < board.length; r++)
      {
         for (int c = 0; c < board[0].length; c++)
         {
            if(board[r][c] == null)
            {
               s += "∘ ";
            }
            else
            {
              s += board[r][c].toString();
            }
         }
         s += "\n";
      }
      return s;
   }
         
   public int setPos(int c)
   {
   
      int k = 0;
      while(k<board.length && board[k][c]== null)
      {
         k++;
      }
      k = k-1;
      return k;
      
   }

   public boolean isGameOver() throws Exception
   {
      int four = 0;
      
      //HORIZONTAL CHECK
      for (int r = 0; r < 8; r++)
      {
         for (int c = 0; c < 5; c++)
         {
            
            for (int count = 0; count < 4; count ++)
            {
               if(board[r][c] != null && board[r][c+count] != null)
               {
                  
                  if(board[r][c].equals(board[r][c+count]))
                  {
                     four ++;
                  }
                  else
                  {
                     four = 0;
                  }
                  if(four == 4)
                  {  
                     wincolor = board[r][c].color();
                     System.out.println("Game Over! ");
                     return true;
                  }
                  
               }
            }
            four = 0;
         }  
      }
      
      //VERTICAL CHECK
      for (int c = 0; c < 8; c++)
      {
         for (int r = 0; r < 5; r++)
         {
            for (int count = 0; count < 4; count++)
            {
               if(board[r][c] != null && board[r + count][c] != null)
               {
               
                  if(board[r][c].equals(board[r + count][c]))
                  {
                     four ++;
                  }
                  else
                  {
                     four = 0;
                  }
                  if(four == 4)
                  {
                     wincolor = board[r][c].color();
                     System.out.println("Game Over!");
                     return true;                     
                  }
               }
            }  
            four = 0; 
         } 
      }
         
      //DIAGONAL CHECK
      for (int r = 0; r < 5; r++)
      {
         for (int c = 0; c < 5; c++)
         {
            for (int count = 0; count <4; count++)
            {
               if(board[r][c] != null && board[r+count][c+count] != null)
               {

                  if(board[r][c].equals(board[r + count][c+ count]))
                  {
                     four ++;
                  }
                  else
                  {
                     four = 0;
                  }
                  if(four == 4)
                  {
                    wincolor = board[r][c].color();
                    System.out.println("Game Over!");
                    return true;  
                  }

               }
            }
            four = 0;  
         }
      }

      //OTHER DIAGONAL CHECK
      for (int r = 0; r < 5; r++)
      {
         for (int c = 7; c > 2; c--)
         {
            for (int count = 0; count < 4; count++)
            {
               if(board[r][c] != null && board[r+count][c-count] != null)
               {
                  if(board[r][c].equals(board[r+count][c-count]))
                  {
                     four ++;
                  }
                  else
                  {
                     four = 0;
                  }
                  if(four == 4)
                  {
                    wincolor = board[r][c].color();
                    System.out.println("Game Over!");
                    return true;  
                  }

               }
            }
            four = 0;  
         }
      }
      return false;
   }
   
   public String winner()
   {
      return wincolor;
   }
   
   public int convert(String s)
   {  
      System.out.println(s);
      if(s.equals("one"))
      {
         return 1;
      }
      else if(s.equals("two"))
      {
         return 2;
      }
      else if(s.equals("three"))
      {
         return 3;
      }
      else if(s.equals("four"))
      {
         return 4;
      }
      else if(s.equals("five"))
      {
         return 5;
      }
      else if(s.equals("six"))
      {
         return 6;
      }
      else if(s.equals("seven"))
      {
         return 7;
      }
      else if(s.equals("eight"))
      {
         return 8;
      }
      else
      {
         return -1;
      }
   }
}