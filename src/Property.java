import java.util.Objects;

public abstract class Property extends Location implements Rentable
{
    // properties
    private int price;
    private int[] rents;
    
    private Player owner;
    private boolean isMortgaged;

    // constructors
    protected Property(int price, int[] rents)
    {
        this.price = price;
        this.rents = rents;
        owner = null;
        isMortgaged = false;
    }

    protected Property(int price, int[] rents, Player owner, boolean isMortgaged) {
        this.price = price;
        this.rents = rents;
        this.owner = owner;
        this.isMortgaged = isMortgaged;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setRents(int[] rents) {
        this.rents = rents;
    }

    public boolean isIsMortgaged() {
        return this.isMortgaged;
    }

    public boolean getIsMortgaged() {
        return this.isMortgaged;
    }

    public void setIsMortgaged(boolean isMortgaged) {
        this.isMortgaged = isMortgaged;
    }

    public Property price(int price) {
        this.price = price;
        return this;
    }

    public Property rents(int[] rents) {
        this.rents = rents;
        return this;
    }

    public Property owner(Player owner) {
        this.owner = owner;
        return this;
    }

    public Property isMortgaged(boolean isMortgaged) {
        this.isMortgaged = isMortgaged;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Property)) {
            return false;
        }
        Property property = (Property) o;
        return price == property.price && Objects.equals(rents, property.rents) && Objects.equals(owner, property.owner) && isMortgaged == property.isMortgaged;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, rents, owner, isMortgaged);
    }

    @Override
    public String toString() {
        return "{" +
            " price='" + getPrice() + "'" +
            ", rents='" + getRents() + "'" +
            ", owner='" + getOwner() + "'" +
            ", isMortgaged='" + isIsMortgaged() + "'" +
            "}";
    }

    // methods
    public abstract int calculateRent();

    public int calculateMortgageValue()
    {
        return (price / 2);
    }

    public void action(Player player)
    {
        if( owner != null )
        {
            int currentRent = calculateRent();

            if (currentRent <= player.getMoney())
            {
                player.payRent(owner, currentRent);

                player.getInventory().add(this);

                player.setInventory(player.getInventory());
            }
            
            else{
                System.out.println("Error: Money is not enough \n");
            }
        }

        // !!! TODO
        else
        {
            if (player.isWillingToBuy() && player.getMoney() >= price)
            {
                // player.bergain(this, this.owner);
            }
        }
    }

    public void mortgage(Player player)
    {
        if (player.isWillingToMortgage())
            isMortgaged = true;
    }

    // getters
    public Player getOwner()
    {
        return owner;
    }

    public int[] getRents()
    {
        return rents;
    }

    public boolean getMortgaged()
    {
        return isMortgaged;
    }

    // setters
    public void setOwner(Player player)
    {
        owner = player;
    }
}
