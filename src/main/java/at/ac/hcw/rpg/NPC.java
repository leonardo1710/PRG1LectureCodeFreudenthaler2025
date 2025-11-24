package at.ac.hcw.rpg;

import java.io.Serializable;

public abstract class NPC {
    private String name;
    private int health;
    private int attackPower;

    public NPC(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public int getHealth(){
        return this.health;
    }

    public void takeDamage(int amount){
        this.health -= amount;
    }

    public void fight(NPC target){
        System.out.println(this.name + " attacks " + target.name);
        target.takeDamage(this.attackPower);
    }

    public final void jump(){
        System.out.println(this.getClass().getSimpleName() + " jumps.");
    }

    @Override
    public String toString() {
        return "name: " + this.name + "; health: " + this.health + "; attackPower: " + this.attackPower;
    }
}
