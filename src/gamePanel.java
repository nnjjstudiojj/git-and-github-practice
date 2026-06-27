import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

public abstract class gamePanel extends JPanel{

    public gamePanel(int width, int height, int R, int G, int B) {

        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(new Color(R, G, B));

    }
   
    public abstract void gameUpdates();

    public abstract void initialiseGame();

    @Override
    public void paintComponent(Graphics g) {

      super.paintComponent(g);
      render(g);
    }

    public abstract void render(Graphics graphics);
}
