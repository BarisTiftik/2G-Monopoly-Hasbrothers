import javafx.scene.paint.Color;
import java.util.ArrayList;

public class Estate extends Property implements Rentable
{
    // properties
    private int hotel;
    private int houses;
    private Color estateColor;
    private int maxColorCount;

    // constructors
    public Estate( double price, double[] rents, Color estateColor, int maxColorCount )
    {
        super(price, rents);
        hotel = 0;
        houses = 0;
        this.estateColor = estateColor;
        this.maxColorCount = maxColorCount;
    }

    // methods
    public double calculateRent()
    {
        if( hotel == 0 )
        {
            ArrayList<Color> ownedColors = getOwner().getOwnedColors();

            if( houses == 0 && ownedColors.contains(estateColor) )
                return 2.0 * getRents()[houses];

            return getRents()[houses];
        }
        return getRents()[5];
    }

    public void action(Player player)
    {
        if( getOwner() != null )
        {
            player.loseMoney(calculateRent());
            getOwner().gainMoney(calculateRent());
        }
    }
}
