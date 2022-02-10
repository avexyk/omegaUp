
package arena1;

import java.util.Scanner;

public class naranjas {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        short M = in.nextShort();
        short N = 0, L = 0, E;
        
        for (byte i = 0; i < M; i++) {
            E = in.nextShort();
            if (E%2 == 0) {
                N++;
            } else {
                L++;
            }
        }
        
        System.out.println(N + " " + L);
        
    }
    
}
