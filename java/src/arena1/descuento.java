
package arena1;

import java.util.Scanner;

public class descuento {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double compra;
        
        compra = in.nextDouble();
        
        if (compra > 1000) {
            System.out.println(compra*0.85);
        }else {
            System.out.println(compra);
        }
        
    }
    
}
