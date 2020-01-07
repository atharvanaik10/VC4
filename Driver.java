public class Driver
{
  
   public static void main(String[] args)
   {
      int sum = 0;
      for (int k = 1; k < 1000; k++)
      {
         if(k % 3 == 0 || k % 5 == 0)
         {
            sum += k;
         }
      }
      System.out.println(sum);
   }
}
        