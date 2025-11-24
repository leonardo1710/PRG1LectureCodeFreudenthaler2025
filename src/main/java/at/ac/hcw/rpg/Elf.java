package at.ac.hcw.rpg;

public class Elf extends NPC {
    public Elf(String name) {
        super(name, 90, 20);
    }

    @Override
    public void takeDamage(int amount) {
        if(shouldTakeDamage()){
            super.takeDamage(amount);
        } else {
            System.out.println("No damage.");
        }
    }

    public boolean shouldTakeDamage() {
        double roll = Math.random(); // 0.0 <= roll < 1.0
        return roll < 0.7;           // 70% chance this is true
    }
}
