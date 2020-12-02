public class Board
{
    // properties
    private Cell[] cells;

    // constructors
    public Board()
    {
        cells = new Cell[40];
        // cells' locations will be initialized later
    }

    // methods
    public void movePlayer(Player player, int nextIndex)
    {
        cells[player.getIndex()].removePlayer(player);
        cells[nextIndex].addPlayer(player);
    }
}
