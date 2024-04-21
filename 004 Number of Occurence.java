//String method
package Day4;

import java.util.Scanner;

public class count_number_of_occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int i = 0;
        int counts = 0;
        while(i < num.length())
        {
            if(num.charAt(i) == '3' )
            {
                counts += 1;
            }
            i++;
        }
        System.out.println(counts);
    }
}


// Reminder and Divide method
package Day4;

import java.util.Scanner;

public class count_number_of_occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        while(num != 0)
        {
            int rem = num % 10;
            if(rem == 3)
            {
                count = count + 1;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
