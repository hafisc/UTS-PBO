interface Destroyable { void destroyed(); }

// ---------- ZOMBIE ----------
abstract class Zombie implements Destroyable {
    protected int health, level;
    Zombie(int health, int level){ this.health = Math.max(0, health); this.level = level; }
    public abstract void heal();
    void addPct(int p){ health = health + (health * p / 100); }
    void subPct(int p){
        int delta = Math.max(1, health * p / 100);
        health = Math.max(0, health - delta);
    }
    public String getZombieInfo(){
        return getClass().getSimpleName().replace("Zombie", " Zombie") + " Data =\n"
             + "Health = " + health + "\n"
             + "Level = " + level + "\n";
    }
}
class WalkingZombie extends Zombie {
    WalkingZombie(int h,int l){ super(h,l); }
    @Override public void heal(){ if(level==1) addPct(20); else if(level==2) addPct(30); else addPct(40); }
    @Override public void destroyed(){ subPct(20); }
}
class JumpingZombie extends Zombie {
    JumpingZombie(int h,int l){ super(h,l); }
    @Override public void heal(){ if(level==1) addPct(30); else if(level==2) addPct(40); else addPct(50); }
    @Override public void destroyed(){ subPct(10); }
}

// ---------- BARRIER ----------
class Barrier implements Destroyable {
    private int strength;
    public Barrier(int strength){ this.strength = Math.max(0, strength); }
    public int getStrength(){ return strength; }
    public void setStrength(int s){ strength = Math.max(0, s); }
    @Override public void destroyed(){ strength = Math.max(0, strength - 9); }
    public String getBarrierInfo(){ return "Barrier Strength = " + strength + "\n"; }
}

// ---------- PLANT ----------
class Plant {
    public void doDestroy(Destroyable d){
        d.destroyed();
        if (d instanceof Zombie) {
            Zombie z = (Zombie) d;
            if (z.health == 0) System.out.println(z.getClass().getSimpleName()+" kalah!");
        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            if (b.getStrength() == 0) System.out.println("Barrier kalah!");
        }
    }
}

// ---------- TESTER ----------
public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b       = new Barrier(100);
        Plant p         = new Plant();

        System.out.print(wz.getZombieInfo());
        System.out.print(jz.getZombieInfo());
        System.out.print(b.getBarrierInfo());
        System.out.println("--------------------------");

        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }

        System.out.print(wz.getZombieInfo());  // -> Health = 42, Level = 1
        System.out.print(jz.getZombieInfo());  // -> Health = 66, Level = 2
        System.out.print(b.getBarrierInfo());  // -> Barrier Strength = 64
    }
}