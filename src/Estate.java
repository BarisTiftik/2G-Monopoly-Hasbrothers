import javafx.scene.paint.Color;
import java.util.ArrayList;

public class Estate extends Property implements Rentable
{
    // properties
    private int hotel;
    private int houses;
    private Color estateColor;
    private int maxColorCount;
    private double[] rents;

    // constructors
    public Estate( double[] rents, Color estateColor, int maxColorCount )
    {
        hotel = 0;
        houses = 0;
        this.estateColor = estateColor;
        this.maxColorCount = maxColorCount;
        this.rents = rents;
    }

    // methods
    public double calculateRent()
    {
        if( hotel == 0 )
        {
            ArrayList<Color> ownedColors = owner.getOwnedColors();

            if( houses == 0 && ownedColors.contains(estateColor) )
                return 2.0 * rents[houses];

            return rents[houses];
        }
        return rents[5];
    }

    public void action(Player player)
    {
        player.loseMoney(calculateRent());
    }
}
