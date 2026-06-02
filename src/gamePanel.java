import java.awt.Color;

import javax.swing.JPanel;

public class gamePanel extends JPanel{

    private static final int ROWS = 25;
    private static final int COLS = 25;
    private static final int CELL_SIZE = 24;

    public gamePanel() {
        
        this.setBackground(Color.BLACK);

        repaint();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.DARK_GRAY);
        
        for (int i = 0; i < ROWS; i++) {
            g.drawLine(0, 0, i * CELL_SIZE, 0);
        }  
    }
}
