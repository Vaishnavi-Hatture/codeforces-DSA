import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch =s.charAt(0);
        StringBuffer sb = new StringBuffer(s);
        
        if(Character.isUpperCase(ch)){
            System.out.println(s);
        }else{
            sb.setCharAt(0, Character.toUpperCase(ch));
            System.out.println(sb);
        }
        sc.close();
    }
}
