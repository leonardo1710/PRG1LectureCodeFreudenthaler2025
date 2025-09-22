package at.ac.hcw;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        /*
        // Arrays are reference types ... Example
        int[] myNumbers = {1, 2, 3, 4, 5};

        System.out.println("initial array: " + Arrays.toString(myNumbers));

        int[] reversed = reverseArray(myNumbers);

        System.out.println("reversed array: " + Arrays.toString(reversed));
        System.out.println("initial array...? " + Arrays.toString(myNumbers));

        System.out.println("hashcode reversed: " + reversed);
        System.out.println("hashcode initial: " + myNumbers);

        reversed = null;

        //System.out.println(reversed);
        //int getLength = reversed.length;  // NullPointerException!

        // multidimensional array example
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        */


        /**** lecture exercises ****/
        // (1) exercise
        // ask the user to provide an integer number
        // create an array and fill it with all numbers from zero to given number
        // if the given number is negative or zero, ask user for new input.
        // print the array at the end
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        do {    // do ask user until valid number entered
            System.out.println("enter int: ");
            number = scanner.nextInt();
            if(number <= 0){
                System.out.println("Invalid value!");
            }
        } while (number <= 0);

        int[] myNumbers2 = new int[number]; // initialize array

        for (int i = 0; i < myNumbers2.length; i++) {   // fill array
            myNumbers2[i] = i;
        }

        System.out.println(Arrays.toString(myNumbers2));    // print array

        for (int i = 0; i < myNumbers2.length; i++) {
            System.out.print(myNumbers2[i] + " ");
        }

        // extension to (1)
        // split solution into methods
        // write a method that reads and validates the user input and returns the number
        // write a method that accepts the number as argument and initializes and fills the array.
        // return filled array.
        int length = getValidInput();
        int[] filledArray = getFilledArray(length);

        for (int i = 0; i < filledArray.length; i++) {
            System.out.print(filledArray[i] + " ");
        }


        // (2) exercise
        // write a method getNumbersFromUser that accepts 1 integer value length as parameter
        // it should read integer values from the user based on the number of times provided via length
        // provided numbers should be stored inside an array - which will be returned
        // call the method from main
        // print each element

        int[] userNumbers = getNumbersFromUser(5);
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Element at pos[" + i + "] = " + userNumbers[i]);
        }
    }

    public static int[] getNumbersFromUser(int length){
        int[] numbersEntered = new int[length];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element for position " + i + ":");
            numbersEntered[i] = scanner.nextInt();
        }

        return numbersEntered;
    }


    public static int[] getFilledArray(int number){
        int[] myNumbers2 = new int[number]; // initialize array

        for (int i = 0; i < myNumbers2.length; i++) {   // fill array
            myNumbers2[i] = i;
        }

        return myNumbers2;
    }

    public static int getValidInput(){
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {

            System.out.println("Enter number:");
            userInput = scanner.nextInt();

            if (userInput <= 0){
                System.out.println("invalid value!");
            }
        } while (userInput <= 0);

        return number;
    }


    private static int[] reverseArray(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n/2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = tmp;
        }

        return numbers;
    }


}
