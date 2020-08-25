public class Monster extends Enemy
{
    public boolean hasAdvantage;
    public String terrain;
    public int mightHolder = this.Might;
    static boolean onHomeTerrain = false;

    public Monster (String monsterName, int might, boolean IsHostile, int HP, int movement, double speed, boolean isWeakToMagic, String terrain, boolean hasAdv)
    {
        super(monsterName, might, IsHostile, HP, movement, speed, isWeakToMagic);
        this.terrain = terrain;
        this.hasAdvantage = hasAdv;
        if(hasAdv)
            onHomeTerrain = true;
    }

    public Monster ()
    {
        super();
        this.terrain = "land";
        this.hasAdvantage = false;
    }
// getters & setters
    public String getTerrain()
    {
        return terrain;
    }

    public boolean getHasAdvantage()
    {
        return hasAdvantage;
    }

    public void setTerrain(String terrain)
    {
        this.terrain = terrain;
    }

    public void setHasAdvantage(boolean newAdv)
    {
        this.hasAdvantage = newAdv;
    }

    public String reactToMight()
    {
        if(Might <= 10)
        {
            return "Weak.";
        }
        else if(Might > 10 && Might < 20)
        {
            return "Be Careful.";
        }
        else if(Might >= 20)
        {
            return "Whoa!";
        }
        return "";
    }

    public String compareTerrain()
    {
        if(terrain.equalsIgnoreCase("Woods"))
        {
            return "Run away";
        }
        if(terrain.equalsIgnoreCase("Water"))
        {
            return "Swim away";
        }
        else
        {
            return "Good luck";
        }
    }

    public void getsBoost(String currentTerrain)// checks if the terrain matches the monster home terrain
    {
        this.Might = mightHolder;
        if(terrain.equalsIgnoreCase(currentTerrain) || hasAdvantage)
        {
            Might += 5;
        }
        else
        {
            Might -= 3;
        }
    }

    public String toString()
    {
        return "Monster" + super.toString() +", Terrain: " + terrain + ", Has Advantage: " + hasAdvantage + "}";
    }

}
