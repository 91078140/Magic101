import java.time.format.SignStyle;

public class Magic101Driver
{
    public static void main(String[] args)
    {
        Dragon happy = new Dragon("Happy", 20, false, 40, 3, 2.5, true, 4.6);
        Dragon empty = new Dragon();
        Monster werewolf = new Monster("Lupin", 10, true, 30, 2, 4.2, "Woods", true);
        Slime blob = new Slime("Blobby", 2, false, 8, 1, 6.7, false);
        Enemy[] enemyList = {happy, empty, werewolf, blob};

      /*  System.out.println(happy.toString());
        System.out.println(empty.toString());
        System.out.println(werewolf.toString());
        System.out.println(blob.toString());*/



        System.out.println();
        //System.out.println(enemyList);
        for (Enemy e: enemyList)
        {
            System.out.println(e.toString());
        }

//        happy.setName("sad");
//        empty.getMight();
        System.out.println(werewolf.reactToMight());
        werewolf.setMight(12);
        System.out.println(werewolf.reactToMight());
        //System.out.println(werewolf.toString());


    }
}

