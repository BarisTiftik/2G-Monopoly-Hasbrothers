public class Dice
{
    // properties
    private int diceSum;
    private boolean isEven;

    // constructors
    public Dice()
    {
        diceSum = 0;
        isEven = false;
    }

    // methods
    public void rollDice()
    {
        isEven = false;

        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;

        if (die1==die2)
            isEven = true;

        diceSum = die1 + die2;
    }

    // getters
    public boolean isEven()
    {
        return isEven;
    }

    public int getDiceSum()
    {
        return diceSum;
    }
}
