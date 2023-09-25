public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 0, num = 2;
      while (count <= 100)
      {
         if (count == 100)
         {
            System.out.println(num);
            break;
         }
         for (int divisor = 2; divisor <= num; divisor++)
         {
            if (divisor == num)
            {
               count++;
               break;
            }
            if (num % divisor == 0)
            {
               break;
            }
         }
         if (count != 100) {num++;}
      }
   }
}