import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
        System.out.println("Enter firs number:");
        double num1 = 0.0;
        num1 = Integer.parseInt(reader.readLine());

        System.out.println("Enter second number:");
        double num2 = 0.0;
        num2 = Integer.parseInt(reader.readLine());

        System.out.println("Choose operation:");
        System.out.println("1 for + \n2 for -\n3 for *\n4 for /");


        double result;

            while (true)
            {
                int operator = Integer.parseInt(reader.readLine());
                if (operator == 1) {
                    result = num1 + num2;
                    break;
                } else if (operator == 2) {
                    result = num1 - num2;
                    break;
                } else if (operator == 3) {
                    result = num1 * num2;
                    break;
                } else if (operator == 4) {
                    result = num1 / num2;
                    break;
                } else
                    System.out.println("Incorrect operator input, please choose operator from 1 to 4!");
            }

            System.out.println("Calculations result is:");
            System.out.println(result);

       }
       catch (ArithmeticException e){
            System.out.println("You can not divide by 0!");
        }
        catch (NumberFormatException e){
            System.out.println("Please, enter a number!\nLet's try this again");
        }

    }
}
