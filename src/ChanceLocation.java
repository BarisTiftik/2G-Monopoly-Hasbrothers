public class ChanceLocation extends CardLocation implements SpecialLocation
{
    // methods
    public void action(Player player)
    {
        Card currentCard = Board.drawCard(Board.chanceDeck);
        // Make an action on the player according to card index
        // TODO
    }
}
