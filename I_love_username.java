import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int f = sc.nextInt();
        int min = f;
        int max = f;
        int c = 0;

        for (int i = 1; i < n; i++) {
            int score = sc.nextInt();

            if (score > max) {
                c++;
                max = score;
            } else if (score < min) {
                c++;
                min = score;
            }
        }

        System.out.println(c);
        sc.close();
    }
}