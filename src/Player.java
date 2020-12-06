import java.awt.image.BufferedImage;

import java.awt.Color;
import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Property> inventory;
    private int jumpJailRights;
    private double money;
    private int cellIndex;
    private BufferedImage avatar;
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
    private int sportPropertyCount;

    // constructors
    // TODO

    // methods
    public void buyProperty(Property property, double price)
    {
        loseMoney(price);
        property.setOwner(this);
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
        ArrayList<Color> ownedColors = new ArrayList<Color>();

        if (ownedBrown == BROWN_BLUE_LIMIT)
            ownedColors.add(new Color(150, 75,0)); // brown
        if (ownedBlue == BROWN_BLUE_LIMIT)
            ownedColors.add(Color.BLUE);
        if (ownedCyan == REST_LIMIT)
            ownedColors.add(Color.CYAN);
        if (ownedGreen == REST_LIMIT)
            ownedColors.add(Color.GREEN);
        if (ownedOrange == REST_LIMIT)
            ownedColors.add(Color.ORANGE);
        if (ownedPink == REST_LIMIT)
            ownedColors.add(Color.PINK);
        if (ownedRed == REST_LIMIT)
            ownedColors.add(Color.RED);
        if (ownedYellow == REST_LIMIT)
            ownedColors.add(Color.YELLOW);

        return ownedColors;
    }

    public void getSalary(double salaryAmount)
    {
        money += 200;
    }

    public int getSportPropertyCount()
    {
        return sportPropertyCount;
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
