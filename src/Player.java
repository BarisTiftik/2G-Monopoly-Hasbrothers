import javafx.scene.paint.Color;
import java.util.ArrayList;

public class Player {
    String name;
    Property[] inventory;
    int jumpJailRights;
    double money;
    int cellIndex;
    Image avatar;
    Color avatarColor;
    boolean isJailed;
    int ownedBrown;
    int ownedBlue;
    int ownedRed;
    int ownedOrange;
    int ownedGreen;
    int ownedYellow;
    int ownedPink;
    int ownedCyan;
    boolean ownsBlue;
    boolean ownsBrown;
    boolean ownsRed;
    boolean ownsOrange;
    boolean ownsGreen;
    boolean ownsYellow;
    boolean ownsPink;
    boolean ownsCyan;
    final int BROWN_BLUE_LIMIT = 2;
    final int REST_LIMIT = 3;

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
}
