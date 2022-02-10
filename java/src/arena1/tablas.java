
package arena1;

import java.util.Scanner;

public class tablas {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] num = new int[N];
        
        for (int i = 0; i < N; i++) {
            num[i] = in.nextInt();
        }
        
        for (int i : num) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println();
        }
        
    }
    
}
