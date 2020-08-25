public class Sorcerer
{
    public int might;
    public int health;
    public int movement;
    public double speed;
    public String name;
    public String magicElement;

    public Sorcerer(String Name, int might, int HP, int movement, double speed, String magicElement)
    {
        this.name = Name;
        this.might = might;
        this.health = HP;
        this.movement = movement;
        this.speed = speed;
        this.magicElement = magicElement;
    }

    public Sorcerer()
    {
        name = null;
        might = 0;
        health = 0;
        movement = 0;
        speed = 0.0;
        magicElement = null;
    }

    //brain methods

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
