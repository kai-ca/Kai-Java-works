// ----------------------------------------------------------------------------
// RandomSkyline.java        Author: Kai Yun Pekarsky
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

public class RandomSkyline
{
    // create and display the application frame
    public static void main (String[] args)
    {
		// create the frame
        JFrame frame = new JFrame ("Random Skyline");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
				
		// add the panel to the frame
		frame.getContentPane().add(new SkylinePanel());
		frame.pack();
		frame.setVisible(true);

    }
}
