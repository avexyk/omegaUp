
package arena1;

import java.util.Scanner;

public class temperatura {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        if (t > 25) {
            System.out.println("Muy Calido");
        }else if (t > 20 && t < 26) {
            System.out.println("Calido");
        }else if (t > 10 && t < 21) {
            System.out.println("Templado");
        }else if (t > -1 && t < 11) {
            System.out.println("Frio");
        }else {
            System.out.println("Muy Frio");
        }
        
    }
    
}
