package Day9;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {1,3,5,7},
                {2,4,6,7,8,2},
                {3,5,7,3},
                {0,3,4}
        };
        int Target = 6;
        System.out.println(Arrays.toString(Search(a, Target)));
    }
    static int[] Search(int[][] a,int Target)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(Target == a[i][j])
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
