package Combat;

import java.util.Random;
import Units.Player;
import Units.tempEnemy;

public class EnemyTurn {

    //TODO remove player from parameter
    //Har player & enemy som in-parameter i alla metoder, korrekt eller fel?
    static void enemyChoice(tempEnemy enemy, Player player){
         int descision;
         Random random = new Random();

         descision =  random.nextInt(1);

         switch(descision){
             case 0:
                 Attacks.enemyAttack(enemy, player);
                 break;
             case 1:
                 Attacks.enemyDefend(enemy, player);
                 break;

         }

    }

}
