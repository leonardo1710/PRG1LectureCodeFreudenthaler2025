package at.ac.hcw.rpg;

public class Elf extends NPC implements Trader{
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

    @Override
    public void buy(String prod) {
        System.out.println(this.getName() + " wants to buy " + prod);
    }

    @Override
    public void sell(String prod, double price) {
        System.out.println("You can buy from " + this.getName() + ":");
        System.out.println("Elf Stuff; price: 10.2");
        System.out.println("Other elf stuff; price: 238.99");
    }
}
