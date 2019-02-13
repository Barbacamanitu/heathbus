package heathbus;
import java.awt.*;

public class SchoolBus
{
    //Drives a school bus from left to right
    
    public static void main(String[] args)
    {
        final int BUS_STEP = 10;
        final int SLEEP = 300;
        final int STEPS = 50;
        DrawingPanel panel = new DrawingPanel(300,100);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics2D g = panel.getGraphics();

        for (int x = 0; x < STEPS; x++) {
        	panel.clear();
        	drawBusAt(x*BUS_STEP,g);
        	panel.sleep(SLEEP);
        }
    }
    
    private static void drawBusAt(int x, Graphics g) {
    	g.setColor(Color.YELLOW);
        g.fillRect(x, 30, 100, 50);
        //Draws the windows
        g.setColor(Color.CYAN);
        g.fillRect(x + 10, 40, 10, 15);
        g.fillRect(x + 30, 40, 10, 15);
        g.fillRect(x + 50, 40, 10, 15);
        g.fillRect(x + 70, 40, 10, 15);
        g.fillRect(x + 90, 40, 10, 20);
        //Draws the tires
        g.setColor(Color.BLACK);
        g.fillOval(x + 15, 70, 20, 20);
        g.fillOval(x + 65, 70, 20, 20);
        double y = Math.sin((double)x/10.0)*10.0 + 75.0;
        g.drawString("heath is nub", x-70, (int)y);
    }
    
}
