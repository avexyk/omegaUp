
package arena1;

import java.util.Scanner;

public class escaleradibujada {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int T;
        String c;
        
        T = in.nextInt();
        c = in.next();
        
        for (int i = 1; i < T; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
       
    }
    
}
