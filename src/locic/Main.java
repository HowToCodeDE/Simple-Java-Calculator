package locic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            while (true)
            {
                //var
                    String num1 = "";
                    String num2 = "";
                    int intNum1 = 6;
                    int intNum2 = 7;
                    String choise = "";
                    Scanner scanner = new Scanner(System.in);
                //var
                System.out.println("Enter first number");
                num1 = scanner.nextLine();
                System.out.println("Enter second number");
                num2 = scanner.nextLine();
                intNum1 = Integer.parseInt(num1);
                intNum2 = Integer.parseInt(num2);
                System.out.println("Options are +, -, * and /");
                choise = scanner.nextLine();
                switch (choise) {
                    case "+" -> System.out.println(MathFunctions.plusCalc(intNum1, intNum2));
                    case "-" -> System.out.println(MathFunctions.minusCalc(intNum1, intNum2));
                    case "*" -> System.out.println(MathFunctions.multiplyCalc(intNum1, intNum2));
                    case "/" -> System.out.println(MathFunctions.divideCalc(intNum1, intNum2));
                }
                System.out.println("Type 'close' to close or press enter");
                choise = scanner.nextLine();
                if (choise.equals("close")) {
                    break;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}