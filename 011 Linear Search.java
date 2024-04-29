package Day9;

public class LinearSearch {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7};
        int s = 10;
        if(Search_No(a, s))
            System.out.println("present");
        else
            System.out.println("Not present");
    }
    static boolean Search_No(int a[] , int n)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n)
            {
                return true;
            }
        }
        return false;
    }
}
