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
                    double doubleNum1 = 0;
                    double doubleNum2 = 0;
                    String choise = "";
                    Scanner scanner = new Scanner(System.in);
                //var
                while (true){
                    try {
                        System.out.println("Enter first number");
                        num1 = scanner.nextLine();
                        doubleNum1 = Double.parseDouble(num1);
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error by number, try again");
                    }
                }
                while (true)
                {
                    try {
                        System.out.println("Enter second number");
                        num2 = scanner.nextLine();
                        doubleNum2 = Double.parseDouble(num2);
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error by number, try again");
                    }
                }

                while (true)
                {
                    try {
                        System.out.println("Options are +, -, * and /");
                        choise = scanner.nextLine();
                        if(choise.equals("+") || choise.equals("-") || choise.equals("*") || choise.equals("/")) {
                            break;
                        }
                        else {
                            System.out.println("Type +, -, * or /");
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Unknown error, try again");
                    }
                }

                if(doubleNum1 == 0 && doubleNum2 == 0 && choise.equals("/")) {
                    System.out.println("You cant calculate 0/0");

                }
                switch (choise) {
                    case "+" -> System.out.println(MathFunctions.plusCalc(doubleNum1, doubleNum2));
                    case "-" -> System.out.println(MathFunctions.minusCalc(doubleNum1, doubleNum2));
                    case "*" -> System.out.println(MathFunctions.multiplyCalc(doubleNum1, doubleNum2));
                    case "/" -> System.out.println(MathFunctions.divideCalc(doubleNum1, doubleNum2));
                }
                System.out.println("Type 'close' to close or press enter to continue the programm");
                choise = scanner.nextLine();
                if (choise.equals("close")) {
                    break;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Unknown error, try again");
        }
    }
}