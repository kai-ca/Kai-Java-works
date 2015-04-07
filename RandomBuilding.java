// ----------------------------------------------------------------------------
// Building.java        Author: Kai Yun Pekarsky
// Demonstrate your ability to ability to use Java data and control structures. Draw with the 
// aid of conditionals and loops.

// Algorithm
// 1) Create frame
// 2) Create constructor and panel
// 3) Create components class and methods
// 4) Call components methods to panel
// 5) Add panel to frame
// -----------------------------------------------------------------------------

import java.awt.*;
import java.util.Random;

public class Building
{
    // create the data variables
    private int x, y, ht, wd, num;
    private Color color;
    private Random generate;
    
    // constructor: set up this Building with specifiied values
    public Building(int upperX, int upperY, int nWidth, int nHeight, Color shade, int nWind)
    {
      x = upperX;
      y = upperY - nHeight;
      wd = nWidth;
      ht = nHeight;
      color = shade;
      num = nWind;
      generate = new Random();
    }
    
    // draws this building in the specified graphics context
    public void draw (Graphics pg)
    {
      pg.setColor (color);
      pg.fillRect (x, y, wd, ht);
      
      // draw the windows within this building
      if (num > 0)
      {
       int count = 1;
       while (count <= num)
       {  
         int xWin = generate.nextInt(wd-20) + x + 5;
         int yWin = generate.nextInt(ht-20) + y + 5;
         pg.setColor (Color.yellow);
         pg.fillRect (xWin, yWin, 5, 5);
         count++;
       }
      }
    }
    
    // width accessor
    public int getWidth ()
    {
     return wd;
    }
    
    // height accessor
    public int getHeight ()
    {
     return ht;
    }
    
    // number of windows accessor
    public int getWindows()
    {
     return num;
    }
}
