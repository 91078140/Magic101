public abstract class Enemy
{
    public int health;
    public int movement;
    public double speed;
    public String name;
    public int Might;
    public boolean isHostile;

    public Enemy(String Name, int might, boolean IsHostile, int HP, int movement, double speed)
    {
        this.name = Name;
        this.Might = might;
        this.isHostile = IsHostile;
        this.health = HP;
        this.movement = movement;
        this.speed = speed;
    }// full constructor

    public Enemy()
    {
        this.name = null;
        this.Might = 0;
        this.isHostile = true;
        this.health = 0;
        this.movement = 0;
        this.speed = 0.0;
    }
    public String getName()
    {
        return name;
    }

    public int getMight()
    {
        return Might;
    }

    public boolean isHostile()
    {
        return isHostile;
    }

    public int getHealth()
    {
        return health;
    }

    public int getMovement()
    {
        return movement;
    }

    public double getSpeed()
    {
        return speed;
    }

    //setters
    public void setName(String newName)
    {
        name = newName;
    }

    public void setMight(int might)
    {
        Might = might;
    }

    public void setHostile(boolean hostile)
    {
        isHostile = hostile;
    }

    public void setHealth(int newHP)
    {
        health = newHP;
    }

    public void setMovement(int newMovement)
    {
        movement = newMovement;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public String toString()
    {
        return "Dragon{" + "Dragon Name: " + name + ", " + "Might: " + Might +
                ", " + "isHostile: " + isHostile + ", Health: " + health + ", Movement: " + movement +
                ", Speed: " + speed;
    }

}

