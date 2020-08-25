import java.time.format.SignStyle;
import java.util.ArrayList;

public class Magic101Driver
{
    public static void main(String[] args)
    {
        Dragon happy = new Dragon("Happy", 20, false, 40, 3, 2.5, false, true, 4.6);
        Dragon smog = new Dragon("Smog", 40, true, 60, 4, 2.1, false, true, 5.9);
        Dragon empty = new Dragon();
        Monster werewolf = new Monster("Lupin", 10, true, 30, 2, 4.2, true, "Woods", true);
        Monster goblin = new Monster("Bak", 5, true, 15, 1, 6.1, true, "Cave", false);
        Monster shadow = new Monster();
        Slime blob = new Slime("Blobby", 2, false, 5, 1, 6.7, false, false);
        Slime glop = new Slime("Globy", 3, true, 8, 1, 6.7, true, true);
        Slime muck = new Slime();
        Enemy[] enemyList = {happy, smog, empty, werewolf, goblin, shadow, blob, glop, muck};

        System.out.printf("Watch out there are %d enemies attacking. %n%n", Enemy.countEnemy);
        System.out.printf("There are %d fire breathing dragons. %n%n", Dragon.fireCount);


        //array list

        /*ArrayList<Enemy> enemyArrayList = new ArrayList<>();
        enemyArrayList.add(happy);
        enemyArrayList.add(smog);
        enemyArrayList.add(werewolf);
        enemyArrayList.add(goblin);
        enemyArrayList.add(blob);
        enemyArrayList.add(glop);



        for (int i = 0; i < enemyArrayList.size(); i++)
        {
            System.out.println(enemyArrayList.get(i));
        }
*/

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


      /*  //more tests
        System.out.println();
        System.out.println(werewolf.takeDamage("spell"));
        System.out.println(blob.takeDamage("spell"));
        System.out.println(smog.takeDamage("melee"));
        System.out.println();
        for (Enemy e: enemyList)
        {
            System.out.println(e.toString());
        }*/



        //more tests
       /* System.out.println();
        System.out.println(blob.divide());
        System.out.println(glop.divide());
        System.out.println(muck.divide());*/

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

