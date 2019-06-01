package Units;
import java.util.Random;

public class VariousEnemies {
    public static Random random = new Random();

    public static void addEnemies() {

        tempEnemy testEnemy = new tempEnemy(1, 15, 10, 1, 1, 1, "enemy", true);
        tempEnemy enemy1 = new tempEnemy(1, 15, 10, 1, 1, 1, "titut", true);
        tempEnemy enemy2 = new tempEnemy(1, 15, 10, 1, 1, 1, "HejHej", true);
        tempEnemy enemy3 = new tempEnemy(1, 15, 10, 1, 1, 1, "TjoTjo", true);
        tempEnemy enemy4 = new tempEnemy(1, 15, 10, 1, 1, 1, "Hejsan", true);

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
