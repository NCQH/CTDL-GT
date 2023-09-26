package threesum;

import java.util.Scanner;

public class ThreeSumPackage {
    public static int binarySearch(int[] a, int left, int right, int number) {
        int low = left + 1;
        int high = right - 1;

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

    public static int[] nhap(int n) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        return numbers;
    }
}
