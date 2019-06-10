import Combat.Attacks;
import Combat.Battle;
import Units.Player;
import Units.VariousEnemies;
import Units.tempEnemy;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player = new Player (100,100,10,100,100,0, 100, "Player", true, 1, "none");
        VariousEnemies.addEnemies();

        System.out.println("Enter a name for your character");
        player.setName(scanner.nextLine());
        System.out.println("Do you wish to be a Warrior, or Mage?");
        System.out.println("The Mage has less health and damage but higher mana, while the warrior has more physical damage and health");
        player.setPlayerClass(scanner.nextLine());
        if(player.getPlayerClass().equalsIgnoreCase("Warrior")){
            player.setDamage(20);
            player.setMaxHealth(120);
            player.setHealth(120);
        }else{
            player.setDamage(10);
            player.setMaxMana(110);
            player.setMana(100);
        }



        System.out.println(tempEnemy.getEnemyList());

         tempEnemy enemy = tempEnemy.getEnemyList().get(VariousEnemies.chooseEnemy());

        //TODO remove enemy from in parameter
        Battle.choice(player, enemy);


    }
}
