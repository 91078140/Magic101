public class Dragon extends Enemy
{

    public boolean hasFire;
    public double wingspan;

    public Dragon(String dragonName, int might, boolean IsHostile, int HP, int movement, double speed, boolean hasFire, double wingspan)
    {
        super(dragonName, might, IsHostile, HP, movement, speed);
        this.hasFire = hasFire;
        this.wingspan = checkWingSpan(wingspan);
    }// full constructor

    public Dragon()
    {
        super();
        this.hasFire = false;
        this.wingspan = 0;
    }

    //brain method

    public double checkWingSpan(double wingspan)
    {
        while(wingspan < 0)
        {
            System.out.println("Can't have negative wingspan. Try Again.");
            wingspan++;
        }
        return wingspan;
    }

    public String fire()
    {
        if(hasFire && isHostile)
        {
            return "It breaths fire! Drink fire resistant potions.";
        }
        else if(!hasFire && isHostile)
        {
            return "It doesn't have fire. Save fire resistant potions.";
        }
        else
        {
            return "It is friendly. We don't need to use any potions";
        }
    }

    public boolean getHasFire()
    {
        return hasFire;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setHasFire(boolean newHasFire)
    {
        this.hasFire = newHasFire;
    }

    public void setWingspan(double wingspan)
    {
        this.wingspan = wingspan;
    }

    public String toString()
    {
        return "Dragon" + super.toString() + ", Has Fire: " + hasFire +
                ", Wingspan: " + wingspan + "}";
    }
}
