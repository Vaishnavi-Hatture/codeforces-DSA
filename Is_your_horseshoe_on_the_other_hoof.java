import java.util.HashSet;
import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for(int j=0 ; j<4 ; j++){
            set.add(sc.nextInt());
        }
        System.out.println(4-set.size());
        sc.close();
        
    }

}
