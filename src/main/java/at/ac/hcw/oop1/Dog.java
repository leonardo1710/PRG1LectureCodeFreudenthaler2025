package at.ac.hcw.oop1;

public class Dog {
    // instance variables
    String breed;
    String name;
    String color;

    public Dog(String name, String breed, String color){
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    // default constructor
    public Dog(){
        this("default", "", ""); // invoking the other constructor
    }

    /* Method overloading => two methods with same signature but different parameters */
    public void sniff(){
        System.out.println(this.name + " sniffs.");
    }

    public void sniff(Dog other){
        System.out.println(this.name + " sniffs on " + other.name + " a*");
    }

    public static void main(String[] args) {
        Dog beethoven = new Dog("Beethoven", "Bernhardiner", "black");
        System.out.println("before hairstyle: " + beethoven.color);
        beethoven.color = "blonde";

        System.out.println("after: " + beethoven.color);

        Dog lassie = new Dog(); // calling default constructor
        lassie.color = "blonde";
        lassie.name = "Lassie";
        lassie.breed = "Collie";

        lassie.sniff(beethoven);
        lassie.sniff();
        beethoven.sniff(lassie);
    }
}
