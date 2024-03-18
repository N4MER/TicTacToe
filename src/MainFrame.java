import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        setTitle("Piskvorky");
        setPreferredSize(new Dimension(600,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel panel = new MainPanel();
        add(panel);
        pack();
        setVisible(true);
    }
}
