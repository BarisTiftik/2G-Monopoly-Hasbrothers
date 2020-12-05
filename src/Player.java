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

    public int getIndex() {
        return 0;
    }

    public ArrayList<Color> getOwnedColors() {
        return null;
    }

    public void goToJail() {
    }

    public void getSalary(double salaryAmount) {
    }

    public void payTax(double taxAmount) {
    }

    public void loseMoney(double money) {
    }

    public int getSportPropertyCount() {
        return 0;
    }

    public void gainMoney(double money) {
    }

    public void setIndex(int nextIndex) {
    }

    public double getMoney() {
        return 0;
    }

    public void payRent(Player owner, double currentRent)
    {
        loseMoney(currentRent);
        owner.gainMoney(currentRent);
    }

    public boolean isWillingToBuy()
    {
        return false;
    }

    public void buyProperty(Property property, double price)
    {
        loseMoney(price);
        inventory.add(property);
    }
}
