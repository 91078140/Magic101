import java.time.format.SignStyle;

public class Magic101Driver
{
    public static void main(String[] args)
    {
        Dragon happy = new Dragon("Happy", 20, false, 40, 3, 2.5, true, 4.6);
        Dragon smog = new Dragon("Smog", 40, true, 60, 4, 2.1, true, 5.9);
        Dragon empty = new Dragon();
        Monster werewolf = new Monster("Lupin", 10, true, 30, 2, 4.2, "Woods", true);
        Monster goblin = new Monster("Bak", 5, true, 15, 1, 6.1, "Cave", false);
        Monster shadow = new Monster();
        Slime blob = new Slime("Blobby", 2, false, 5, 1, 6.7, false);
        Slime glop = new Slime("Globy", 3, true, 8, 1, 6.7, true);
        Slime muck = new Slime();
        Enemy[] enemyList = {happy, smog, empty, werewolf, goblin, shadow, blob, glop, muck};

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

        //more tests
        System.out.println();
        System.out.println(blob.divide());
        System.out.println(glop.divide());
        System.out.println(muck.divide());

        /*happy.setName("sad");
        empty.getMight();
        System.out.println(werewolf.reactToMight());
        werewolf.setMight(12);
        System.out.println(werewolf.reactToMight());
        System.out.println(werewolf.toString());*/

        //more tests

       /* goblin.getsBoost("woods");// might starts at 5 now at 2
        System.out.println(goblin.toString());
        werewolf.getsBoost("woods"); //might starts at 10 now at 15
        System.out.println(werewolf.toString());*/

       // more tests
      /*  System.out.println();
        System.out.println(happy.fire());
        System.out.println(smog.fire());
        System.out.println(empty.fire());*/


    }
}

