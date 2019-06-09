package Combat;

import Units.Player;
import Units.tempEnemy;

public class Attacks {

    //TODO remove enemy from in parameter
    //Har player & enemy som in-parameter i alla metoder, korrekt eller fel?
    //Använder player & enemy getters & setters, går det att lösa på något annat vis?
     static void basicAttack(Player player, tempEnemy enemy){

            System.out.println(player.getName() + " deals " + player.getDamage() + " damage");
            System.out.println(enemy.getHealth());
            enemy.setHealth(enemy.getHealth() - player.getDamage());
            System.out.println(enemy.getHealth());
        if(enemy.getHealth() > 0) {
            EnemyTurn.enemyChoice(enemy, player);
        }
        else{
            Battle.combatMenu(player, enemy);
        }
    }

    //TODO remove player from in parameter
    static void defend(Player player, tempEnemy enemy){
        System.out.println("You defend and take reduced damage");
        System.out.println(player.getHealth());
        System.out.println("Enemy deals "+enemy.getDamage() / 2);
        player.setHealth(player.getHealth() - enemy.getDamage() / 2);
        System.out.println(player.getHealth());
        if(enemy.getHealth() > 0) {
            EnemyTurn.enemyChoice(enemy, player);
        }
    }

    static void enemyAttack(tempEnemy enemy, Player player){
        System.out.println("The enemy hits you for "+enemy.getDamage());
        player.setHealth(player.getHealth() - enemy.getDamage());
        System.out.println(enemy.getDamage());
        System.out.println(player.getHealth());
        Battle.choice(player, enemy);
    }


    static void enemyDefend(tempEnemy enemy, Player player){
            System.out.println("The enemy defends and takes reduced damage");
            System.out.println(enemy.getHealth());
            System.out.println(player.getName()+ " Deals "+player.getDamage() / 2);
            enemy.setHealth(enemy.getHealth() - player.getDamage() / 2);
            System.out.println(enemy.getHealth());
            Battle.choice(player, enemy);
    }

}
