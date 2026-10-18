 import java.util.Scanner;
public class Jzzhu_and_Children {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int lastChild = 0;
        int maxCandies = 0;

        for (int i = 1; i <= n; i++) {
            int candies = sc.nextInt();
            int turns = (candies + m - 1) / m;

            if (turns >= maxCandies) {
                maxCandies = turns;
                lastChild = i;
            }
        }

        System.out.println(lastChild);
        sc.close();
    }
}

