/**
 * 
 * Author: 
 * Date: 
 * Description:
 *
 */
 
public class Window
{      
   private static final char BLANK = ' ';
   private static final char WINDOW_BAR = '=';
   private static final char WINDOW_EDGE = '+';
   private String title;
   private String text; 
   private int x;
   private int y;
   private int h;
   private int w;
   private char[][] frame;
  
   
   // default constructor which creates a Window which is blank/empty, with the title Default, 
   // at position 1,1 which is 10x20 in size
   public Window()
   {
      title = "Default";
      text = " ";
      x = 1;
      y = 1;
      h = 10;
      w = 20;
      frame = new char [h][w];
      fillFrame();
   }
   
   // constructor which creates an open Window using the given location, size and information
   public Window(String titl, String txt, int xCoord, int yCoord, int height, int width)
   {
       // initialize all of the instance variables for the Window class
      title = titl;
      text = txt;
      x = xCoord;
      y = yCoord;
      h = height;
      w = width;
      frame = new char [h][w];
      fillFrame();
   }
   
   
   private void fillFrame()
   {
      // complete the fillFrame method including the title bar, outline and text
      // if the text does not completely fill the frame then extra space should be filled with blanks
      
      int titlen = title.length();
      String ttl = "=";
       //text
      /*int txtlen = 0;
      txtlen = text.length();
      String txt = text + " ";

      
      for (int k = 0; k < (((w-2)*(h-2)) - txtlen)-1; k++)
      {
         txt = txt + " ";

      }
      */
  

     
      for (int k = 0; k < ((w - titlen)/2) - 2; k++)
      {
         ttl = ttl + "=";
      }
      ttl = ttl + " " + title + " ";
      for (int k = 0; k < ((w - titlen)/2)-1; k++)
      {
         ttl = ttl + "=";
      }
      if (ttl.length() != w)
      {
         ttl = ttl + "=";
      }
      int strix = 0;

      for (int r=0; r < h; r++)
      {
         for (int c=0; c < w; c++)
         {
            if (r == 0) 
            {
        
             
                  frame[r][c] = ttl.charAt(c);
                        }
            else if((c == 0) || (c == w-1))
                  frame[r][c] = WINDOW_EDGE;
            else if (r == h-1)
                  frame[r][c] = WINDOW_BAR;
          
            else if (strix< text.length())
            {
               frame[r][c] = text.charAt(strix);
               strix++;
            }
            else
            {
               frame[r][c] = BLANK;
            }

           }
           
         
      }

      
      
      /*for (int r=2; r < h - 2; r++)
      {
         for (int c=2; c < w - 2; c++)
         {
            int newc = ((r-2) * w) + (c-1);
            frame[r][c] = text.charAt(newc);
         }
      } 
      */


      }
      
      
      
      
      
   
   
   public void printWindow()
   {
      // complete the printWindow method to print out the frame character by character
      // this method simply prints the frame so it can be checked/verified
      System.out.println();
      for (int r = 0; r < h; r++)
      {
         for (int c = 0; c < w; c++)
         {
            System.out.print(frame[r][c]);
         }
         System.out.println();
      }
      System.out.println();

      
   }
   
   //GET
   public static final char getBlank()
   {
      return BLANK;
   }
   
   public static final char getWindowBar()
   {
      return WINDOW_BAR;
   }
   
   public static final char getWindowEdge()
   {
      return WINDOW_EDGE;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public String getText()
   {
      return text;
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public int getH()
   {
      return y;
   }  
   
   public int getW()
   {
      return w;
   }
   public char[][] getFrame()
   {
      return frame;
   }
   
   //SET
   public void setTitle(String x)
   {
      title = x;
   }
   
   public void setText(String x)
   {
      text = x;
   }
   
   public void setX(int a)
   {
      x = a;
   }
   
   public void setY(int a)
   {
      y = a;
   }


   public void setH(int a)
   {
      h = a;
   }


   public void setW(int a)
   {
      w = a;
   }

   


   
   
}
