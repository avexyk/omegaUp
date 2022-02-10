
package arena1;

import java.util.Scanner;

public class cope {
    
    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int totalpagos = 0, pago;
        
        for (int i = 0; i < M; i++) {
            pago = in.nextInt();
            totalpagos += pago;
        }
        
        System.out.println(N-totalpagos);
        
    }
    
}
