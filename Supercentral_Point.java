import java.util.Scanner;
public class Supercentral_Point {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean left = false;
            boolean right = false;
            boolean up = false;
            boolean down = false;

            for (int j = 0; j < n; j++) {
                if (points[j][0] < points[i][0]
                        && points[j][1] == points[i][1]) {
                    left = true;
                }

                if (points[j][0] > points[i][0]
                        && points[j][1] == points[i][1]) {
                    right = true;
                }

                if (points[j][0] == points[i][0]
                        && points[j][1] > points[i][1]) {
                    up = true;
                }

                if (points[j][0] == points[i][0]
                        && points[j][1] < points[i][1]) {
                    down = true;
                }
            }

            if (left && right && up && down) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

