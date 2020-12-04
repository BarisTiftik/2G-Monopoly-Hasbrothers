public class StartLocation extends Location implements SpecialLocation
{
    // properties
    private double salaryAmount;

    // constructors
    public StartLocation()
    {
        salaryAmount = 200;
    }

    // methods
    public void action(Player player)
    {
        player.getSalary( salaryAmount );
    }
}
