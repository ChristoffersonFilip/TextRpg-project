import Combat.Attacks;
import Combat.Battle;
import Units.Player;
import Units.VariousEnemies;
import Units.tempEnemy;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();



        Player player = new Player (100,100,10,100,100,0, "Player", true);
        VariousEnemies.addEnemies();

        System.out.println("Enter a name for your character");
        player.setName(scanner.nextLine());

        System.out.println(tempEnemy.getEnemyList());

         tempEnemy enemy = tempEnemy.getEnemyList().get(VariousEnemies.chooseEnemy());

        //TODO remove enemy from in parameter
        Battle.choice(player, enemy);

        /*
        tempEnemy testEnemy = new tempEnemy(1, 15, 10, 1, 1, 1, "enemy", true);
        tempEnemy enemy1 = new tempEnemy(1, 15, 10, 1, 1, 1, "titut", true);
        tempEnemy enemy2 = new tempEnemy(1, 15, 10, 1, 1, 1, "HejHej", true);
        tempEnemy enemy3 = new tempEnemy(1, 15, 10, 1, 1, 1, "TjoTjo", true);
        tempEnemy enemy4 = new tempEnemy(1, 15, 10, 1, 1, 1, "Hejsan", true);



        tempEnemy.getEnemyList().add(enemy1);
        tempEnemy.getEnemyList().add(enemy2);
        tempEnemy.getEnemyList().add(enemy3);
        tempEnemy.getEnemyList().add(enemy4);
        tempEnemy.getEnemyList().add(testEnemy);


        int encounter = random.nextInt(4);


        tempEnemy currentEnemy = tempEnemy.getEnemyList().get(encounter);

        Battle.combatMenu(player, currentEnemy, encounter);


/*
        while(player.isAlive() || currentEnemy.isAlive()) {
            System.out.println(currentEnemy.getName());
            if (player.getHealth() <= 0 ){
                System.out.println("You died");
                player.setAlive(false);
                System.exit(1);
            }else if (currentEnemy.getHealth() <= 0){
                System.out.println("You won the battle");
                currentEnemy = tempEnemy.getEnemyList().get(encounter);
            }

            else {
                System.out.println("Choose your Action");
                System.out.println("Combat or Escape");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "Combat":
                        Battle.choice(player, currentEnemy);
                        break;
                    case "Escape":

                        break;

                }
            }
        }

 */
    }
}
