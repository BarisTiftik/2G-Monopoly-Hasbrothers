public abstract class Property extends Location
{
    // properties
    private double price;
    protected Player owner;
    private boolean isMortgaged;

    // methods
    public abstract double calculateRent();

    public double calculateMortgageValue()
    {
        return (price / 2.0);
    }

}
