public class ChanceLocation extends CardLocation implements SpecialLocation
{
    // methods
    public void action(Player player)
    {
        Card currentCard = Board.drawCard(Board.chanceDeck);
        // Make an action on the player according to card index
        // TODO
        if (currentCard.cardIndex == 0)
        {
            if (player.getIndex() > 4)
                player.getSalary(200);
            Board.movePlayer(player, 4);
        }
        else if (currentCard.cardIndex == 1)
        {
            Board.movePlayer(player, 15);
            Location currentLocation = Board.cells[player.getIndex()].getLocation();
            currentLocation.action(player);
        }
        else if (currentCard.cardIndex == 2)
        {

        }
    }
}
