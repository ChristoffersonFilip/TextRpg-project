import Combat.Attacks;
import Combat.Battle;
import Units.Player;
import Units.tempEnemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(1,1,1,1,1,1,"Player");
        tempEnemy enemy = new tempEnemy(1, 15,1,1,1,1, "enemy");

        String choice = scanner.nextLine();

        switch(choice){
            case "combat":
                Attacks.basicAttack(player, enemy);
                break;
            case "escape":

                break;

        }

    }
}
