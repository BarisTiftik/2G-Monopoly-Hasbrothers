
public class JailLocation extends Location implements SpecialLocation
{
    // constructors
    public JailLocation()
    {
    }

    // methods
    public void action(Player player)
    {
        player.goToJail();
    }
}
