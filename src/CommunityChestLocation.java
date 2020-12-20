public class CommunityChestLocation extends CardLocation
{
    // methods
    public void action(Player player)
    {
        Card currentCard = Board.drawCard(Board.communityChestDeck);
        // Make an action on the player according to card index
        // TODO
        if (currentCard.cardIndex == 0) // Annual interest payment. Take 100M.
        {
            player.setMoney(player.getMoney()+100);
        }
        else if (currentCard.cardIndex == 3) // Incorrect bank account. Take 200M.
        {
            player.setMoney(player.getMoney()+200);
        }
        else if (currentCard.cardIndex == 10) // Tax refund. Take 20M.
        {
            player.setMoney(player.getMoney()+20);
        }
    }
}
