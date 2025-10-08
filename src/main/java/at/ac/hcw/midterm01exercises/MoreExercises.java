package at.ac.hcw.midterm01exercises;


public class MoreExercises {

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

    /*
    Schreiben Sie eine Methode countVowels, welche einen String als Parameter übergeben bekommt.
    Die Methode soll zählen wie viele Vokale im String vorhanden sind.
    Vokale sind: a e i o u A E I O U
    Nutzen Sie myString.charAt(position) um auf einzelne Buchstaben des Strings zuzugreifen.
    Die Methode gibt die Anzahl der Vokale zurück.
     */

    /*
    Schreiben Sie eine Methode isStrongPassword, welche einen String als Parameter übergeben bekommt.
    Die Methode soll prüfen ob ein übergebenes Passwort den Passwortrichtlinien entspricht:

        * muss mindestens 8 Zeichen lang sein.
        * mindestens 1 Großbuchstabe enthalten.
        * mindestens 1 Kleinbuchstabe enthalten.
        * mindestens 1 Ziffer enthalten.

    Die Methode gibt 'true' zurück, wenn die Richtlinien erfüllt sind und 'false' wenn nicht.
     */

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


}
