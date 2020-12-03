public class ChanceLocation extends CardLocation implements SpecialLocation
{
    // constructors
    public ChanceLocation()
    {
    }

    public void action(Player player)
    {
        Card currentCard = Board.drawCard(Board.chanceDeck);
    }
}
