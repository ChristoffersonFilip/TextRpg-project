package Combat;

import Units.Player;
import Units.tempEnemy;

public class Attacks {

    public static void basicAttack(Player player, tempEnemy enemy){
        System.out.println("Player deals "+player.getDamage()+ " damage");
        System.out.println(enemy.getHealth());
        enemy.setHealth(enemy.getHealth() - player.getDamage());
        System.out.println(enemy.getHealth());
    }

}
