package Day4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res =0;
        while(true)
        {
            System.out.println("Enter Operator :");
            char operator = sc.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%' || operator == '^')
            {
                System.out.println("Enter 2 number");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(operator == '+')
                {
                    res = num1 + num2;
                }
                if(operator == '-')
                {
                    res = num1 - num2;
                }
                if(operator == '*')
                {
                    res = num1 * num2;
                }
                if(operator == '/')
                {
                    res = num1 / num2;
                }
                if(operator == '%')
                {
                    res = num1 % num2;
                }
                if(operator == '^')
                {
                    res = num1 ^ num2;
                }
            }
            else if(operator == 'x'|| operator == 'X')
            {
                break;
            }
            else {
                System.out.println("invalid operator");
            }
            System.out.println(res);
        }
    }
}
