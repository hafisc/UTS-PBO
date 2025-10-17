class Barrier {
    private int strength;
    
    public Barrier(int strength) {
        this.strength = Math.max(0, strength);
    }
    
    public int getStrength() {
        return strength;
    }
    
    public void setStrength(int s) {
        strength = Math.max(0, s);
    }
    
    public void destroyed() {
        strength = Math.max(0, strength - 9);
    }
    
    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}
