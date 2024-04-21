package Day4;
import java.util.Scanner;
public class upper_or_lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);

        if( c >= 'a' && c <= 'z')
        {
            System.out.println("lower case");
        }
        else
            System.out.println("upper case");
    }
}
