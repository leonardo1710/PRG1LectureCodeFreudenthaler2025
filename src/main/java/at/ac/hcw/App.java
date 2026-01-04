package at.ac.hcw;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    int isOdd(int num) {
        if (num % 2 != 0) {
            System.out.println("odd");
            return 1;
        } else {
            return 0;
        }
    }
}
