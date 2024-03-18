import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public MainPanel(){
        setBackground(Color.black);
        setLayout(new GridLayout(3,3));

        for (int i = 0; i < 9; i++){
            add(new Button(i+1));
        }
    }
}
