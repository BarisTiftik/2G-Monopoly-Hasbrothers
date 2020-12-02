public class TaxLocation extends Location implements SpecialLocation
{
    // properties
    private double taxAmount;

    // constructors
    public TaxLocation( double taxAmount )
    {
        this.taxAmount = taxAmount;
    }

    // methods
    public void action(Player player)
    {
        player.payTax( taxAmount );
    }
}
