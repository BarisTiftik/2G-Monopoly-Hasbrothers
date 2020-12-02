public abstract class Property extends Location
{
    // properties
    private double price;
    private Player owner;
    private boolean isMortgaged;

    // methods
    public abstract double calculateRent(Player owner);

    public double calculateMortgageValue()
    {
        return (price / 2.0);
    }

}
