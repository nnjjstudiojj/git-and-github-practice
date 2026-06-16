import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {
    public static void main(String[] args) {

        int width = 400;
        int height = 300;

        JFrame frame = new JFrame("git demo");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        JMenuBar menuBar = new JMenuBar();

        JMenu gamesMenu = new JMenu("Games");

        JMenuItem snakeGame = new JMenuItem("Snake");
        JMenuItem pongGame = new JMenuItem("Pong");
        JMenuItem chessGame = new JMenuItem("Chess");

        snakeGame.addActionListener(e -> {
            frame.dispose();
            runFrame(new snakePanel(), "Snake");
        });

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

    private static void runFrame(gamePanel panel, String name) {

        JFrame frame = new JFrame(name);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
