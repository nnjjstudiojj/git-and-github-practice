import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        int width = 600;
        int height = 600;

        JFrame frame = new JFrame("Snake Game");
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.add(new gamePanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
