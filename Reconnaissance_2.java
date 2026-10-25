import java.util.Scanner;
public class Reconnaissance_2 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            int diff = Math.abs(a[i] - a[next]);

            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }

        System.out.println((index + 1) + " " + ((index + 1) % n + 1));

        sc.close();
    
}
}
