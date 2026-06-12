import javax.swing.JFrame;
import javax.swing.JMenu;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        JMenu menu = new JMenu();
        frame.add(menu); 

        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
