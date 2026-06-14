import java.awt.Dimension;
import java.awt.Graphics;

public class snakePanel extends gamePanel{

    private int width = 600;
    private int height = 600;

    public snakePanel() {

        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void gameUpdates() {
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }
    
}
