
package arena1;

import java.util.Scanner;

public class software {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Número de trabajadores
        int Y = in.nextInt(); // Código base
        int X = in.nextInt(); // Porcentaje
        
        double P = in.nextDouble(); // Paga por línea de código
        int K, nMayor = 0;
        double mTMayor = 0, mTMenor = 0;
        
        for (int i = 0; i < N; i++) {
            K = in.nextInt();
            if (K > nMayor) {
                nMayor = K;
            }
            if (K > Y) {
                mTMayor += K * 1.5;
            }else {
                mTMenor += K * 1.5;
            }
        }
        
        System.out.println(((mTMayor*(100+X)/100) + mTMenor) + " " + nMayor);
        
    }
    
}
