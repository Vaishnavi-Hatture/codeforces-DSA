import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int x = k * l;       
        int x2 = x / nl;    

        int x3 = c * d;    
        int x4 = p / np;    

        int res = Math.min(x2, x3);
        int res2 = Math.min(res, x4);

        System.out.println(res2 / n);

        sc.close();
    }
}