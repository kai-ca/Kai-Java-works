// ----------------------------------------------------------------------------
// SkylinePanel.java        Author: Kai Yun Pekarsky
// Demonstrate your ability to ability to use Java data and control structures. Draw with the 
// aid of conditionals and loops.

// Algorithm
// 1) Create frame
// 2) Create constructor and panel
// 3) Create components class and methods
// 4) Call components methods to panel
// 5) Add panel to frame
// -----------------------------------------------------------------------------

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SkylinePanel extends JPanel
{
    // create the data variables
    private final int BD_WIDTH = 30;
            final int BD_HT = 100;
            final int NUM_WIND = 8;
            final int upperY = 200;
            int upperX = 15;
            Random generator;
            Building budg;
            Star sky;
    
    // constructor: creates panel size, background color and set up the generator
    public SkylinePanel()
    {    
      generator = new Random();
      setPreferredSize (new Dimension(500, 200));
      setBackground (Color.orange);
    }
    
    // draws this panel by requesting that each building draw itself in random number
    public void paintComponent (Graphics pg)
    {
      super.paintComponent(pg);
      
      int nStar = generator.nextInt(40)+10; // set up random number of stars to draw
      
      for (int count = 0; count < nStar; count++) 
      {
       int star_X = generator.nextInt(490)+5; // set up random x position for the star
       int star_Y = generator.nextInt(35)+20; // set up random y position for the star
       
       sky = new Star (star_X, star_Y); // instantiate the star
       sky.draw(pg); // draw the star
      }
      
      int num_bd = generator.nextInt(6)+1; // set up random number of buildings to draw
      
      for (int count = 0; count < num_bd; count++) 
      {
       int nWidth = generator.nextInt(BD_WIDTH)+40; // set up random building width
       int nHeight = generator.nextInt(BD_HT)+40; // set up random building height
       int nWind = generator.nextInt(NUM_WIND)+1; // set up random number of windows
       
       budg = new Building (upperX, upperY, nWidth, nHeight, Color.black, nWind); // instantiate the building
       
       budg.draw(pg); // draw the building
       
       int gap = generator.nextInt(6)+5; // set up random gap
       upperX = upperX + gap + nWidth; // set up the next building's starting x-axis
      }
          
      pg.drawString ("Kai Yun's Skyline", 150, 30);
    }
}
