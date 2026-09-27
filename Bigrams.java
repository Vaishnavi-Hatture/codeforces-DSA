import java.util.Scanner;

public class Bigrams{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t!=0){
            int k = sc.nextInt();
           
            boolean s=false;
            int c=0;
            for(int i=0 ;i <k;i++){
                int x = sc.nextInt();
                if(x>=3){
                    s=true;
                }
                if(x>=2){
                    c++;
                }
            }
            if(s || c>=2){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            
        }
        sc.close();
        
    }
}