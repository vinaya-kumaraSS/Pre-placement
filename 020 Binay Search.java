package Day10;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,3,4,6,7,8,10,12,44};
        int Target = 6;
        System.out.println(searchEle(a, Target));
    }
    static int searchEle(int a[], int Target)
    {
        int start = 0, end = a.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2; //finding middle element
            if(Target > a[mid])
                start = mid + 1;
            else if (Target < a[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1; // if the element is not found
    }
}
