import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class gamePanel extends JPanel{
   
    public abstract void gameUpdates();

    public abstract void render(Graphics g);

    @Override
    public void paintComponents(Graphics g) {

        super.paintComponents(g);
        render(g);
    }
}
