 import java.util.Scanner;

public class Parallelepiped {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = (int) Math.sqrt((double) a * c / b);
        int y = a / x;
        int z = c / x;

        System.out.println(4 * (x + y + z));

        sc.close();
    }

}
