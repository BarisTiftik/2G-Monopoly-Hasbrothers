public class SportProperty extends Property implements Rentable
{
    // properties

    // constructors
    public SportProperty( double price, double[] rents )
    {
        super(price,rents);
    }

    // methods
    public double calculateRent()
    {
        int sportPropertyCount = getOwner().getSportPropertyCount();
        return getRents()[sportPropertyCount - 1];
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
