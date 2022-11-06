package ExerciseTenSix;

public class Coin {
    private double coinValue;
    private String coinName;

    public Coin(double value, String name)
    {
        coinValue = value;
        coinName = name;
    }
    public double getCoinValue()
    {
        return coinValue;
    }

    public String getCoinName()
    {
        return coinName;
    }

    public int compareTo(Object otherObject)
    {
        Coin other = (Coin) otherObject;

        if (coinValue < other.coinValue)
        {
            return -1;
        }
        else if(coinValue > other.coinValue)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}