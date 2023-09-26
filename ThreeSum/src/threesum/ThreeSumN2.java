package threesum;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = threesum.ThreeSumPackage.nhap(n);
        Arrays.sort(numbers);

        for (int i = 0; i < n - 3; i++) {
            int j = i+1;
            for (int k = n - 1; k > i + 2; k--) {
                int sum = numbers[i] + numbers[j] + numbers[k];
                if (sum > 0 ) { break; }
                while (sum < 0) {
                    if (j == k - 1) { break; }
                    j++;
                    sum = numbers[i] + numbers[j] + numbers[k];
                }
                if (sum == 0) {
                    System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                }
            }
        }
    }
}

