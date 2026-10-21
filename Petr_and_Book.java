import java.util.Scanner;
public class Petr_and_Book {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] pages = new int[7];

        for (int i = 0; i < 7; i++) {
            pages[i] = sc.nextInt();
        }

        int day = 0;

        while (n > 0) {
            n -= pages[day];
            day = (day + 1) % 7;
        }

        System.out.println(day == 0 ? 7 : day);
        sc.close();
    }

}
