import java.util.Arrays;
import java.util.Scanner;
import java.lang.Integer.*;
import java.util.Arrays.*;

public class ThreeSort {
    public static void main(String[] args) {
        int N = args.length;
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < N; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
