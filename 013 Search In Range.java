package Day9;

public class SearchInRange {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,3,2,8,9,4};
        int Target = 5, Start = 1, End = 3;
        int Res = Search(a, Target, Start, End);
        if(Res == -1)
            System.out.println("Out of Index");
        else if (Res == 1)
            System.out.println("Present");
        else
            System.out.println("Not Found");
    }
    static int Search(int []a, int Target, int Start, int End)
    {
        if (Start < 0 || End > a.length)
            return -1;
        for (int i = Start; i <= End; i++){
            if(Target == a[i])
                return 1;
        }
        return 0;
    }
}
