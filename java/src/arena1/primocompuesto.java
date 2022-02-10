
package arena1;

import java.util.Scanner;

public class primocompuesto {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N, c = 0;
        
        N = in.nextInt();
        
        for (int i = N; i > 0; i--) {
            if (N % i == 0) {
                c++;
            }
        }
        
        if (c==2) {
            System.out.println("PRIMO");
        }else {
            System.out.println("COMPUESTO");
        }
        
    }
    
}
