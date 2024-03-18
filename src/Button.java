import javax.swing.*;

public class Button extends JButton {
    private int number;
    private String buttonSymbol;
    public void setSymbol(Player player){
        buttonSymbol=player.getSymbol();

    }
    public Button(int  number) {
        this.number = number;


    }
}
