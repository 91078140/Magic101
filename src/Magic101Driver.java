import java.time.format.SignStyle;
import java.util.ArrayList;

public class Magic101Driver
{
    public static void main(String[] args)
    {
        Sorcerer bell = new Sorcerer("Bell", 27, 50, 2, 3, 20, "Lightning");
        Sorcerer dalf = new Sorcerer("Gandalf", 42, 70, 3, 2.6, 45, "Light");
        Sorcerer baby = new Sorcerer();
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
        Sorcerer[] playerList = {bell, dalf, baby};

        for(Sorcerer s: playerList)
        {
            System.out.println(s.toString());
        }

        System.out.println();

        if(Sorcerer.party * 3 >= Enemy.countEnemy)
            System.out.println("The party is big enough to handle the enemies.");
        else
        {
            System.out.println("Your party is too small to handle the monsters. Try to increase your party size.");
        }


        System.out.printf("Watch out there are %d enemies attacking. %n%n", Enemy.countEnemy);
        System.out.printf("There are %d fire breathing dragons. %n%n", Dragon.fireCount);
        if(Monster.onHomeTerrain)
        {
            System.out.println("You are on their turf. Watch out.");
        }
        if(Slime.stopDivide)
        {
            System.out.println("Don't let the slimes divide. Use magic.");
        }



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


        //more tests
        System.out.println();
        System.out.println(werewolf.takeDamage("spell"));
        System.out.println(blob.takeDamage("spell"));
        System.out.println(smog.takeDamage("melee"));
        System.out.println();




        //more tests
        System.out.println();
        System.out.println(blob.divide());
        System.out.println(glop.divide());
        System.out.println(muck.divide());
        System.out.println();

        happy.setName("sad");
        empty.getMight();
        System.out.println(werewolf.reactToMight());
        werewolf.setMight(12);
        System.out.println(werewolf.reactToMight());
        System.out.println();

        //more tests

        goblin.getsBoost("woods");// might starts at 5 now at 2
       // System.out.println(goblin.toString());
        werewolf.getsBoost("woods"); //might starts at 10 now at 15
        //System.out.println(werewolf.toString());

       // more tests
        System.out.println();
        System.out.println(happy.fire());
        System.out.println(smog.fire());
        System.out.println(empty.fire());

        //more tests
        System.out.println();
        System.out.println(bell.castSpell());
        System.out.println(bell.getMp());
        System.out.println(dalf.castSpell());
        System.out.println(baby.castSpell());


    }
}

