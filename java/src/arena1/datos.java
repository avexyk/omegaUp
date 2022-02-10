
package arena1;

import java.util.Scanner;

public class datos {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N, a, b;
        
        N = in.nextInt();
                
        for (int i = 0; i < N; i++) {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a+b);
        }
        
    }
    
}
