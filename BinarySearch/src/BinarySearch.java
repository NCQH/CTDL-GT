import java.util.Arrays;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.In;

public class BinarySearch {
    public static int binarySearch(int[] a, int number) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (number < a[mid]) {
                high = mid - 1;
            } else if (number > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();

        Arrays.sort(a);

        Stopwatch timer = new Stopwatch();

        int index = binarySearch(a, -2);
        System.out.println(index);

        System.out.println("Elapsed time: " + timer.elapsedTime());
    }
}
