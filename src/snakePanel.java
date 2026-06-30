import java.awt.Color;
import java.awt.Graphics;

public class snakePanel extends gamePanel{

    private int width = 600;
    private int height = 600;
    private int cellSize = 25;


    public snakePanel() {

        super(600, 600, 10, 200, 10);
    }

    @Override
    public void gameLogic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gameLogic'");
    }

    @Override
    public void render(Graphics g) {

      g.setColor(new Color(50, 100, 50));

        for (int i = 0; i <= width / cellSize; i ++) {

            g.drawLine(i * cellSize, 0, i * cellSize, height);
        }

        for (int i = 0; i <= height / cellSize; i ++) {

            g.drawLine(0, i * cellSize, width, i * cellSize);
        }

    }

    @Override
    public void initialiseGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initialiseGame'");
    }
}
