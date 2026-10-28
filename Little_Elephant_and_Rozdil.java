 import java.util.Scanner;
public class Little_Elephant_and_Rozdil {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long min = Long.MAX_VALUE;
        int index = -1;
        boolean tie = false;

        for (int i = 1; i <= n; i++) {
            long time = sc.nextLong();

            if (time < min) {
                min = time;
                index = i;
                tie = false;
            } else if (time == min) {
                tie = true;
            }
        }

        if (tie) {
            System.out.println("Still Rozdil");
        } else {
            System.out.println(index);
        }

        sc.close();
    }
}

