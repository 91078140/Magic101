public class Slime extends Enemy
{
    public boolean canDivide;

    public Slime(String slimeName, int might, boolean IsHostile, int HP, int movement, double speed, boolean canDivide)
    {
        super(slimeName, might, IsHostile, HP, movement, speed);
        this.canDivide = canDivide;
    }

    public Slime()
    {
        super();
        this.canDivide = false;
    }

    //brain methods

    public String divide()
    {
        if(canDivide)
        {
            return "Use magic or it will split.";
        }
        else
        {
            return "It won't divide so attack it with whatever you want.";
        }
    }

    // getters & setters
    public boolean getCanDivide()
    {
        return canDivide;
    }

    public void setCanDivide(boolean canDivide)
    {
        this.canDivide = canDivide;
    }

    public String toString()
    {
        return "Slime" + super.toString() + ", Can Divide: " + canDivide + "}";
    }
}

