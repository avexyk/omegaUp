
package arena1;

import java.util.Scanner;

public class mayusculas {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String cadena = in.nextLine();
        
        cadena = cadena.toUpperCase();
        System.out.println(cadena);
    }
    
}
