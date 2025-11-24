package at.ac.hcw.rpg;

public class Orc extends NPC{
    public Orc(String name) {
        super(name, 120, 30);
    }

    @Override
    public void fight(NPC target) {
        super.fight(target);

        if (getHealth() > 80) {
            target.takeDamage(10);
        }
    }
}
