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
        if( owner != null )
        {
            double currentRent = calculateRent();
            if (currentRent <= player.getMoney())
            {
                player.payRent(owner, currentRent);
            }
            // else trouble TODO
        }
        else
        {
            if (player.isWillingToBuy() && player.getMoney() >= price)
            {
                player.buyProperty(this, price);
            }
        }
    }

    public void mortgage(Player player)
    {
        if (player.isWillingToMortgage())
            isMortgaged = true;
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

    public boolean getMortgaged()
    {
        return isMortgaged;
    }
}
