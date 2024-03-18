public class Game {
    private Player player1;
    private Player player2;

    private Button[] buttons;

    boolean playing;
    Player playingPlayer;
    public void startGame(){
        do {
            playingPlayer = player1;
            System.out.println();
        }while(playing);
    }

}
