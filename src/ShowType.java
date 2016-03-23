
public class ShowType {

    private String Type;
    private int left;

    public ShowType(String newType, int newleft) {
        left = newleft;
        Type = newType;
    }

    public int getAmountLeft()
    {
        return this.left;
    }

    public void pay( double amount )
    {
        this.left -= amount;
    }
}

