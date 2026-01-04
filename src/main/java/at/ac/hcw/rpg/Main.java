package at.ac.hcw.rpg;

public class Main {
    public static void main(String[] args) {


        Dwarf gimli = new Dwarf("Gimli");
        Elf legolas = new Elf("Legolas");
        Orc azog = new Orc("Azog");

        gimli.buy("whatever");
        legolas.sell("this", 200);



        azog.fight(legolas);

        System.out.println(gimli);
        System.out.println(legolas);
        System.out.println(azog);

        for (int i = 0; i < 5; i++) {
            gimli.fight(azog);
            gimli.jump();

            System.out.println(azog);

            legolas.fight(azog);
            System.out.println(azog);
            azog.fight(legolas);
            System.out.println(legolas);
        }
    }
}
