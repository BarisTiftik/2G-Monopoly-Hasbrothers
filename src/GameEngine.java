import java.util.ArrayList;
import java.util.Arrays;

public class GameEngine
{
    // properties
    Board board;
    ArrayList<Player> players;
    int turn; // 0 to 5
    Dice dice;

    // constructors
    public GameEngine(Player[] playerList)
    {
        board = new Board();
        players.addAll(Arrays.asList(playerList));
        turn = 0;
        dice = new Dice();
    }

    // methods
    public void playGame()
    {
        // everything
    }

    public void completeTurn()
    {
        if (turn == players.size() - 1)
            turn = 0;
        else
            turn++;
    }

    public Player decideWhoseTurn()
    {
        return players.get(turn);
    }


}
