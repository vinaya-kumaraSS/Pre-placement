package Day4;

import java.util.Scanner;

public class Revese_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rev_num =0;
        while(num != 0)
        {
            int rem = num % 10;
            rev_num = rev_num * 10 + rem;
            num = num /10;
        }
        System.out.println(rev_num);
    }
}
