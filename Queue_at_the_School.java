import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        while(t!=0){
            for (int i = 0; i <n-1; i++) {
                if (sb.charAt(i)=='B' && sb.charAt(i+1)=='G') {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(i+1));
                    sb.setCharAt(i+1, temp);    
                    i++; 
                }
            }
            t--;
        }
        System.out.println(sb);
        sc.close();
    }
}
