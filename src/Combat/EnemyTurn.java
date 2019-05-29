package Combat;

import java.util.Random;
import Units.Player;
import Units.tempEnemy;

public class EnemyTurn {

    static void enemyChoice(tempEnemy enemy, Player player){
         int descision;
         Random random = new Random();

         descision =  random.nextInt(2);

         switch(descision){
             case 1:
                 Attacks.enemyAttack(enemy, player);
                 break;
             case 2:
                 Attacks.enemyDefend(enemy, player);
                 break;

         }

    }

}
