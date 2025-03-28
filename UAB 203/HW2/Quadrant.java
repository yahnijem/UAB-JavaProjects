package HW2;

import javax.swing.*;

import java.awt.*;

public class Quadrant {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrame frame = new JFrame();
                    frame.setSize(600, 600); // Window size
                    frame.setTitle("My Random Shape Maker");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // Create a JPanel for drawing the axes and shapes
                    JPanel panel = new JPanel() {
                        public void paintComponent(Graphics g) {
                            super.paintComponent(g);
                            g.setColor(Color.BLACK);
                            g.drawLine(300, 0, 300, 600); // Vertical line
                            g.drawLine(0, 300, 600, 300); // Horizontal line
                        }
                    };

                    // Create an instance of ShapeDrawer
                    ShapeDrawer shapeDrawer = new ShapeDrawer();

                    panel.setLayout(new BorderLayout());
                    panel.add(shapeDrawer, BorderLayout.CENTER);

                    frame.add(panel);
                    frame.setVisible(true);
                    
                    // Center the frame on the screen
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}