package Lab04;

import javax.swing.*;
import java.awt.*;

/**
 * This is the main class that runs and creates the frame of the GUI.
 */

public class MyHouseViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
                try {
                    JFrame frame = new JFrame();
					frame.setSize(1000, 675); 			
					frame.setTitle("My House and Road"); 
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					// add objects into your frame
					MyHouseComponent s = new MyHouseComponent();
					frame.add(s);

					// lastly, set your frame visibility to true
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }
}
