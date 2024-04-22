package Day7;

import java.util.Scanner;

public class Armstrong  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        CheckArmstrong (num);
    }
    static void CheckArmstrong(int n)
    {
        int sum = 0, rem, cube = 0;
        int m =n;
        while(m > 0)
        {
            rem = m % 10;
            cube = rem * rem * rem;
            sum = sum + cube;
            m = m / 10;
        }
        if(n == sum)
        {
            System.out.println("Armstrong  number");
        }
        else
            System.out.println("Not Armstrong number");
    }
}
