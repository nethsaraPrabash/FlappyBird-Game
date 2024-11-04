import javax.swing.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.io.IOException;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setVisible(true);

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}