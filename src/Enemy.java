public abstract class Enemy
{
    public int health;
    public int movement;
    public double speed;
    public String name;
    public int Might;
    public boolean isHostile;
    public boolean isWeakToMagic;
    static int countEnemy = 0;

    public Enemy(String Name, int might, boolean IsHostile, int HP, int movement, double speed, boolean isWeakToMagic)
    {
        this.name = Name;
        this.Might = checkMight(might);
        this.isHostile = IsHostile;
        this.health = HP;
        this.movement = movement;
        this.speed = speed;
        this.isWeakToMagic = isWeakToMagic;
        countEnemy++;
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
        countEnemy++;
    }

    //brain methods
    public String takeDamage(String attack)
    {
        int damageHolder = health;
        if(attack.equalsIgnoreCase("Spell") && isWeakToMagic)
        {
            health -= (int)damageHolder/4;
            return name + " takes " + (int)damageHolder/4 + " damage.";
        }
        else if(attack.equalsIgnoreCase("Spell") && !isWeakToMagic)
        {
            return name + " isn't weak to magic. No damage taken.";
        }
        else if(attack.equalsIgnoreCase("Melee") && !isWeakToMagic)
        {
            health -= (int)damageHolder/3;
            return name + " takes " + (int)damageHolder/3 + " damage.";// would use weapon damage variable if it was in the game
        }
        else
        {
            return name + " can only be hurt by magic. No damage taken.";
        }
    }

    public int checkMight(int Might)
    {
        while(Might < 0)
        {
            System.out.println("Can't have negative might. Try Again.");
            Might++;
        }
        return Might;
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

