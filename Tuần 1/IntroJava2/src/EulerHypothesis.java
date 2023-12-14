public class EulerHypothesis {
    public static void main(String[] args) {
        System.out.println("In 1769 Leonhard Euler formulated a generalized version of Fermat's Last Theorem, conjecturing that at least n nth powers are needed to obtain a sum that is itself an nth power, for n > 2.");
        int n = 10000;
        long a5, b5, c5, d5, e5;
        for (long e = 1; e <= n; e++) {
            e5 = mu5(e);

            // restrict search to a <= b <= c <= d <= e for efficiency
            for (long a = 1; a <= n; a++) {
                a5 = mu5(a);
                if (a5 + a5 + a5 + a5 > e5) break;

                for (long b = a; b <= n; b++) {
                    b5 = mu5(b);
                    if (a5 + b5 + b5 + b5 > e5) break;

                    for (long c = b; c <= n; c++) {
                        c5 = mu5(c);
                        if (a5 + b5 + c5 + c5 > e5) break;

                        for (long d = c; d <= n; d++) {
                            d5 = mu5(d);
                            if (a5 + b5 + c5 + d5  > e5) break;
                            if (a5 + b5 + c5 + d5 == e5)
                                System.out.println(a + "^5 + " + b + "^5 + " + c + "^5 + " + d + "^5 = " + e + "^5");
                        }
                    }
                }
            }
        }
    }
    private static long mu5(long n) {
        return n*n*n*n*n;
    }
}
