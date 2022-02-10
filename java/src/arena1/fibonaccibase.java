
package arena1;

import java.util.Scanner;

public class fibonaccibase {
    
    public static int fibonacci(int M) {
        if ((M == 0) || (M == 1)) {
            return M;
        } else {
            return fibonacci(M - 1) + fibonacci(M - 2);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        
        for (int i = 2; fibonacci(i) < M; i++) {
                System.out.print(fibonacci(i) + " ");
        }
        
    }
    
}
