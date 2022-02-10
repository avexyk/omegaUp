
package arena1;

import java.util.Scanner;

public class dulces {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N, a, b, s = 0;
        
        N = in.nextInt();
        
        for (int i = 0; i < N; i++) {
            a = in.nextInt();
            b = in.nextInt();
            s = s + (a * b);
        }
        
        System.out.println(s);
        
    }
    
}
