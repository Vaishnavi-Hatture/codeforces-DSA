import java.util.*;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        HashSet<Character> sh = new HashSet<>();

        for(int i=0 ; i<s.length() ; i++){
            sh.add(s.charAt(i));
        }
        if(sh.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}