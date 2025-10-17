class JumpingZombie extends Zombie {
    JumpingZombie(int h, int l) {
        super(h, l);
    }
    
    @Override
    public void heal() {
        if (level == 1)
            addPct(30);
        else if (level == 2)
            addPct(40);
        else
            addPct(50);
    }
    
    @Override
    public void destroyed() {
        subPct(10);
    }
}
