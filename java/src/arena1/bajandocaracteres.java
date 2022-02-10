
package arena1;

import java.util.Scanner;

public class bajandocaracteres {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String palabra;
        
        palabra = in.next();

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
        
    }
    
}
