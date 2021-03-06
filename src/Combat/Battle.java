package Combat;

import Menus.MainMenu;
import Units.Player;
import Units.VariousEnemies;
import Units.tempEnemy;

import java.util.Scanner;

public class Battle {
        public static Scanner scanner  = new Scanner(System.in);

        //TODO remove enemy from in parameter
        //Är det rätt eller kan jag lösa det utan att ha player som in parameter?
        //Använder player & enemy getters & setters, går det att lösa på något annat vis?
        public static void combatMenu(Player player, tempEnemy currentEnemy){
                while(player.isAlive() || currentEnemy.isAlive()) {
                        System.out.println(currentEnemy.getName());
                        if (player.getHealth() <= 0 ){
                                System.out.println("You died");
                                player.setAlive(false);
                                System.exit(1);
                        }else if (currentEnemy.getHealth() <= 0) {
                                player.setExperience(currentEnemy.getExperience());
                                System.out.println("You won the battle");
                                System.out.println("You gained " + currentEnemy.getExperience() + " experience");
                                //TODO fix broken experience system, figure out a good algorythm to increase experience necessary to level up.
                                if (player.getExperience() >= player.getMaxExperience()) {
                                        player.setMaxExperience(player.getMaxExperience()*4);
                                        System.out.println("Congratulations, you leveled up");
                                        player.setLevel(player.getLevel() + 1);
                                        player.setDamage(player.getDamage() + 5);
                                        player.setExperience(0);
                                        System.out.println("You are now level " + player.getLevel());
                                }

                                currentEnemy = tempEnemy.getEnemyList().get(VariousEnemies.chooseEnemy());
                                MainMenu.hubMenu(player, currentEnemy);
                        }
                        }

        }
        //TODO remove enemy from in parameter
        //Är det rätt eller kan jag lösa det utan att ha player som in parameter?
        public static void choice(Player player, tempEnemy enemy){
                System.out.println("Choose your action");
                System.out.println("Attack or Defend");
                String choice = scanner.nextLine();

                switch(choice.toLowerCase()){

                        case "attack":
                                Attacks.basicAttack(player, enemy);
                                break;
                        case "defend":
                                Attacks.defend(player, enemy);
                                break;
                }
        }

}
