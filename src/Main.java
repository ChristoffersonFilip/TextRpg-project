import Combat.Attacks;
import Combat.Battle;
import Units.Player;
import Units.tempEnemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(1, 15, 10, 1, 1, 1, "Player", true);
        tempEnemy enemy = new tempEnemy(1, 15, 10, 1, 1, 1, "enemy", true);



        while(player.isAlive() || enemy.isAlive()) {
            if (player.getHealth() <= 0 ){
                System.out.println("You died");
                player.setAlive(false);
                System.exit(1);
            }else if (enemy.getHealth() <= 0){
                System.out.println("You won the battle");
                enemy.setAlive(false);
                System.exit(1);
            }
            else {
                System.out.println("Choose your Action");
                System.out.println("Combat or Escape");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "Combat":
                        Battle.choice(player, enemy);
                        break;
                    case "Escape":

                        break;

                }
            }
        }
    }
}
