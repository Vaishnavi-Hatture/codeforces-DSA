import java.util.Scanner;
public class Jeff_and_Digits {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int zeros = 0, fives = 0;

        for (int i = 0; i < n; i++) {
            int digit = sc.nextInt();
            if (digit == 0) {
                zeros++;
            } else {
                fives++;
            }
        }

        if (zeros == 0) {
            System.out.println(-1);
        } else if (fives < 9) {
            System.out.println(0);
        } else {
            fives = (fives / 9) * 9;

            for (int i = 0; i < fives; i++) {
                System.out.print(5);
            }

            for (int i = 0; i < zeros; i++) {
                System.out.print(0);
            }

            System.out.println();
        }

        sc.close();
    }

}
