
package arena1;

import java.util.Scanner;

public class mayor {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int c, e, n = 0;
        
        c = in.nextInt();
        
        for (int i = 0; i < c; i++) {
            e = in.nextInt();
            if (e > n) {
                n = e;
            }
            
        }
        
        System.out.println(n);
        
    }
    
}
