import java.util.Scanner;

public class Bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x = 0;
        for(int i=0 ; i<n ; i++){
            String s = sc.next();
            if((s.charAt(s.length()-1)=='X') && (s.charAt(0)=='+') || (s.charAt(0)=='X') && (s.charAt(s.length()-1)=='+') ){
                    x= x+1;
            }else if ((s.charAt(0)=='X') && (s.charAt(s.length()-1)=='-') || (s.charAt(s.length()-1)=='X') && (s.charAt(0)=='-')){
                    x= x-1;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
