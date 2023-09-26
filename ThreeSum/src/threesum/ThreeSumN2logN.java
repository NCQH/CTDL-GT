package threesum;

import java.util.Scanner;
import java.util.Arrays;
public class ThreeSumN2logN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = threesum.ThreeSumPackage.nhap(n);
        Arrays.sort(numbers);

        for (int i = 0; i < n - 3; i++) {
            int left = numbers[i];
            for (int j = n - 1; j > i + 2; j--) {
                int right = numbers[j];
                int three = -(right + left);
                if (threesum.ThreeSumPackage.binarySearch(numbers, i, j, three) != -1) {
                    System.out.println(left + " " + three + " " + right);
                }
            }
        }

    }
}
