package Units;

import java.util.ArrayList;

public class tempEnemy extends Characters {

    private static ArrayList<tempEnemy> enemyList = new ArrayList<tempEnemy>();

    public tempEnemy(int maxHealth, int health, int damage, int maxMana, int mana, int experience, String name, boolean alive) {
        super(maxHealth, health, damage, maxMana, mana, experience, name, alive);
    }

    public static ArrayList<tempEnemy> getEnemyList() {
        return enemyList;
    }

    public static void setEnemyList(ArrayList<tempEnemy> enemyList) {
        tempEnemy.enemyList = enemyList;
    }


}

