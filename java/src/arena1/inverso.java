
package arena1;

import java.util.Scanner;

public class inverso {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arreglo = new int[N];
        
        for (int i = 0; i < N; i++) {
            arreglo[i] = in.nextInt();
        }
        
        for (int i = (N-1); i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
        
    }
    
}
