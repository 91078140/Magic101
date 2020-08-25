public class Sorcerer
{
    public int might;
    public int health;
    public int movement;
    public double speed;
    public String name;
    public int mp;
    public String magicElement;
    static int party = 0;


    public Sorcerer(String Name, int might, int HP, int movement, double speed, int MP, String magicElement)
    {
        this.name = Name;
        this.might = might;
        this.health = HP;
        this.movement = movement;
        this.speed = speed;
        this.mp = MP;
        this.magicElement = magicElement;
        party++;
    }

    public Sorcerer()
    {
        name = null;
        might = 0;
        health = 0;
        movement = 0;
        speed = 0.0;
        mp = 0;
        magicElement = null;
        party++;
    }

    //brain methods

    public void drinkPotion(String potion)
    {
        if(potion.equalsIgnoreCase("might"))
            might += 5;
        else if(potion.equalsIgnoreCase("health") || potion.equalsIgnoreCase("hp"))
            health += 10;
        else if(potion.equalsIgnoreCase("speed"))
            speed += 0.5;
        else if(potion.equalsIgnoreCase("magic point") || potion.equalsIgnoreCase("mp"))
            health += 10;
    }

    public String castSpell()
    {
        if(mp >= 4)
        {
            mp -= 4;
            return "You casted a powerful spell.";
        }
        else
        {
            return "Not enough Magic Points to cast a spell. Drink a MP potion.";
        }
    }

    //getters & setters

    public String getName()
    {
        return name;
    }

    public int getMight()
    {
        return might;
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

    public int getMp()
    {
        return mp;
    }

    public String getMagicElement()
    {
        return magicElement;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMight(int might)
    {
        this.might = might;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setMovement(int movement)
    {
        this.movement = movement;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setMp(int mp)
    {
        this.mp = mp;
    }

    public void setMagicElement(String magicElement)
    {
        this.magicElement = magicElement;
    }

    public String toString()
    {
        return "Sorcerer{Name: " + name + ", Might: " + might + ", Health: " +
                health + ", Movement: " + movement + ", Speed: " + speed +
                 ", Magic Element: " + magicElement + "}";
    }

}
