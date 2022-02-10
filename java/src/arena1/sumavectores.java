
package arena1;

import java.util.Scanner;

public class sumavectores {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N;
        
        N = in.nextInt();
        
        int[] a = new int[N];
        int[] b = new int[N];
        
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            b[i] = in.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print((a[i] + b[i]) + " ");
        }
        
    }
    
}
