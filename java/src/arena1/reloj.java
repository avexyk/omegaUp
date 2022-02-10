
package arena1;

import java.util.Scanner;

public class reloj {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int actual = in.nextInt();
        int correcto = in.nextInt();
        
        if (actual < correcto && Math.abs(actual-correcto) > 1) {
            System.out.println("ADELANTAR " + Math.abs(actual-correcto) + " SEGUNDOS");
        }else if (actual > correcto && Math.abs(actual-correcto) > 1) {
            System.out.println("ATRASAR " + Math.abs(actual-correcto) + " SEGUNDOS");     
        }else if (actual > correcto){
            System.out.println("ATRASAR " + Math.abs(actual-correcto) + " SEGUNDO"); 
        }else {
            System.out.println("ADELANTAR " + Math.abs(actual-correcto) + " SEGUNDO");     
        }
        
    }
    
}
