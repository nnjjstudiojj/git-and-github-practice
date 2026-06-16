import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class snakePanel extends gamePanel{

    private int width = 600;
    private int height = 600;
    private int cellSize = 25;


    public snakePanel() {

        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
    }

    @Override
    public void gameUpdates() {
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);

        for (int i = 0; i <= width / cellSize; i ++) {
            
            g.drawLine(0 , 300 , 500, 400);
        }
    }
    
}
