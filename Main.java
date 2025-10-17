public class Main {
    public static void main(String[] args){
        Plant p = new Plant();
        Zombie wz = new WalkingZombie(100, 2);
        Zombie jz = new JumpingZombie(80, 1);
        Barrier br = new Barrier(25);

        p.doDestroy(wz); p.doDestroy(jz); p.doDestroy(br);
        wz.heal(); jz.heal();

        while (br.getStrength() > 0) p.doDestroy(br);  
        while (wz.health > 0)        p.doDestroy(wz);   
        while (jz.health > 0)        p.doDestroy(jz);   
    }
}
