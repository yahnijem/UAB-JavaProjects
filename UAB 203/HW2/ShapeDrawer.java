package HW2;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeDrawer extends JComponent {
    // Attributes for shapes
    private int nPentagon;
    private int nCircle;
    private int nRectangle;
    private int nHexagon;
    private int[] xPos;
    private int[] yPos;

    // Constructor to generate random sizes with random int between 25-100
    public ShapeDrawer() {
        Random random = new Random();
        nPentagon = random.nextInt(76) + 25; 
        nCircle = random.nextInt(76) + 25;   
        nRectangle = random.nextInt(76) + 25; 
        nHexagon = random.nextInt(76) + 25;
        
        // Initialize position arrays
        xPos = new int[4];
        yPos = new int[4];
        generateRandomPositions();
    }

    private void generateRandomPositions() {
        Random random = new Random();
        // Q1: top-left (0,0) to (300,300)
        xPos[0] = random.nextInt(150) + 75;  
        yPos[0] = random.nextInt(150) + 75;
        
        // Q2: top-right (300,0) to (600,300)
        xPos[1] = random.nextInt(150) + 375;  
        yPos[1] = random.nextInt(150) + 75;
        
        // Q3: bottom-left (0,300) to (300,600)
        xPos[2] = random.nextInt(150) + 75;  
        yPos[2] = random.nextInt(150) + 375;
        
        // Q4: bottom-right (300,300) to (600,600)
        xPos[3] = random.nextInt(150) + 375;  
        yPos[3] = random.nextInt(150) + 375;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawShapes(g);
    }

    public void drawShapes(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Random random = new Random();

        // Draw in Q1 (top-left)
        g2.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        drawPentagon(g2);

        // Draw in Q2 (top-right)
        g2.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        drawCircle(g2);

        // Draw in Q3 (bottom-left)
        g2.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        drawRectangle(g2);

        // Draw in Q4 (bottom-right)
        g2.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        drawHexagon(g2);
    }

    public void drawPentagon(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int centerX = xPos[0];
        int centerY = yPos[0];

        int[] xPoints = new int[5];
        int[] yPoints = new int[5];
        
        for (int i = 0; i < 5; i++) {
            double angle = 2 * Math.PI * i / 5 - Math.PI / 2;
            xPoints[i] = centerX + (int)(nPentagon * Math.cos(angle));
            yPoints[i] = centerY + (int)(nPentagon * Math.sin(angle));
        }

        g2.fillPolygon(xPoints, yPoints, 5);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(xPoints, yPoints, 5);
    }

    public void drawCircle(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int diameter = 2 * nCircle;
        int xPosition = xPos[1] - nCircle;
        int yPosition = yPos[1] - nCircle;
        
        g2.fillOval(xPosition, yPosition, diameter, diameter);
        g2.setColor(Color.BLACK);
        g2.drawOval(xPosition, yPosition, diameter, diameter);
    }

    public void drawRectangle(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int width = 2 * nRectangle;
        int height = nRectangle;
        int xPosition = xPos[2];
        int yPosition = yPos[2];
    
        g2.fillRect(xPosition, yPosition, width, height);
        g2.setColor(Color.BLACK);
        g2.drawRect(xPosition, yPosition, width, height);
    }

    public void drawHexagon(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int centerX = xPos[3];
        int centerY = yPos[3];

        int[] xPoints = new int[6];
        int[] yPoints = new int[6];
        
        for (int i = 0; i < 6; i++) {
            double angle = 2 * Math.PI * i / 6;
            xPoints[i] = centerX + (int)(nHexagon * Math.cos(angle));
            yPoints[i] = centerY + (int)(nHexagon * Math.sin(angle));
        }

        g2.fillPolygon(xPoints, yPoints, 6);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(xPoints, yPoints, 6);
    }
}
