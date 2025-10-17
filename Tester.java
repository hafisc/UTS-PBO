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