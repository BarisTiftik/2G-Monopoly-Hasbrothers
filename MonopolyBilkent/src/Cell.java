import java.util.ArrayList;

public class Cell
{
    // properties
    private ArrayList<Player> playersHere;
    private Location location;

    // constructors
    public Cell( Location location )
    {
        playersHere = new ArrayList<Player>();
        this.location = location;
    }

    // methods
    public void addPlayer(Player player)
    {
        playersHere.add(player);
    }

    public void removePlayer(Player player)
    {
        playersHere.remove(player);
    }
}
