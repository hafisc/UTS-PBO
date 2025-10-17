abstract class Zombie {
    protected int health, level;
    
    Zombie(int health, int level) {
        this.health = Math.max(0, health);
        this.level = level;
    }
    
    public abstract void heal();
    
    public void destroyed() {
        // Method ini akan di-override di subclass
    }
    
    void addPct(int p) {
        health = health + (health * p / 100);
    }
    
    void subPct(int p) {
        int delta = Math.max(1, health * p / 100);
        health = Math.max(0, health - delta);
    }
    
    public String getZombieInfo() {
        return getClass().getSimpleName().replace("Zombie", " Zombie") + " Data =\n"
             + "Health = " + health + "\n"
             + "Level = " + level + "\n";
    }
}
