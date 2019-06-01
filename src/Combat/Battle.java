package Combat;

import Units.Player;
import Units.tempEnemy;

import java.util.Scanner;

public class Battle {
        public static Scanner scanner  = new Scanner(System.in);

        public static void choice(Player player, tempEnemy enemy){
                System.out.println("Choose your action");
                System.out.println("Attack or Defend");
                String choice = scanner.nextLine();

                switch(choice){

                        case "Attack":
                                Attacks.basicAttack(player, enemy);
                                break;
                        case "Defend":
                                Attacks.defend(player, enemy);
                                break;
                }
        }

}
