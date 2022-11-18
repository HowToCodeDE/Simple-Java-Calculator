package locic;  //Das Package ist optional, wird aber für ältere Compiler empfohlen.

import java.util.Scanner; //importieren des Scanners

public class Main { //Main Klasse

    public static void main(String[] args) { //Main Methode
        try { //Try catch, ins try springt Java immer rein, probiert es und wenn ein Fehler kommt, springt es ins Catch
            while (true) //Schleife, dass das Programm IMMER wiederholt wird, solange es nicht ins Break geht
            {
                //Variablen
                    String num1 = ""; //Nummer 1 als String da bei int nur Zahlen akzeptiert werden
                    String num2 = ""; //Nummer 2 als String da bei int nur Zahlen akzeptiert werden
                    int intNum1 = 0; //Int Variable
                    int intNum2 = 0; //Int Variable
                    String choise = ""; //String Variable zum wählen
                    Scanner scanner = new Scanner(System.in); //Neues scanner Objekt erstellen (Scanner packt alles in die Konsole eingegebene in eine Variable

                System.out.println("Enter first number");
                num1 = scanner.nextLine(); //Nummer 1 = Eingabe in die Konsole als Striing
                System.out.println("Enter second number");
                num2 = scanner.nextLine(); //Eingabe in die Konsole als String
                intNum1 = Integer.parseInt(num1); //String zu int machen damit man rechnen kann
                intNum2 = Integer.parseInt(num2); //String zu int
                System.out.println("Options are +, -, * and /");
                choise = scanner.nextLine(); //Auswahl = Konsolen Eingabe
                switch (choise) { //switch = wie hunderte if
                    case "+" -> System.out.println(MathFunctions.plusCalc(intNum1, intNum2)); //+
                    case "-" -> System.out.println(MathFunctions.minusCalc(intNum1, intNum2)); //-
                    case "*" -> System.out.println(MathFunctions.multiplyCalc(intNum1, intNum2)); //*
                    case "/" -> System.out.println(MathFunctions.divideCalc(intNum1, intNum2)); // /
                }
                System.out.println("Type 'close' to close or press enter");
                choise = scanner.nextLine(); //Auswahl
                if (choise.equals("close")) {
                    break; //Schleifenabbruch
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace(); //Printet Fehler in die Konsole
        }
    }
}