import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        int flag =0 ;
        for(int i=0 ; i<s1.length() ; i++){
            if(s1.charAt(i) > s2.charAt(i)){
                flag = 1;
                break;
            }else if(s1.charAt(i) < s2.charAt(i)){
                flag =2;
                break;
            }
        }
        if(flag == 1){
            System.out.println("1");
        }else if(flag == 2){
            System.out.println("-1");
        }else{
            System.out.println(0);
        }
            sc.close();
        
    }
}
