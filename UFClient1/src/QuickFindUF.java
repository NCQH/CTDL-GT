import java.util.Scanner;
public class QuickFindUF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[1000];
        int N = sc.nextInt();
        int count = N;
        int step = 0;

        for (int i = 0; i < N; i++) id[i] = i;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (id[x] != id[y]) {
                count--;
                int temp = id[y];
                for (int i = 0; i < N; i++) {
                    if (id[i] == temp) id[i] = id[x];
                }
                if (count == 1) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }

        if (count > 1) { System.out.println("FALSE"); }
    }
}
