import java.util.Scanner;

public class Effective_Approach{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] pos = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            pos[x] = i;
        }

        int m = sc.nextInt();
        long vasya = 0;
        long petya = 0;

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();

            vasya += pos[x];
            petya += n - pos[x] + 1;
        }

        System.out.println(vasya + " " + petya);

        sc.close();
    }
}