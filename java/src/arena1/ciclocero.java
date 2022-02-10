//100%
package arena1;

import java.util.Scanner;

public class ciclocero {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int acumulador = 0, numero = 1;
        
        while (numero!=0) {            
            numero = in.nextInt();
            acumulador = acumulador + numero;
        }
        
        System.out.println(acumulador);
        
    }
    
}
