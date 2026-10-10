import java.util.Scanner;

public class Lights_Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] press = new int[3][3];
        int[][] light = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                press[i][j] = sc.nextInt();
            }
        }

        int[] dx = {0, 0, 0, 1, -1};
        int[] dy = {0, 1, -1, 0, 0};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (press[i][j] % 2 == 1) {

                    for (int k = 0; k < 5; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];

                        if (ni >= 0 && ni < 3 && nj >= 0 && nj < 3) {
                            light[ni][nj] ^= 1; // toggle
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(light[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}