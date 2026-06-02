import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class gamePanel extends JPanel{

    private static final int ROWS = 25;
    private static final int COLS = 25;
    private static final int CELL_SIZE = 24;
    private static final int width = 600;
    private static final int height = 600;

    public gamePanel() {
        
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(width, height));

        repaint();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        
        for (int i = 0; i <= ROWS; i++) {
            g.drawLine(0, i * CELL_SIZE, width - 1, i * CELL_SIZE);
            g.drawLine(i * CELL_SIZE, 0, i * CELL_SIZE, height - 1);
        }  
    }
}
