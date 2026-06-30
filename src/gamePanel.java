import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

public abstract class gamePanel extends JPanel{

    public boolean running;

    public gamePanel(int width, int height, int R, int G, int B) {

        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(new Color(R, G, B));

    }
   
    public void gameUpdates() {

      if (running) {
        gameLogic();
        repaint();
      } 
    }

    public abstract void gameLogic();

    public abstract void initialiseGame();

    @Override
    public void paintComponent(Graphics g) {

      super.paintComponent(g);
      render(g);
    }

    public abstract void render(Graphics graphics); 
}
