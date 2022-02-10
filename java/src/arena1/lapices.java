
package arena1;

import java.util.Scanner;

public class lapices {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int L, a = 0;
        
        for (int i = 0; i < N; i++) {
            L = in.nextInt();
            if (L == K) {
                a++;
            }
        }
        
        System.out.println(a);
        
    }
    
}
