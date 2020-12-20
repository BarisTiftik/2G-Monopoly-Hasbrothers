import java.awt.image.BufferedImage;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;

public class Player {
    private String name;
    private ArrayList<Property> inventory;
    private int jumpJailRights;
    private int money;
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
    private boolean isWillingToSell;

    private boolean isWillingToBuy;
    private int sportPropertyCount;

    // constructors
    public Player(String name, ArrayList<Property> inventory, int jumpJailRights, int money, int cellIndex, BufferedImage avatar, Color avatarColor, boolean isJailed, int ownedBrown, int ownedBlue, int ownedRed, int ownedOrange, int ownedGreen, int ownedYellow, int ownedPink, int ownedCyan, boolean ownsBlue, boolean ownsBrown, boolean ownsRed, boolean ownsOrange, boolean ownsGreen, boolean ownsYellow, boolean ownsPink, boolean ownsCyan, boolean isWillingToBuy, int sportPropertyCount, boolean isWillingToSell) {
        this.name = name;
        this.inventory = inventory;
        this.jumpJailRights = jumpJailRights;
        this.money = money;
        this.cellIndex = cellIndex;
        this.avatar = avatar;
        this.avatarColor = avatarColor;
        this.isJailed = isJailed;
        this.ownedBrown = ownedBrown;
        this.ownedBlue = ownedBlue;
        this.ownedRed = ownedRed;
        this.ownedOrange = ownedOrange;
        this.ownedGreen = ownedGreen;
        this.ownedYellow = ownedYellow;
        this.ownedPink = ownedPink;
        this.ownedCyan = ownedCyan;
        this.ownsBlue = ownsBlue;
        this.ownsBrown = ownsBrown;
        this.ownsRed = ownsRed;
        this.ownsOrange = ownsOrange;
        this.ownsGreen = ownsGreen;
        this.ownsYellow = ownsYellow;
        this.ownsPink = ownsPink;
        this.ownsCyan = ownsCyan;
        this.isWillingToBuy = isWillingToBuy;
        this.isWillingToSell = isWillingToSell;
        this.sportPropertyCount = sportPropertyCount;
    }

    public Player(String name, int money, int cellIndex,
            BufferedImage avatar, Color avatarColor) {
        this.name = name;
        this.inventory = new ArrayList<Property>();
        this.jumpJailRights = 0;
        this.money = money;
        this.cellIndex = cellIndex;
        this.avatar = avatar;
        this.avatarColor = avatarColor;
        this.isJailed = false;
        this.ownedBrown = 0;
        this.ownedBlue = 0;
        this.ownedRed = 0;
        this.ownedOrange = 0;
        this.ownedGreen = 0;
        this.ownedYellow = 0;
        this.ownedPink = 0;
        this.ownedCyan = 0;
        this.ownsBlue = false;
        this.ownsBrown = false;
        this.ownsRed = false;
        this.ownsOrange = false;
        this.ownsGreen = false;
        this.ownsYellow = false;
        this.ownsPink = false;
        this.ownsCyan = false;
        this.isWillingToBuy = false;
        this.isWillingToSell = false;
        this.sportPropertyCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getInventory() {
        return this.inventory;
    }

    public void setInventory(ArrayList<Property> inventory) {
        this.inventory = inventory;
    }

    public int getJumpJailRights() {
        return this.jumpJailRights;
    }

    public void setJumpJailRights(int jumpJailRights) {
        this.jumpJailRights = jumpJailRights;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public int getCellIndex() {
        return this.cellIndex;
    }

    public void setCellIndex(int cellIndex) {
        this.cellIndex = cellIndex;
    }

    public BufferedImage getAvatar() {
        return this.avatar;
    }

    public void setAvatar(BufferedImage avatar) {
        this.avatar = avatar;
    }

    public Color getAvatarColor() {
        return this.avatarColor;
    }

    public void setAvatarColor(Color avatarColor) {
        this.avatarColor = avatarColor;
    }

    public boolean isIsJailed() {
        return this.isJailed;
    }

    public boolean getIsJailed() {
        return this.isJailed;
    }

    public void setIsJailed(boolean isJailed) {
        this.isJailed = isJailed;
    }

    public int getOwnedBrown() {
        return this.ownedBrown;
    }

    public void setOwnedBrown(int ownedBrown) {
        this.ownedBrown = ownedBrown;
    }

    public int getOwnedBlue() {
        return this.ownedBlue;
    }

    public void setOwnedBlue(int ownedBlue) {
        this.ownedBlue = ownedBlue;
    }

    public int getOwnedRed() {
        return this.ownedRed;
    }

    public void setOwnedRed(int ownedRed) {
        this.ownedRed = ownedRed;
    }

    public int getOwnedOrange() {
        return this.ownedOrange;
    }

    public void setOwnedOrange(int ownedOrange) {
        this.ownedOrange = ownedOrange;
    }

    public int getOwnedGreen() {
        return this.ownedGreen;
    }

    public void setOwnedGreen(int ownedGreen) {
        this.ownedGreen = ownedGreen;
    }

    public int getOwnedYellow() {
        return this.ownedYellow;
    }

    public void setOwnedYellow(int ownedYellow) {
        this.ownedYellow = ownedYellow;
    }

    public int getOwnedPink() {
        return this.ownedPink;
    }

    public void setOwnedPink(int ownedPink) {
        this.ownedPink = ownedPink;
    }

    public int getOwnedCyan() {
        return this.ownedCyan;
    }

    public void setOwnedCyan(int ownedCyan) {
        this.ownedCyan = ownedCyan;
    }

    public boolean isOwnsBlue() {
        return this.ownsBlue;
    }

    public boolean getOwnsBlue() {
        return this.ownsBlue;
    }

    public void setOwnsBlue(boolean ownsBlue) {
        this.ownsBlue = ownsBlue;
    }

    public boolean isOwnsBrown() {
        return this.ownsBrown;
    }

    public boolean getOwnsBrown() {
        return this.ownsBrown;
    }

    public void setOwnsBrown(boolean ownsBrown) {
        this.ownsBrown = ownsBrown;
    }

    public boolean isOwnsRed() {
        return this.ownsRed;
    }

    public boolean getOwnsRed() {
        return this.ownsRed;
    }

    public void setOwnsRed(boolean ownsRed) {
        this.ownsRed = ownsRed;
    }

    public boolean isOwnsOrange() {
        return this.ownsOrange;
    }

    public boolean getOwnsOrange() {
        return this.ownsOrange;
    }

    public void setOwnsOrange(boolean ownsOrange) {
        this.ownsOrange = ownsOrange;
    }

    public boolean isOwnsGreen() {
        return this.ownsGreen;
    }

    public boolean getOwnsGreen() {
        return this.ownsGreen;
    }

    public void setOwnsGreen(boolean ownsGreen) {
        this.ownsGreen = ownsGreen;
    }

    public boolean isOwnsYellow() {
        return this.ownsYellow;
    }

    public boolean getOwnsYellow() {
        return this.ownsYellow;
    }

    public void setOwnsYellow(boolean ownsYellow) {
        this.ownsYellow = ownsYellow;
    }

    public boolean isOwnsPink() {
        return this.ownsPink;
    }

    public boolean getOwnsPink() {
        return this.ownsPink;
    }

    public void setOwnsPink(boolean ownsPink) {
        this.ownsPink = ownsPink;
    }

    public boolean isOwnsCyan() {
        return this.ownsCyan;
    }

    public boolean getOwnsCyan() {
        return this.ownsCyan;
    }

    public void setOwnsCyan(boolean ownsCyan) {
        this.ownsCyan = ownsCyan;
    }

    public int getBROWN_BLUE_LIMIT() {
        return this.BROWN_BLUE_LIMIT;
    }


    public int getREST_LIMIT() {
        return this.REST_LIMIT;
    }


    public boolean isIsWillingToBuy() {
        return this.isWillingToBuy;
    }

    public boolean getIsWillingToBuy() {
        return this.isWillingToBuy;
    }

    public void setIsWillingToBuy(boolean isWillingToBuy) {
        this.isWillingToBuy = isWillingToBuy;
    }
    public void setSportPropertyCount(int sportPropertyCount) {
        this.sportPropertyCount = sportPropertyCount;
    }

    public Player name(String name) {
        this.name = name;
        return this;
    }

    public Player inventory(ArrayList<Property> inventory) {
        this.inventory = inventory;
        return this;
    }

    public Player jumpJailRights(int jumpJailRights) {
        this.jumpJailRights = jumpJailRights;
        return this;
    }

    public Player money(int money) {
        this.money = money;
        return this;
    }

    public Player cellIndex(int cellIndex) {
        this.cellIndex = cellIndex;
        return this;
    }

    public Player avatar(BufferedImage avatar) {
        this.avatar = avatar;
        return this;
    }

    public Player avatarColor(Color avatarColor) {
        this.avatarColor = avatarColor;
        return this;
    }

    public Player isJailed(boolean isJailed) {
        this.isJailed = isJailed;
        return this;
    }

    public Player ownedBrown(int ownedBrown) {
        this.ownedBrown = ownedBrown;
        return this;
    }

    public Player ownedBlue(int ownedBlue) {
        this.ownedBlue = ownedBlue;
        return this;
    }

    public Player ownedRed(int ownedRed) {
        this.ownedRed = ownedRed;
        return this;
    }

    public Player ownedOrange(int ownedOrange) {
        this.ownedOrange = ownedOrange;
        return this;
    }

    public Player ownedGreen(int ownedGreen) {
        this.ownedGreen = ownedGreen;
        return this;
    }

    public Player ownedYellow(int ownedYellow) {
        this.ownedYellow = ownedYellow;
        return this;
    }

    public Player ownedPink(int ownedPink) {
        this.ownedPink = ownedPink;
        return this;
    }

    public Player ownedCyan(int ownedCyan) {
        this.ownedCyan = ownedCyan;
        return this;
    }

    public Player ownsBlue(boolean ownsBlue) {
        this.ownsBlue = ownsBlue;
        return this;
    }

    public Player ownsBrown(boolean ownsBrown) {
        this.ownsBrown = ownsBrown;
        return this;
    }

    public Player ownsRed(boolean ownsRed) {
        this.ownsRed = ownsRed;
        return this;
    }

    public Player ownsOrange(boolean ownsOrange) {
        this.ownsOrange = ownsOrange;
        return this;
    }

    public Player ownsGreen(boolean ownsGreen) {
        this.ownsGreen = ownsGreen;
        return this;
    }

    public Player ownsYellow(boolean ownsYellow) {
        this.ownsYellow = ownsYellow;
        return this;
    }

    public Player ownsPink(boolean ownsPink) {
        this.ownsPink = ownsPink;
        return this;
    }

    public Player ownsCyan(boolean ownsCyan) {
        this.ownsCyan = ownsCyan;
        return this;
    }

    public Player sportPropertyCount(int sportPropertyCount) {
        this.sportPropertyCount = sportPropertyCount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Player)) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(inventory, player.inventory) && jumpJailRights == player.jumpJailRights && money == player.money && cellIndex == player.cellIndex && Objects.equals(avatar, player.avatar) && Objects.equals(avatarColor, player.avatarColor) && isJailed == player.isJailed && ownedBrown == player.ownedBrown && ownedBlue == player.ownedBlue && ownedRed == player.ownedRed && ownedOrange == player.ownedOrange && ownedGreen == player.ownedGreen && ownedYellow == player.ownedYellow && ownedPink == player.ownedPink && ownedCyan == player.ownedCyan && ownsBlue == player.ownsBlue && ownsBrown == player.ownsBrown && ownsRed == player.ownsRed && ownsOrange == player.ownsOrange && ownsGreen == player.ownsGreen && ownsYellow == player.ownsYellow && ownsPink == player.ownsPink && ownsCyan == player.ownsCyan && BROWN_BLUE_LIMIT == player.BROWN_BLUE_LIMIT && REST_LIMIT == player.REST_LIMIT && isWillingToBuy == player.isWillingToBuy && sportPropertyCount == player.sportPropertyCount;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", inventory='" + getInventory() + "'" +
            ", jumpJailRights='" + getJumpJailRights() + "'" +
            ", money='" + getMoney() + "'" +
            ", cellIndex='" + getCellIndex() + "'" +
            ", avatar='" + getAvatar() + "'" +
            ", avatarColor='" + getAvatarColor() + "'" +
            ", isJailed='" + isIsJailed() + "'" +
            ", ownedBrown='" + getOwnedBrown() + "'" +
            ", ownedBlue='" + getOwnedBlue() + "'" +
            ", ownedRed='" + getOwnedRed() + "'" +
            ", ownedOrange='" + getOwnedOrange() + "'" +
            ", ownedGreen='" + getOwnedGreen() + "'" +
            ", ownedYellow='" + getOwnedYellow() + "'" +
            ", ownedPink='" + getOwnedPink() + "'" +
            ", ownedCyan='" + getOwnedCyan() + "'" +
            ", ownsBlue='" + isOwnsBlue() + "'" +
            ", ownsBrown='" + isOwnsBrown() + "'" +
            ", ownsRed='" + isOwnsRed() + "'" +
            ", ownsOrange='" + isOwnsOrange() + "'" +
            ", ownsGreen='" + isOwnsGreen() + "'" +
            ", ownsYellow='" + isOwnsYellow() + "'" +
            ", ownsPink='" + isOwnsPink() + "'" +
            ", ownsCyan='" + isOwnsCyan() + "'" +
            ", BROWN_BLUE_LIMIT='" + getBROWN_BLUE_LIMIT() + "'" +
            ", REST_LIMIT='" + getREST_LIMIT() + "'" +
            ", isWillingToBuy='" + isIsWillingToBuy() + "'" +
            ", sportPropertyCount='" + getSportPropertyCount() + "'" +
            "}";
    }
    

    // methods
    public void buyProperty(Property property, int price)
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

    public void payTax(int taxAmount)
    {
        loseMoney(taxAmount);
    }

    public void loseMoney(int loseAmount)
    {
        money -= loseAmount;
    }

    public void gainMoney(int gainAmount)
    {
        money += gainAmount;
    }

    public void payRent(Player owner, int currentRent)
    {
        loseMoney(currentRent);
        owner.gainMoney(currentRent);
    }

    public void mortgageProperty(Property property)
    {
        if (!property.getMortgaged())
        {
            property.mortgage(this);
            this.gainMoney(property.calculateMortgageValue());
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

    public void getSalary(int salaryAmount)
    {
        money += 200;
    }

    public int getSportPropertyCount()
    {
        return sportPropertyCount;
    }

    public int getMoney()
    {
        return money;
    }

    // setters
    public void setIndex(int nextIndex)
    {
        cellIndex = nextIndex;
    }

	// public void bergain(Property property, Player owner) {
    //     if(owner.askPlayerForBergain(property)) {
    //         this.money -= 
    //     }
    //     else {

    //     }
	// }

    // private boolean askPlayerForBergain(Property property) {
    //     // create 
        
    //     if( isWillingToSell){
    //         return true;
    //     }

    //     else{
    //         return false;
    //     }
    // }


}
