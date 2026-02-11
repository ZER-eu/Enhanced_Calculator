import java.util.Scanner;
public class Enhanced_Calculator
{
    static public void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOp = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an Operator (+, -, *, /, ^: ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second Number: ");
        num2 = scanner.nextDouble();

       switch(operator)
       {
           case '+' -> result = num1 + num2;
           case '-' -> result = num1 - num2;
           case '*' -> result = num1 * num2;
           case '/' -> {
               if(num2 == 0)
               {
                   System.out.println("Cannot divide by zero!");
                   validOp = false;
               }
               else
               {
                   result = num1 / num2;
               }
           }
           case '^' -> result = Math.pow(num1, num2);
           default ->
           {
               System.out.println("Invalid Operator");
               validOp = false;
           }
       }

       if(validOp)
       {
           System.out.println(result);
       }

        scanner.close();
    }
}
