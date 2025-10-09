package at.ac.hcw.midterm01exercises;


public class MoreExercises {

    public static void main(String[] args) {
        //System.out.println("hello: " + countVowels("hello"));

        //System.out.println("aaaaaahhhh: " + countVowels("aaaaaahhhh"));

        System.out.println(isStrongPassword("hellOLLL1"));
    }
    /*
    Schreiben Sie eine Methode printBox, welche ein Rechteck in der Konsole ausgibt.
    Die Methode nimmt zwei Ganzzahlen (width, height), sowie einen Character (fill) als Parameter entgegen.
    Das Rechteck soll entsprechend der Breite, Höhe, sowie des übergebenen Characters gezeichnet werden.

    Bsp.:
    printBox(10, 3, '+') printet:
    ++++++++++
    ++++++++++
    ++++++++++
     */

    public static void printBox(int w, int h, char fill){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(fill);
            }
            System.out.println();
        }
    }

    /*
    Schreiben Sie eine Methode countVowels, welche einen String als Parameter übergeben bekommt.
    Die Methode soll zählen wie viele Vokale im String vorhanden sind.
    Vokale sind: a e i o u A E I O U
    Nutzen Sie myString.charAt(position) um auf einzelne Buchstaben des Strings zuzugreifen.
    Die Methode gibt die Anzahl der Vokale zurück.
     */

    public static int countVowels(String word){
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }


    /*
    Schreiben Sie eine Methode isStrongPassword, welche einen String als Parameter übergeben bekommt.
    Die Methode soll prüfen ob ein übergebenes Passwort den Passwortrichtlinien entspricht:

        * muss mindestens 8 Zeichen lang sein.
        * mindestens 1 Großbuchstabe enthalten.
        * mindestens 1 Kleinbuchstabe enthalten.
        * mindestens 1 Ziffer enthalten.

    Die Methode gibt 'true' zurück, wenn die Richtlinien erfüllt sind und 'false' wenn nicht
     */
    public static boolean isStrongPassword(String pw){

        if(pw.length() < 8){
            return false;
        }else {
            boolean hasDigit = false;
            boolean hasUpper = false;
            boolean hasLower = false;

            for (int i = 0; i < pw.length(); i++) {
                char letter = pw.charAt(i);
                if(letter >= 'A' && letter <= 'Z' ){
                    hasUpper = true;
                } else if (letter >= 'a' && letter <= 'z') {
                    hasLower = true;
                } else if( letter >= '0' && letter <= '9'){
                    hasDigit = true;
                }

                if (hasUpper && hasLower && hasDigit){
                    return true;
                }
            }

            return false;
        }
    }


    /*
    Schreiben Sie eine Methode swapCase, welche einen character als Parameter übergeben bekommt.
    Die Methode soll Großbuchstaben in Kleinbuchstaben und vice-versa umwandeln.
    Die Methode gibt den neuen char zurück.

    Beispiel:
        swapCase('a') -> 'A'
        swapCase('B') -> 'b'

     */

    /* Schreiben Sie eine Methode swapCases, welche einen String als Parameter übergeben bekommt.
    Die Methode soll ALLE Großbuchstaben in Kleinbuchstaben und vice-versa umwandeln.
    Die Methode gibt den neuen String zurück.

    Nutzen Sie die Methode swapCase von zuvor in Ihrer neuen Methode.
     */


    /*
    Simple Calculator

    Schreiben Sie eine Methode startCalculator, die dem Benutzer ein kleines Menü für einen Taschenrechner ausgibt. E.g.:
        Welcome to the simple calculator!
        Choose the operation you want to do and enter two doubles for calculation
        0: End program
        1: Add
        2: Subtract
        3: Multiply
        4: Divide

    Wird eine invalide Option ( nicht zwischen 0 - 4 ) eingegeben, soll eine Fehlermeldung ausgegeben werden und die Eingabe erneut erfolgen.
    E.g.:
        Welcome to the simple calculator!
        ... Print menu from before ...
        Enter your choice: >> -2 <<
        Invalid operation. Enter a number from 1 to 4.
        Enter your choice:

    Wird 0 eingegeben, so wird das Programm beendet.
    Nach Eingabe einer validen Option werden User weiters aufgefordert zwei Gleitkommazahlen einzugeben.
    Danach berechnet das Programm das Resultat der Operation und gibt dieses in der Konsole aus.
    Danach können User erneut eine Auswahl treffen.

    Beispiel Ausgabe (die angegebenen Zahlen sind Userinput und müssen nicht ausgegeben werden!):

        Welcome to the simple calculator!
        Choose the operation you want to do and enter two doubles for calculation
        0: End program
        1: Add
        2: Subtract
        3: Multiply
        4: Divide
        Enter your choice: 1
        Enter a: 2.4
        Enter b: 92
        The result is: 94.4
        Enter your choice: 2
        Enter a: 3
        Enter b: 7
        The result is: -4.0
        Enter your choice: 0
        Bye bye!

    Erweiterungen:

    Schreiben Sie eine Methode calc, die zwei Gleitkommazahlen (a, b) sowie einen char für die mathematische Operation ('+', '-', '*', '/')
    entgegennimmt. Basierend auf der übergebenen Operation wird ein Resultat berechnet, welches zurückgegeben wird.

    Nutzen Sie diese neue Methode in der startCalculator Methode.

    Erweitern Sie calc um eine Überprüfung auf eine Division durch 0 (nicht zulässig!). Dividieren Sie in diesem Fall nicht durch 0,
    sondern geben Sie Double.Nan (Not a number) aus der Methode zurück.

    Erweitern Sie calc und geben Sie das Resultat auf zwei Nachkommastellen genau zurück.

     */

    /*
    static void startCalculator(){
        System.out.println("Welcome to the simple calculator!");
        System.out.println("Choose the operation you want to do and enter two doubles for calculation");

        System.out.println("0: End program");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");

        Scanner scanner = new Scanner(System.in);
        int number = -1;
        double result;

        while (number != 0){
            System.out.print("Enter your choice: ");
            number = scanner.nextInt();
            if(number < 0 || number > 4){
                System.out.println("Invalid operation. Enter a number from 1 to 4.");
            } else if(number == 0){
                System.out.println("Bye bye!");
            } else {
                System.out.print("Enter a: ");
                double a = scanner.nextDouble();
                System.out.print("Enter b: ");
                double b = scanner.nextDouble();
                if (number == 1){
                    result = calc(a, b, '+');
                } else if(number == 2){
                    result = calc(a, b, '-');
                } else if (number == 3){
                    result = calc(a, b, '*');
                } else{
                    result = calc(a, b, '/');
                }

                System.out.println("The result is: " + result);
            }
        }
    }

    static double calc(double a, double b, char op){
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return (b == 0.0) ? Double.NaN : a / b;
            default:  return Double.NaN;
        }
    }

    static void printBox(int width, int height, char fill) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(fill);
            }
            System.out.println();
        }
    }

    static int countVowels(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                c++;
            }
        }
        return c;
    }

    static boolean isStrongPassword(String pw) {
        if (pw == null || pw.length() < 8) {
            return false;
        }

        boolean hasUpper=false, hasLower=false, hasDigit=false;

        for (int i = 0; i < pw.length(); i++) {
            char ch = pw.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }
        return hasUpper && hasLower && hasDigit;
    }

    static char swapCase(char c) {
        if (c >= 'A' && c <= 'Z') return (char)(c + 32);
        if (c >= 'a' && c <= 'z') return (char)(c - 32);
        return c;
    }

    static String swapCases(String text){
        String newString = "";
        for (int i = 0; i < text.length(); i++) {
            char pos = text.charAt(i);
            char swapped = swapCase(pos);
            newString += swapped;
        }
        return newString;
    }

     */

}
