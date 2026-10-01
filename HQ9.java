import java.util.*;
public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean f = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='H' ||s.charAt(i)=='Q' || s.charAt(i)=='9'){
                f = true;
                break;
            }
        }
        if(f){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
