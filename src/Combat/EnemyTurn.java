package Combat;

import java.util.Random;
import Units.Player;
import Units.tempEnemy;

public class EnemyTurn {

    //TODO remove player from parameter
    //Har player & enemy som in-parameter i alla metoder, korrekt eller fel?
    //Känns inte som att man ska behöva player som in parameter för enemy val?
    //Enemy väljer aldrig defend
    static void enemyChoice(tempEnemy enemy, Player player){
         int decision = 0;
         Random random = new Random();

         decision =  random.nextInt(1);

         switch(decision){
             case 0:
                 Attacks.enemyAttack(enemy, player);
                 break;
             case 1:
                 Attacks.enemyDefend(enemy, player);
                 break;

         }

    }

}
