public class Dragon extends Enemy
{

    public boolean hasFire;
    public double wingspan;
    static int fireCount = 0;

    public Dragon(String dragonName, int might, boolean IsHostile, int HP, int movement, double speed, boolean isWeakToMagic, boolean hasFire, double wingspan)
    {
        super(dragonName, might, IsHostile, HP, movement, speed, isWeakToMagic);
        this.hasFire = hasFire;
        this.wingspan = checkWingSpan(wingspan);
        if (hasFire)
            fireCount++;

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

    public String evaluate()
    {
        if(Might < 10)
        {
            return "Don't worry it's only D Class.";
        }
        if(Might > 10 && Might <= 20)
        {
            return "Be careful it's C Class.";
        }
        else if(Might > 20 && Might <= 30)
        {
            return "Be cautious it's B Class.";
        }
        else if(Might > 30 && Might <= 40)
        {
            return "Don't fight it alone it's A Class.";
        }
        else
        {
            return "Run away it's S Class.";
        }

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
