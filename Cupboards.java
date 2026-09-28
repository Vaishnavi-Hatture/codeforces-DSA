import java.util.Scanner;

public class Cupboards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int lo = 0;
        int ro = 0;

        for(int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            if(l == 1) lo++;
            if(r == 1) ro++;
        }

        int lc = n - lo;
        int rc = n - ro;

        int ans = Math.min(lo, lc)
                + Math.min(ro, rc);

        System.out.println(ans);
        sc.close();
    }
}