package at.ac.hcw.rpg;

public class Dwarf extends NPC implements Trader{
    public Dwarf(String name) {
        super(name, 110, 18);
    }

    @Override
    public void takeDamage(int amount) {
        int actualDamage = amount - 5;
        super.takeDamage(actualDamage);
    }

    @Override
    public void buy(String prod) {
        System.out.println(this.getName() + " wants to buy " + prod);
    }

    @Override
    public void sell(String prod, double price) {
        System.out.println("You can buy from " + this.getName() + ":");
        System.out.println("Stuff; price: 99.9");
        System.out.println("Other stuff; price: 10.23");
    }
}
