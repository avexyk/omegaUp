
package arena1;

import java.util.Scanner;

public class asinus {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int acumulador = 0, num;
        
        for (int i = 0; i < N; i++) {
            num = in.nextInt();
            acumulador = acumulador + num;
        }
        
        System.out.println(acumulador);
        
    }
    
}
