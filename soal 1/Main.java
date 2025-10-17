interface Destroyable { void destroyed(); }

// ---------- ZOMBIE ----------
abstract class Zombie implements Destroyable {
    protected int health, level;
    Zombie(int health, int level){ this.health = Math.max(0, health); this.level = level; }
    public abstract void heal();

    // util
    void addPct(int p){ health = health + (health * p / 100); }
    void subPct(int p){
        int delta = Math.max(1, health * p / 100);   // health
        health = Math.max(0, health - delta);
    }

    public String getZombieInfo(){
        return getClass().getSimpleName() + " {health=" + health + ", level=" + level + "}";
    }
}

class WalkingZombie extends Zombie {
    WalkingZombie(int h, int l){ super(h,l); }
    @Override public void heal(){
        if (level==1) addPct(20);
        else if (level==2) addPct(30);
        else addPct(40);
    }
    @Override public void destroyed(){ subPct(20); }
}

class JumpingZombie extends Zombie {
    JumpingZombie(int h, int l){ super(h,l); }
    @Override public void heal(){
        if (level==1) addPct(30);
        else if (level==2) addPct(40);
        else addPct(50);
    }
    @Override public void destroyed(){ subPct(10); }
}

// ---------- BARRIER ----------
class Barrier implements Destroyable {
    private int strength;
    public Barrier(int strength){ this.strength = Math.max(0, strength); }
    public void setStrength(int strength){ this.strength = Math.max(0, strength); }
    public int getStrength(){ return strength; }
    @Override public void destroyed(){ strength = Math.max(0, strength - 9); }
    public String getBarrierInfo(){ return "Barrier {strength=" + strength + "}"; }
}

// ---------- PLANT ----------
class Plant {
    public void doDestroy(Destroyable d){
        d.destroyed();
        if (d instanceof Zombie) {
            Zombie z = (Zombie) d;
            if (z.health == 0) System.out.println(z.getClass().getSimpleName() + " kalah!");
        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            if (b.getStrength() == 0) System.out.println("Barrier kalah!");
        }
    }
}

public class Main {
    public static void main(String[] args){
        Plant p = new Plant();
        Zombie wz = new WalkingZombie(100, 2);
        Zombie jz = new JumpingZombie(80, 1);
        Barrier br = new Barrier(25);

        // aksi awal
        p.doDestroy(wz); p.doDestroy(jz); p.doDestroy(br);
        wz.heal(); jz.heal();

        while (br.getStrength() > 0) p.doDestroy(br);   
        while (wz.health > 0)        p.doDestroy(wz);   
        while (jz.health > 0)        p.doDestroy(jz);  
    }
}
