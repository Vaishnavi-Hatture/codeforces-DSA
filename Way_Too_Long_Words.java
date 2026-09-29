import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0 ; i<n ; i++){
            String s = sc.next();
            char st ='\0';
            char ed ='\0';
            int c=0;
            if(s.length() >10){
                st = s.charAt(0);
                ed = s.charAt(s.length()-1);
                c=s.length()-2;
                
                System.out.println(st + ""+c + ed);

            }else{
                System.out.println(s);
            }
            
        }
        sc.close();
    }
}
