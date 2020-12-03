public class SportProperty extends Property implements Rentable
{
    // properties
    private double[] rents;

    // constructors
    public SportProperty( double price, double[] rents )
    {
        super(price);
        this.rents = rents;
    }

    // methods
    public double calculateRent()
    {
        int sportPropertyCount = owner.getSportPropertyCount();
        return rents[sportPropertyCount - 1];
    }

    public void action(Player player)
    {
        if( owner != null )
        {
            player.loseMoney(calculateRent());
            owner.gainMoney(calculateRent());
        }
    }
}
