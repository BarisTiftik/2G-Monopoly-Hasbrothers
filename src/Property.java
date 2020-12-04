public abstract class Property extends Location implements Rentable
{
    // properties
    private double price;
    private double[] rents;
    private Player owner;
    private boolean isMortgaged;

    // constructors
    public Property(double price, double[] rents)
    {
        this.price = price;
        this.rents = rents;
        owner = null;
        isMortgaged = false;
    }

    // methods
    public abstract double calculateRent();

    public double calculateMortgageValue()
    {
        return (price / 2.0);
    }

    public void action(Player player)
    {
        if( getOwner() != null )
        {
            double rent = calculateRent();
            if (rent <= player.getMoney())
            {
                player.loseMoney(rent);
                getOwner().gainMoney(rent);
            }
            // else trouble
        }
    }

    // getters
    public Player getOwner()
    {
        return owner;
    }

    public double[] getRents()
    {
        return rents;
    }
}
