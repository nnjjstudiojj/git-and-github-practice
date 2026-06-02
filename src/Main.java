import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        frame.add(new gamePanel());

        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
