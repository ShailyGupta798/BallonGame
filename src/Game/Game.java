package Game;

import javax.swing.*;

public class Game {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
