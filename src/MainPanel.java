import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private Button[] buttons;
    public MainPanel(){

        setBackground(Color.black);
        setLayout(new GridLayout(3,3));

        for (int i = 0; i < 9; i++){
            Button b = new Button(i+1);
            add(b);
            buttons[i] = b;
        }
    }

    public Button[] getButtons() {
        return buttons;
    }
}
