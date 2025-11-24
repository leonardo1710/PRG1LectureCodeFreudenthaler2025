package at.ac.hcw.rpg;

public class Dwarf extends NPC{
    public Dwarf(String name) {
        super(name, 110, 18);
    }

    @Override
    public void takeDamage(int amount) {
        int actualDamage = amount - 5;
        super.takeDamage(actualDamage);
    }
}
