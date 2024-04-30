package Day9;

public class FindEvenDigit {
    public static void main(String[] args) {
        int[] nums = {1,3,43,4553,575};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums)
        {
            if(Finddigit(num))
                count ++;
        }
        return count;
    }
    static boolean Finddigit(int num)
    {
        int count = 0;
        while(num > 0)
        {
            num = num / 10;
            count++;
        }
        return count % 2 == 0;
    }
}
