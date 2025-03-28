package Lab04;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.*;

import javax.swing.JComponent;

/**
 * This class is an attempt at a GUI.
 * It is creating a basic neighborhood.
 */


public class MyHouseComponent extends JComponent{ 

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        
        Rectangle2D.Double sky = new Rectangle2D.Double(0,0,1000,500);
        g2.setColor(Color.CYAN);
        g2.fill(sky);
        g2.draw(sky);

        //////////////// Sun
        Arc2D.Double sun = new Arc2D.Double(370, 229, 255,255, 0, 180, Arc2D.PIE);
		g2.setColor(Color.YELLOW);
		g2.fill(sun);

        //////////////// Grass

        Rectangle2D.Double grass = new Rectangle2D.Double(0,355,1000,500);
		g2.setColor(new Color(141, 240, 84));
        g2.fill(grass);
		g2.setColor(new Color(60, 100, 220));
        g2.draw(grass);

        //////////////// Trees


        int[] xPointsTrunk = {290, 290, 340, 340};
        int[] yPointsTrunk = {479, 280, 260, 450};
        Polygon treeTrunk = new Polygon(xPointsTrunk, yPointsTrunk, 4);
        g2.setColor(new Color(97, 50, 12));
        g2.fill(treeTrunk);
        g2.setColor(new Color(0, 0, 0));
		g2.draw(treeTrunk);

        Rectangle2D.Double trunkSide = new Rectangle2D.Double(266,300,25,180);
        g2.setColor(new Color(97, 50, 12));
        g2.fill(trunkSide);
        g2.setColor(new Color(0, 0, 0));
		g2.draw(trunkSide);


        Ellipse2D.Double treeLeaf = new Ellipse2D.Double(278, 240, 80, 80);
        g2.setColor(new Color(28, 92, 40));
        g2.fill(treeLeaf);

        Ellipse2D.Double treeLeaf2 = new Ellipse2D.Double(255, 240, 80, 80);
        g2.setColor(new Color(28, 92, 40));
        g2.fill(treeLeaf2);

        Ellipse2D.Double treeLeaf3 = new Ellipse2D.Double(263, 210, 80, 80);
        g2.setColor(new Color(28, 92, 40));
        g2.fill(treeLeaf3);

        //////////////// Road

        int[] xPointsRoad = { 0, 500, 1000 };
		int[] yPointsRoad = { 650, 355, 650 };
		Polygon road = new Polygon(xPointsRoad, yPointsRoad, 3);
		g2.setColor(Color.GRAY);
        g2.fillPolygon(road);

        //////////////// House 1


        int[] xPointsFHouse = {50, 50, 250, 250};
        int[] yPointsFHouse = {621, 200, 153, 503};
        Polygon frontHouse = new Polygon(xPointsFHouse, yPointsFHouse, 4);
        g2.setColor(new Color(57, 83, 102));
        g2.fillPolygon(frontHouse);
		g2.setColor(new Color(0, 0, 0));
        g2.draw(frontHouse);


        Rectangle2D.Double sideHouse = new Rectangle2D.Double(0,200,50,421);
        g2.setColor(new Color(57, 83, 102));
        g2.fill(sideHouse);
		g2.setColor(new Color(0, 0, 0));
        g2.draw(sideHouse);


        int[] xPointsRoofF = { 50, 160, 250 };
		int[] yPoints3RoofF = { 200, 75, 153 };
		Polygon roofFront = new Polygon(xPointsRoofF, yPoints3RoofF, 3);
        g2.setColor(new Color(230, 227, 213));
        g2.fillPolygon(roofFront);
        g2.setColor(new Color(0, 0, 0));
        g2.draw(roofFront);

        int[] xPointsRoofS = {0, 0, 160, 50};
        int[] yPointsRoofS = {200, 75, 75, 200};
        Polygon roofSide = new Polygon(xPointsRoofS, yPointsRoofS, 4);
        g2.setColor(new Color(230, 227, 213));
        g2.fillPolygon(roofSide);
		g2.setColor(new Color(0, 0, 0));
        g2.draw(roofSide);


        Ellipse2D.Double window = new Ellipse2D.Double(117, 215, 85, 85);
        g2.setColor(new Color(186, 204, 198));
		g2.fill(window);
        g2.setColor(new Color(0, 0, 0));
		g2.draw(window);


        int[] xPointsDoor = {117, 117, 200, 200};
        int[] yPointsDoor = {582, 350, 320, 532};
        Polygon door = new Polygon(xPointsDoor, yPointsDoor, 4);
		g2.setColor(new Color(112, 91, 59));
        g2.fillPolygon(door);
		g2.setColor(new Color(0, 0, 0));
        g2.draw(door);

        Ellipse2D.Double doorknob = new Ellipse2D.Double(170, 470, 20, 20);
		g2.setColor(new Color(255, 215, 0));
		g2.fill(doorknob);
        g2.setColor(new Color(0, 0, 0));
		g2.draw(doorknob);

        //////////////// House 2
        
        int[] xPointsFHouse2 = {750, 750, 950, 950};
        int[] yPointsFHouse2 = {503, 153, 200, 621};
        Polygon frontHouse2 = new Polygon(xPointsFHouse2, yPointsFHouse2, 4);
        g2.setColor(new Color(255, 54, 54));
        g2.fillPolygon(frontHouse2);
		g2.setColor(new Color(0, 0, 0));
        g2.draw(frontHouse2);

        Rectangle2D.Double sideHouse2 = new Rectangle2D.Double(950,200,50,421);
        g2.setColor(new Color(255, 54, 54));
        g2.fill(sideHouse2);
		g2.setColor(new Color(0, 0, 0));
        g2.draw(sideHouse2);


        int[] xPointsRoofF2 = { 750, 850, 950 };
		int[] yPoints3RoofF2 = { 153, 75, 200 };
		Polygon roofFront2 = new Polygon(xPointsRoofF2, yPoints3RoofF2, 3);
        g2.setColor(new Color(45, 244, 197));
        g2.fillPolygon(roofFront2);
        g2.setColor(new Color(0, 0, 0));
        g2.draw(roofFront2);

        int[] xPointsRoofS2 = {950, 850, 1000, 1000};
        int[] yPointsRoofS2 = {200, 75, 75, 200};
        Polygon roofSide2 = new Polygon(xPointsRoofS2, yPointsRoofS2, 4);
        g2.setColor(new Color(45, 244, 197));
        g2.fillPolygon(roofSide2);
        g2.setColor(new Color(0, 0, 0));
        g2.draw(roofSide2);

        int[] xPointsDoor2 = {805, 805, 900, 900};
        int[] yPointsDoor2 = {536, 320, 350, 592};
        Polygon door2 = new Polygon(xPointsDoor2, yPointsDoor2, 4);
		g2.setColor(new Color(112, 91, 59));
        g2.fillPolygon(door2);
		g2.setColor(new Color(0, 0, 0));
        g2.draw(door2);

        Ellipse2D.Double doorknob2 = new Ellipse2D.Double(870, 475, 20, 20);
		g2.setColor(new Color(255, 215, 0));
		g2.fill(doorknob2);
        g2.setColor(new Color(0, 0, 0));
		g2.draw(doorknob2);

        Ellipse2D.Double window2 = new Ellipse2D.Double(803, 215, 85, 85);
        g2.setColor(new Color(186, 204, 198));
		g2.fill(window2);
        g2.setColor(new Color(0, 0, 0));
		g2.draw(window2);


    }




    private static final long serialVersionUID = 1L;
    
}
