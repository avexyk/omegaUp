
package arena1;

import java.util.Scanner;

public class nofibonacci {
    
    public static int finobacci(int numero) {
        if ((numero == 0) || (numero == 1)) {
            return numero;
        } else 
            return finobacci(numero - 1) + finobacci(numero - 2);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] fino = new int[N];
        int[] nofino = new int[N];
        
        for (int i = 0; i < N; i++) {
            if (finobacci(i) < N) {
                fino[i] = finobacci(i);
            }
            nofino[i] = i;
        }
        
        boolean num;
        
        for (int i = 0; i < N; i++) {
            num = true;
            for (int j = 0; j < N; j++) {
                if (nofino[i] == fino[j]) {
                    num = false;
                }
            }
            if (num) {
                System.out.println(nofino[i]);
            }
        }
        
    }
    
}
