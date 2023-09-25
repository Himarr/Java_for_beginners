public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int y = 0; y < 8; y++)
      {
         for (int x = 0; x < 8; x++)
         {
            if ((y + x) % 2 == 0){
               chessboard[y][x] = '□';
            } else
            {
               chessboard[y][x] = '■';
            }
         }
      }
      for (char[] row: chessboard)
      {
         for (char square: row)
         {
            System.out.print(square);
         }
         System.out.print('\n');
      }
   }
}