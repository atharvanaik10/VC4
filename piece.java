public abstract class Piece
{

   private int row;
   private int column;
   private String fill;
   
   public Piece(int r, int c, String f)
   {
      row = r;
      column = c;
      fill = f;
   }
   
   public abstract String color();

   
   public int getRow()
   {
      return row;
   }
   public int getCol()
   {
      return column;
   }
  
   public String toString()
   {
      return fill;
   }
   
   public boolean equals(Piece piece) throws Exception
   {
      if (piece != null && toString().equals(piece.toString()))
      {
         return true;
      }
      return false;
   }
      
}