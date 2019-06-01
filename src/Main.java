import Combat.Attacks;
import Combat.Battle;
import Units.Player;
import Units.tempEnemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player = new Player(1, 15, 10, 1, 1, 1, "Player", true);






        tempEnemy currentEnemy = tempEnemy.getEnemyList().get[0];



        while(player.isAlive() || currentEnemy.isAlive()) {
            if (player.getHealth() <= 0 ){
                System.out.println("You died");
                player.setAlive(false);
                System.exit(1);
            }else if (currentEnemy.getHealth() <= 0){
                System.out.println("You won the battle");
                currentEnemy.setAlive(false);
                System.exit(1);
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
    }
}
