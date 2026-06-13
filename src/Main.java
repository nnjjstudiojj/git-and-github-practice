import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        JMenuBar menuBar = new JMenuBar();

        JMenu gamesMenu = new JMenu("Games");

        JMenuItem snakeGame = new JMenuItem("Snake");
        JMenuItem pongGame = new JMenuItem("Pong");
        JMenuItem chessGame = new JMenuItem("Chess");

        snakeGame.addActionListener(e -> System.out.println("Running snake game"));
        chessGame.addActionListener(e -> System.out.println("Running chess game"));
        pongGame.addActionListener(e -> System.out.println("Running pong game"));

        gamesMenu.add(snakeGame);
        gamesMenu.add(pongGame);
        gamesMenu.add(chessGame);

        menuBar.add(gamesMenu);
        frame.setJMenuBar(menuBar);
         
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
