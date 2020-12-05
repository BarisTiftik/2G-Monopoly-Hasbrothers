import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Property> inventory;
    private int jumpJailRights;
    private double money;
    private int cellIndex;
    private Image avatar;
    private Color avatarColor;
    private boolean isJailed;
    private int ownedBrown;
    private int ownedBlue;
    private int ownedRed;
    private int ownedOrange;
    private int ownedGreen;
    private int ownedYellow;
    private int ownedPink;
    private int ownedCyan;
    private boolean ownsBlue;
    private boolean ownsBrown;
    private boolean ownsRed;
    private boolean ownsOrange;
    private boolean ownsGreen;
    private boolean ownsYellow;
    private boolean ownsPink;
    private boolean ownsCyan;
    private final int BROWN_BLUE_LIMIT = 2;
    private final int REST_LIMIT = 3;

    private boolean isWillingToBuy;

    // constructors
    // TODO

    // methods
    public void buyProperty(Property property, double price)
    {
        loseMoney(price);
        inventory.add(property);
    }

    public boolean isWillingToBuy()
    {
        return isWillingToBuy;
    }

    public void goToJail()
    {
        isJailed = true;
    }

    public void payTax(double taxAmount)
    {
        loseMoney(taxAmount);
    }

    public void loseMoney(double loseAmount)
    {
        money -= loseAmount;
    }

    public void gainMoney(double gainAmount)
    {
        money += gainAmount;
    }

    public void payRent(Player owner, double currentRent)
    {
        loseMoney(currentRent);
        owner.gainMoney(currentRent);
    }

    public void mortgageProperty(Property property)
    {
        if (!property.getMortgaged())
        {
            property.mortgage(this);
            gainMoney(property.calculateMortgageValue());
        }
    }

    public boolean isWillingToMortgage()
    {
        // TODO
        return false;
    }

    // getters
    public int getIndex()
    {
        return cellIndex;
    }

    public ArrayList<Color> getOwnedColors()
    {
        // TODO
        return null;
    }

    public void getSalary(double salaryAmount)
    {
        money += 200;
    }

    public int getSportPropertyCount()
    {
        // TODO
        return 0;
    }

    public double getMoney()
    {
        return money;
    }

    // setters
    public void setIndex(int nextIndex)
    {
        cellIndex = nextIndex;
    }


}
