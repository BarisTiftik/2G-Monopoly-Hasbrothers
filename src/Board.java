import java.util.*;

public class Board
{
    // properties
    static Cell[] cells;
    private ChanceCard[] chanceCards;
    private CommunityChestCard[] communityChestCards;
    static Queue<Card> chanceDeck;
    static Queue<Card> communityChestDeck;

    // constructors
    public Board()
    {
        cells = new Cell[40];
        // cells' locations will be initialized later
        // TODO

        chanceCards = new ChanceCard[16];
        // chance cards will be initialized later
        chanceCards[0] = new ChanceCard(" Take to Haydarpaşa Train Station. Take 200M if you pass the starting point. ",0);
        chanceCards[1] = new ChanceCard(" Proceed to Yeniköy. ",1);
        chanceCards[2] = new ChanceCard(" Proceed to the nearest public institution. If you don't own it, you can buy it. Roll the dice if you have an owner and pay 10 times the dice rolled. ",2);
        chanceCards[3] = new ChanceCard(" Move forward to the starting point, get 200 M. ",3);
        chanceCards[4] = new ChanceCard(" Move back 3 digits. ",4);
        chanceCards[5] = new ChanceCard(" Move on to Caddebostan. Take 200M if you pass the starting point. ",5);
        chanceCards[6] = new ChanceCard(" Proceed to the nearest pier or station. If you don't own it, you can buy it. Pay twice the rent I would normally have to pay if he owns it. ",6);
        chanceCards[7] = new ChanceCard(" Speeding penalty. Pay 15M. ",7);
        chanceCards[8] = new ChanceCard(" Repair all your buildings. Pay 25M per house and 100M per hotel. ",8);
        chanceCards[9] = new ChanceCard(" Exit jail free. It can be sold to the bank or stored. ",9);
        chanceCards[10] = new ChanceCard(" Get into the right jail. Don't go through the starting point. Receiving 200M. ",10);
        chanceCards[11] = new ChanceCard(" The bank pays 50 million dividends. ",11);
        chanceCards[12] = new ChanceCard(" Move on to Beyoğlu. If you pass the starting point, take 200M. ",12);
        chanceCards[13] = new ChanceCard(" You have been elected chairman of the board. Pay 50M to each player. ",13);
        chanceCards[14] = new ChanceCard(" Move as far as you want, with a maximum of 5. ",14);
        chanceCards[15] = new ChanceCard(" You rented your house. Take 150M. ",15);
        // TODO

        shuffleDeck(chanceCards);
        chanceDeck = new LinkedList<Card>();
        chanceDeck.addAll(Arrays.asList(chanceCards));

        communityChestCards = new CommunityChestCard[16];
        // community chest cards will be initialized later
        communityChestCards[0] = new CommunityChestCard(" Annual interest payment. Take 100M. ",0);
        communityChestCards[1] = new CommunityChestCard(" Get into the right jail. Don't go through the starting point. Receiving 200M. ",1);
        communityChestCards[2] = new CommunityChestCard(" Exit jail free. It can be sold to the bank or stored. ",2);
        communityChestCards[3] = new CommunityChestCard(" Incorrect bank account. Take 200M. ",3);
        communityChestCards[4] = new CommunityChestCard(" The payment you expect from the insurance has arrived. Take 100M. ",4);
        communityChestCards[5] = new CommunityChestCard(" You have been inherited 100M. ",5);
        communityChestCards[6] = new CommunityChestCard(" Get 25M for your consulting fee. ",6);
        communityChestCards[7] = new CommunityChestCard(" You won the second prize from the beauty contest. Take 10M. ",7);
        communityChestCards[8] = new CommunityChestCard(" You earned 50M from a stock sale. ",8);
        communityChestCards[9] = new CommunityChestCard(" Move forward to the starting point. Take 200M. ",9);
        communityChestCards[10] = new CommunityChestCard(" Tax refund. Take 20M. ",10);
        communityChestCards[11] = new CommunityChestCard(" Make street repairs. Pay 40 for each house you own and 115M for each payout. ",11);
        communityChestCards[12] = new CommunityChestCard(" Today is your birthday. Collect 10M from each player. ",12);
        communityChestCards[13] = new CommunityChestCard(" Pay 100m to the hospital. ",13);
        communityChestCards[14] = new CommunityChestCard(" Pay 50M for doctor visit. ",14);
        communityChestCards[15] = new CommunityChestCard(" Pay the school taxi. 50M ",15);
        // TODO

        shuffleDeck(communityChestCards);
        communityChestDeck = new LinkedList<Card>();
        communityChestDeck.addAll(Arrays.asList(communityChestCards));
    }

    // methods
    public static void movePlayer(Player player, int nextIndex)
    {
        cells[player.getIndex()].removePlayer(player);
        cells[nextIndex].addPlayer(player);
        player.setIndex(nextIndex);
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
