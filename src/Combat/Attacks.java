package Combat;

import Units.Player;
import Units.tempEnemy;

public class Attacks {

     static void basicAttack(Player player, tempEnemy enemy){

        System.out.println("Player deals "+player.getDamage()+ " damage");
        System.out.println(enemy.getHealth());
        enemy.setHealth(enemy.getHealth() - player.getDamage());
        System.out.println(enemy.getHealth());

    }

    static void defend(Player player, tempEnemy enemy){
        System.out.println("You defend and take reduced damage");
        System.out.println(player.getHealth());
        System.out.println("Enemy deals "+enemy.getDamage() / 2);
        player.setHealth(player.getHealth() - enemy.getDamage() / 2);
        System.out.println(player.getHealth());
    }

    static void enemyAttack(tempEnemy enemy, Player player){
        System.out.println("The enemy hits you for "+enemy.getDamage());
        player.setHealth(player.getHealth() - enemy.getDamage());
        System.out.println(enemy.getDamage());
        System.out.println(player.getHealth());
    }
    static void enemyDefend(tempEnemy enemy, Player player){
            System.out.println("You defend and take reduced damage");
            System.out.println(enemy.getHealth());
            System.out.println("Enemy deals "+player.getDamage() / 2);
            enemy.setHealth(enemy.getHealth() - player.getDamage() / 2);
            System.out.println(enemy.getHealth());

    }

}
