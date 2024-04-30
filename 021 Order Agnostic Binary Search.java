package Day10;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5,6,7};
          int[] a = {7,6,5,4,3,2,1};
        int target = 4;

        System.out.println(Search(a,target));
    }
    static int Search(int[] a, int target)
    {
        int start = 0, end = a.length;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(a[mid] == target)   //first check with middle element because both ascending and descending the middle is same
            {
                return mid;
            }
            boolean isAsn = a[start] < a[end]; //check if ascending or descending
            if(isAsn)      //in case ascendind
            {
                if(target < a[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else // incase descending
                if (target < a[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
        }
        return -1;  //element is not found
    }
}
