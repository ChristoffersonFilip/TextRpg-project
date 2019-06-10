package Menus;

import Combat.Battle;
import Units.Player;
import Units.tempEnemy;

import java.util.Random;
import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void hubMenu(Player player, tempEnemy enemy){

        int choice = 0;
        System.out.println("What do you wish to do?");
        System.out.println("1: Travel");
        System.out.println("2: Rest");

        choice = scanner.nextInt();

        switch(choice){
            case 1:
                travel(player, enemy);
                break;
            case 2:
                rest(player, enemy);
                break;

        }
    }

    public static void travel(Player player, tempEnemy enemy){
        int randomTravel = 0;

        randomTravel = random.nextInt(20);

        if(randomTravel > 8){
            System.out.println("You encounter an enemy!");
            Battle.choice(player, enemy);
        }else
        System.out.println("You travel for a bit");
        System.out.println("Nothing special happens");
        hubMenu(player, enemy);
    }

    public static void rest(Player player, tempEnemy enemy){
        System.out.println("You rest for the rest of the day and recover some health and mana");
        if(player.getHealth() < player.getMaxHealth()){
                player.setHealth(player.getHealth()+5);
            if(player.getHealth() > player.getMaxHealth()){
                player.setHealth(player.getMaxHealth());
            }
        }if(player.getMana() < player.getMaxMana()){
            player.setMana((player.getMana()+5));
            if(player.getMana() > player.getMaxMana()){
                player.setMana(player.getMaxMana());
            }
        }
        hubMenu(player, enemy);
    }

}
