import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Git Practice Game");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        JButton snakeButton = new JButton("Snake game");
        snakeButton.setPreferredSize(new Dimension(100,50));
        JButton pongButton = new JButton("Pong game");
        pongButton.setPreferredSize(new Dimension(100,50));
        JButton chessButton = new JButton("Chess game");
        chessButton.setPreferredSize(new Dimension(100,50));

        snakeButton.addActionListener(e -> System.out.println("Launching snake"));
        pongButton.addActionListener(e -> System.out.println("Launching pong"));
        chessButton.addActionListener(e -> System.out.println("Launching chess"));

        frame.setLayout(new GridLayout(1, 3));
        
        frame.add(snakeButton);
        frame.add(pongButton);
        frame.add(chessButton);
        
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.setVisible(true);
    }
}
