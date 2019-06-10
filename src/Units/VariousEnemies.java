package Units;
import java.util.Random;

public class VariousEnemies {
    public static Random random = new Random();

    public static void addEnemies() {

        tempEnemy testEnemy = new tempEnemy(100, 1, 10, 1, 1, 500, "enemy", true, 1);
        tempEnemy enemy1 = new tempEnemy(100, 1, 10, 1, 1, 500, "titut", true, 1);
        tempEnemy enemy2 = new tempEnemy(100, 1, 10, 1, 1, 500, "HejHej", true, 1);
        tempEnemy enemy3 = new tempEnemy(100, 1, 10, 1, 1, 500, "TjoTjo", true, 1);
        tempEnemy enemy4 = new tempEnemy(100, 1, 10, 1, 1, 500, "Hejsan", true, 1);

        tempEnemy.getEnemyList().add(enemy1);
        tempEnemy.getEnemyList().add(enemy2);
        tempEnemy.getEnemyList().add(enemy3);
        tempEnemy.getEnemyList().add(enemy4);
        tempEnemy.getEnemyList().add(testEnemy);

    }

    public static int chooseEnemy(){
        int currentEnemy = random.nextInt(4);

        return currentEnemy;
    }

}
