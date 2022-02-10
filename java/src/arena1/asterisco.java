
package arena1;

import java.util.Scanner;

public class asterisco {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N, M;
        
        N = in.nextInt();
        M = in.nextInt();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
