class Plant {
    // Method overloading untuk Zombie
    public void doDestroy(Zombie z) {
        z.destroyed();
        if (z.health == 0) {
            System.out.println(z.getClass().getSimpleName() + " kalah!");
        }
    }
    
    // Method overloading untuk Barrier
    public void doDestroy(Barrier b) {
        b.destroyed();
        if (b.getStrength() == 0) {
            System.out.println("Barrier kalah!");
        }
    }
}
