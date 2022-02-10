
package arena1;

import java.util.Scanner;

public class ulam {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        System.out.print(N + " ");
        
        while (N != 1) {            
            if (N % 2 == 0) {
                N  = N/2;
                System.out.print(N + " ");
            }else {
                N = N * 3 + 1;
                System.out.print(N + " ");
            }
        }
        
    }
    
}
