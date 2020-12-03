import java.util.*;

public class Board
{
    // properties
    private Cell[] cells;
    private ChanceCard[] chanceCards;
    private CommunityChestCard[] communityChestCards;
    static Queue<Card> chanceDeck;
    static Queue<Card> communityChestDeck;

    // constructors
    public Board()
    {
        cells = new Cell[40];
        // cells' locations will be initialized later

        chanceCards = new ChanceCard[16];
        // chance cards will be initialized later
        shuffleDeck(chanceCards);
        chanceDeck = new LinkedList<Card>();
        for (int i = 0; i < 16; i++)
        {
            chanceDeck.add(chanceCards[i]);
        }

        communityChestCards = new CommunityChestCard[16];
        // community chest cards will be initialized later
        shuffleDeck(communityChestCards);
        communityChestDeck = new LinkedList<Card>();
        for (int i = 0; i < 16; i++)
        {
            communityChestDeck.add(communityChestCards[i]);
        }
    }

    // methods
    public void movePlayer(Player player, int nextIndex)
    {
        cells[player.getIndex()].removePlayer(player);
        cells[nextIndex].addPlayer(player);
    }

    public void shuffleDeck(Card[] deck)
    {
        List<Card> cardList = Arrays.asList(deck);
        Collections.shuffle(cardList);
        cardList.toArray(deck);
    }

    public static Card drawCard(Queue<Card> deck)
    {
        Card pickedCard = deck.poll(); // pick the first card
        deck.add(pickedCard); // put it to the last
        return pickedCard;
    }

    public void act(Player player)
    {
        Location currentLocation = cells[player.getIndex()].getLocation();
        currentLocation.action(player);
    }

}
