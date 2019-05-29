import Combat.Battle;
import Units.Player;
import Units.tempEnemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(1,1,1,1,1,1,"Player");
        tempEnemy enemy = new tempEnemy(1, 1,1,1,1,1, "enemy");

        switch(choice){
            case combat:
                Battle.fight(player, enemy);
                break;
            case escape:
                Battle.escape();
                break;

        }

    }
}
