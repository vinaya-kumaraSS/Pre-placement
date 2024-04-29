package Day9;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, -5, 7, -9};

        int max = a[0], min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("maximum "+max);
        System.out.println("minimum "+min);
    }
}
