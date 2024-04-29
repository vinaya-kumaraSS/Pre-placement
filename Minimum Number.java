package Day9;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, -5, 7, -9};

        int min = a[0];

        for (int i = 1; i <a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("minimum "+min);
    }
}
