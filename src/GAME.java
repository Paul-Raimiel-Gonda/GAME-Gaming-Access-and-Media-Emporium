import javax.swing.*;
import forms.*;

//MAIN FILE
public class GAME {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GAME: Gaming Access and Media Emporium - Login");
        frame.setContentPane(new LoginForm(frame).getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}