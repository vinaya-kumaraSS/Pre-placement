package Day7;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if(prime(num))
        {
            System.out.println("Prime number");
        }
        else
            System.out.println("Not Prime");
    }
    static boolean prime(int n)
    {
        int i = 2;
        while(i != n)
        {
            if(n % i == 0)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
