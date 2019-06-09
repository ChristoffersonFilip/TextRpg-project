package Units;

public class Characters {
    private int maxHealth = 100;
    private int health = 100;
    private int damage = 100;
    private int maxMana = 100;
    private int mana = 100;
    private int experience = 0;
    private String name = "player";
    private boolean alive = true;

    public Characters(int maxHealth, int health, int damage, int maxMana, int mana, int experience, String name, boolean alive) {
        this.maxHealth = maxHealth;
        this.health = health;
        this.damage = damage;
        this.maxMana = maxMana;
        this.mana = mana;
        this.experience = experience;
        this.name = name;
        this.alive = alive;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
