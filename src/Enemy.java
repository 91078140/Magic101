public abstract class Enemy
{
    public int health;
    public int movement;
    public double speed;
    public String name;
    public int Might;
    public boolean isHostile;
    public boolean isWeakToMagic;

    public Enemy(String Name, int might, boolean IsHostile, int HP, int movement, double speed, boolean isWeakToMagic)
    {
        this.name = Name;
        this.Might = might;
        this.isHostile = IsHostile;
        this.health = HP;
        this.movement = movement;
        this.speed = speed;
        this.isWeakToMagic = isWeakToMagic;
    }// full constructor

    public Enemy()
    {
        this.name = null;
        this.Might = 0;
        this.isHostile = true;
        this.health = 0;
        this.movement = 0;
        this.speed = 0.0;
        this.isWeakToMagic = false;
    }

    //brain methods
    public int takeDamage()
    {
        return 1;
    }


    // getters & setters
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

    public boolean isWeakToMagic()
    {
        return isWeakToMagic;
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

    public void setWeakToMagic(boolean weakToMagic)
    {
        isWeakToMagic = weakToMagic;
    }

    public String toString()
    {
        return "{" + "Name: " + name + ", " + "Might: " + Might +
                ", " + "isHostile: " + isHostile + ", Health: " + health + ", Movement: " + movement +
                ", Speed: " + speed + ", Weak To Magic: " + isWeakToMagic;
    }

}

