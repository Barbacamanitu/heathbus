import java.awt.*;

public class SchoolBus
{
    //Drives a school bus from left to right
    
    public static void main(String[] args)
    {
        int x;
        final int BUS_STEP = 30;
        final int SLEEP = 1000;
        DrawingPanel panel = new DrawingPanel(300,100);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics2D g = panel.getGraphics();

        //Drawing the school bus at position 30
        x = 30;
        //Draws the school bus body
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
        
        //Step 1: Moves the school bus from initial position to next position
        panel.sleep(SLEEP);
        panel.clear();
        x = x + BUS_STEP;
        //Draws the school bus body
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
        
        //Step 2
        panel.sleep(SLEEP);
        panel.clear();
        x = x + BUS_STEP;
        //Draws the school bus body
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
        
        //Step 3
        panel.sleep(SLEEP);
        panel.clear();
        x = x + BUS_STEP;
        //Draws the school bus body
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
        
        //Step 4
        panel.sleep(SLEEP);
        panel.clear();
        x = x + BUS_STEP;
        //Draws the school bus body
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
        
        //Step 5
        panel.sleep(SLEEP);
        panel.clear();
        x = x + BUS_STEP;
        //Draws the school bus body
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
    }
}
