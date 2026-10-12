import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = sc.next();
        String temp="";
        
        for(int i=0,j=0 ; i<s.length(); i++,j++){
            if(s.charAt(i)==s2.charAt(j)){
                temp+=0;
            }else{
                temp+=1;
            }
        }
        System.out.println(temp);
        sc.close();

    }
}
