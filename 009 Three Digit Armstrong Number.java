package Day7;

public class three_digit_Armstrong_number {
    public static void main(String[] args) {
        for(int i = 100 ;i < 1000 ; i++)
        {
            if(CheckArmstrong(i))
            {
                System.out.print(i+",");
            }
        }
    }
    static boolean CheckArmstrong(int n)
    {
        int original = n, sum = 0;
         while(n  > 0)
         {
             int rem = n % 10;
             sum = sum + rem * rem * rem;
              n = n / 10;
         }
         return original == sum;
    }
}
