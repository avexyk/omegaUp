
package arena1;

import java.util.Scanner;

public class bisiestosencillo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N, M;
        
        N = in.nextInt();
        
        for (int i = 0; i < N; i++) {
            M = in.nextInt();
            if (M%100==0 && M%400 == 0) {
                System.out.println("S");
            }else if (M%4==0) {
                if (M%100 == 0) {
                    System.out.println("N");
                }else {
                    System.out.println("S");
                }
            }else {
                System.out.println("N");
            }            
        }
        
    }
    
}
