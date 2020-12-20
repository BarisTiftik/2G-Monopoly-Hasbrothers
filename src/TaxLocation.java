public class TaxLocation extends Location implements SpecialLocation
{
    // properties
    private int taxAmount;

    // constructors
    public TaxLocation( int taxAmount )
    {
        this.taxAmount = taxAmount;
    }

    // methods
    public void action(Player player)
    {
        if (taxAmount <= player.getMoney())
            player.payTax( taxAmount );
        // else trouble TODO
    }
}
