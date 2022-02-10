
package arena1;

import java.util.Scanner;

public class orden {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N, a, b = 0;
        boolean s = true;
        
        N = in.nextInt();
        a = in.nextInt();
        
        for (int i = 0; i < N-1; i++) {
            b = in.nextInt();
            if (b > a) {
                s = true;
            }else {
                s = false;
                System.out.println("NO");
                break;
            }
            a = b;
        }
        
        if (s == true) {
            System.out.println("SI");
        }
        
    }
    
}
