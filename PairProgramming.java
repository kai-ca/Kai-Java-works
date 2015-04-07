import java.util.Random;

public class Pair
{
    public static void main (String[] args)
    {
    // create the data variables
    final int ROW = 2;            
    final int COL = 4;
    int [][] table = new int[ROW][COL];
    Random generator = new Random();
    
    for (int row=0; row < ROW; row++)
    { 
     for (int col=0; col < COL; col++)
      table[row][col] = generator.nextInt(10)+1;
    }
    
    for (int row=0; row < ROW; row++)
    { 
     for (int col=0; col < COL; col++)
       System.out.print (table[row][col] + "\t");
     System.out.println();
    }
    
    for (int row=0; row < ROW; row++)
    {
     int sum = 0;     
     for (int col=0; col < COL; col++)
      {
       sum += table[row][col];
      }
      System.out.print("row " + row + ": " + sum + "\n");
    } 
    
    for (int col=0; col < COL; col++)
    {
     int sum = 0;
     for (int row=0; row < ROW; row++)
     {
      sum += table[row][col];
     }
     System.out.println("col " + col + ": " + sum);
    }
  }
}
