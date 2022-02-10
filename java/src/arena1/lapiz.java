
package arena1;

import java.util.Scanner;

public class lapiz {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N, K, c = 0;
        
        N = in.nextInt();
        K = in.nextInt();
        
        int[] lapiz = new int[N];
        
        for (int i = 0; i < N; i++) {
            lapiz[i] = in.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            if (lapiz[i]==K) {
                c++;
            }
        }
        
        System.out.println(c);
        
    }
    
}
