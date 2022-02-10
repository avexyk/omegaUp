
package arena1;

import java.util.Scanner;

public class positivonegativocero {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N;
        
        N = in.nextInt();
        
        if (N > 0) {
            System.out.println("POSITIVO");
        }else if (N < 0) {
            System.out.println("NEGATIVO");
        }else {
            System.out.println("CERO");
        }
        
    }
    
}
