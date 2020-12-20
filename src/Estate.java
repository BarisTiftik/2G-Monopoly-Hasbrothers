import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;

public class Estate extends Property
{
    // properties
    private int hotel;
    private int houses;
    private Color estateColor;
    private int maxColorCount;

    // constructors
    public Estate( int price, int[] rents, Color estateColor, int maxColorCount )
    {
        super(price, rents);
        hotel = 0;
        houses = 0;
        this.estateColor = estateColor;
        this.maxColorCount = maxColorCount;
    }

    public int getHotel() {
        return this.hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public int getHouses() {
        return this.houses;
    }

    public void setHouses(int houses) {
        this.houses = houses;
    }

    public Color getEstateColor() {
        return this.estateColor;
    }

    public void setEstateColor(Color estateColor) {
        this.estateColor = estateColor;
    }

    public int getMaxColorCount() {
        return this.maxColorCount;
    }

    public void setMaxColorCount(int maxColorCount) {
        this.maxColorCount = maxColorCount;
    }

    public Estate hotel(int hotel) {
        this.hotel = hotel;
        return this;
    }

    public Estate houses(int houses) {
        this.houses = houses;
        return this;
    }

    public Estate estateColor(Color estateColor) {
        this.estateColor = estateColor;
        return this;
    }

    public Estate maxColorCount(int maxColorCount) {
        this.maxColorCount = maxColorCount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estate)) {
            return false;
        }
        Estate estate = (Estate) o;
        return hotel == estate.hotel && houses == estate.houses && Objects.equals(estateColor, estate.estateColor) && maxColorCount == estate.maxColorCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotel, houses, estateColor, maxColorCount);
    }

    @Override
    public String toString() {
        return "{" +
            " hotel='" + getHotel() + "'" +
            ", houses='" + getHouses() + "'" +
            ", estateColor='" + getEstateColor() + "'" +
            ", maxColorCount='" + getMaxColorCount() + "'" +
            "}";
    }

    // methods
    public int calculateRent()
    {
        if( hotel == 0 )
        {
            ArrayList<Color> ownedColors = getOwner().getOwnedColors();

            if( houses == 0 && ownedColors.contains(estateColor) )
                return 2 * getRents()[houses];

            return getRents()[houses];
        }
        return getRents()[5];
    }
}
