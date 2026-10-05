import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ct=0;
        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if((a==1 && b==1) || (b==1 && c==1) || (a==1 && c==1)){
                ct++;
            }
        }
        System.out.println(ct);
        sc.close();
    }
}
