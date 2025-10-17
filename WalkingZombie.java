class WalkingZombie extends Zombie {
    WalkingZombie(int h, int l) {
        super(h, l);
    }
    
    @Override
    public void heal() {
        if (level == 1)
            addPct(20);
        else if (level == 2)
            addPct(30);
        else
            addPct(40);
    }
    
    @Override
    public void destroyed() {
        subPct(20);
    }
}
