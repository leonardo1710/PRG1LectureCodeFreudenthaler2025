package at.ac.hcw;

import java.util.Objects;
import java.util.Scanner;

public class LoopExercises {

    public static void printCountdown(int from){
        for (int i = from; i >= 0 ; i--) {
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // countdown
        System.out.print("Countdown; Enter a number: ");
        int from = scanner.nextInt();

        for (int i = from; i >= 0 ; i--) {
            System.out.print(i + " ");
        }

        // factorial
        System.out.print("Factorial; enter a number: ");
        int n = scanner.nextInt();
        long factorial = 1; // use long in case n is a bit large

        // Loop to calculate factorial
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }

        // Print result
        System.out.print(n + "! = " + factorial + " (");
        for (int i = n; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" × ");
            }
        }
        System.out.println(")");

        String pw = "pw1234";
        for (int i = 0; i < 3; i++) {
            System.out.print("Password; enter a pw: ");
            String guess = scanner.nextLine();

            if(Objects.equals(guess, pw)){ // == only checks if variables point to the same object in memory not contents
                System.out.println("Access granted");
                break;
            } else {
                System.out.println("Access denied");
            }

            if(i == 2){
                System.out.println("no more attempts.");
            }
        }

        // reversed stairs
        System.out.print("reversed stairs; enter n: ");
        int n1 = scanner.nextInt();
        for (int i = n1; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // count digits
        System.out.print("count digit; enter n: ");
        int n2 = scanner.nextInt();
        int digits = 0;
        int temp = n2;

        // Keep dividing by 10 until the number becomes 0
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        System.out.println(n2 + " has " + digits + " digits.");
    }
}
