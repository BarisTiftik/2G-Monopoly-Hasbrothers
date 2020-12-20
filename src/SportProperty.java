public class SportProperty extends Property
{
    // properties

    // constructors
    public SportProperty( int price, int[] rents )
    {
        super(price,rents);
    }

    // methods
    public int calculateRent()
    {
        int sportPropertyCount = getOwner().getSportPropertyCount();
        return getRents()[sportPropertyCount - 1];
    }
}
