
import java.util.Scanner;
class main1{
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        //create object of Scanner class
        Scanner input = new Scanner(System.in);

        //ask user to enter oprator
        System.out.println(" Choose an operator: + , -, *, or /");
        operator = input.next().charAt(0);

        // ask user to enter number
        System.out.println(" Enter first number");
        number1 = input.nextDouble();

        System.out.println(" enter second number");
        number2 = input.nextDouble();
        switch (operator){

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + "+ number2+" = "+result);
                break;
            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - "+ number2+" = "+result);
                break;
            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * "+ number2+" = "+result);
                break;
            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / "+ number2+" = "+result);
                break;
            default:
                System.out.println("Invalid oprator!");
                break;
            }
            input.close();
    }
}
// sorry i do not understand in this program i google this result come