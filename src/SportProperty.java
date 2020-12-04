public class SportProperty extends Property
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
}
