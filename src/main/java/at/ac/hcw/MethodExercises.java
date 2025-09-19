package at.ac.hcw;

public class MethodExercises {

    public static void main(String[] args) {
        printUntilNumber(2);    // calling/invoking a function
        printUntilNumber(6);
        printUntilNumber(10);

        System.out.println(sumOfNumbers(1, 5)); // calling the function and printing its result
        int result = sumOfNumbers(1, 10);       // save returned result in variable

        System.out.println(result);
    }

    public static int sumOfNumbers(int from, int to){
        int sum = 0;
        for (int i = from; i <= to ; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void printUntilNumber(int no){
        System.out.println("printUntilNumber called.");
        for (int i = 1; i <= no ; i++) {
            System.out.println(i);
        }
    }
}

