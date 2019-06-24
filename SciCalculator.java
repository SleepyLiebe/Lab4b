import java.text.DecimalFormat;
import java.util.Scanner;

public class SciCalculator {
    public static int addition {
    }
    public static void main (String[] args) {

        Scanner myScanner = new Scanner(System.in); String firstoperand; String secondoperand; double result = 0;
        double Result = 0; int Menu; int numberofcalculations = 0; double sumofcalculations;
        double averageofcalculations;


        boolean Calculatorloop = true;
        while (Calculatorloop) {

            System.out.println("Current Result: " + result + "\n");
            System.out.println("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");
            System.out.println("Enter Menu Selection: "); Menu = myScanner.nextInt();

            if (Menu == 7 && numberofcalculations == 0) {
                System.out.println("Error: No calculations yet to average!\n");
                System.out.println("Enter Menu Selection: "); Menu = myScanner.nextInt();

            }
            // I put menu 7 before anything to avoid any errors since the code continues
            // and is in a loop the menu would reprint since we are asking for the user input again
            if (Menu == 7 && numberofcalculations > 0) {
                sumofcalculations = Result; averageofcalculations = Result / numberofcalculations;
                System.out.println("Sum of calculations: " + sumofcalculations + "\n");
                System.out.println("Number of calculations: " + numberofcalculations + "\n");
                System.out.println("Average of calculations: " + new DecimalFormat("0.00").format(averageofcalculations) + "\n"); //makes number show only up to two decimal points
                System.out.println("Enter Menu Selection: "); Menu = myScanner.nextInt();
            }

            if (Menu < 0 || Menu > 7) {
                System.out.println("Error: Invalid selection!\n"); System.out.println("Enter Menu Selection: ");
                Menu = myScanner.nextInt();
            } if (Menu == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!"); System.exit(1);
            }

            System.out.println("Enter first operand: "); firstoperand = myScanner.next(); double input1;
            if (firstoperand.equals("RESULT")) {
                input1 = result; // this shows when the user inputs RESULT it will use the previous calculation
            } else {
                input1 = Double.parseDouble(firstoperand); // this code changes a string response into a double
            }

            System.out.println("Enter second operand: "); secondoperand = myScanner.next(); double input2;
            if (secondoperand.equals("RESULT")) {
                input2 = result;
            } else {
                input2 = Double.parseDouble(secondoperand);
            }


            if (Menu >= 0 || Menu <= 6) { //these are the different functions of the calculator
                numberofcalculations = numberofcalculations + 1; if (Menu == 1) {
                    result = input1 + input2;
                } if (Menu == 2) {
                    result = input1 - input2;
                } if (Menu == 3) {
                    result = input1 * input2;
                } if (Menu == 4) {
                    result = input1 / input2;
                } if (Menu == 5) {
                    result = Math.pow(input1, input2);
                } if (Menu == 6) {
                    result = Math.log(input2) / Math.log(input1);
                }
            } Result += result; // this adds the result to later calculate the sum and average
        }
    }
}
