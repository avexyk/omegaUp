
package arena1;

import java.util.Scanner;

public class mensajesdeamor {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int M, N;
        
        M = in.nextInt();
        
        for (int i = 0; i < M; i++) {
            N = in.nextInt();
            for (int j = 0; j < N; j++) {
                System.out.print("<3");
            }
            System.out.println();
        }
        
    }
    
}
