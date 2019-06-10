package Units;


public class Player extends Characters {

    private String playerClass = "";
    private int maxExperience = 0;

    //TODO Add classes?
      public Player(int maxHealth, int health, int damage, int maxMana, int mana, int experience, int maxExperience, String name, boolean alive, int level, String playerClass) {
        super(maxHealth, health, damage, maxMana, mana, experience, name, alive, level);
        this.playerClass = playerClass;
        this.maxExperience = maxExperience;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getMaxExperience() {
        return maxExperience;
    }

    public void setMaxExperience(int maxExperience) {
        this.maxExperience = maxExperience;
    }
}
