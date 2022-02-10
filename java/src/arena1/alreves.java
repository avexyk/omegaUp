
package arena1;

import java.util.Scanner;

public class alreves {
    
    public String invertir(String palabra) {
        if (palabra.length() == 1) {
            return palabra;
        }else 
            return invertir(palabra.substring(1)) + palabra.charAt(0);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        alreves p =  new alreves();
        String palabra;
        
        palabra = in.next();
        
        System.out.println(p.invertir(palabra)); 
        
    }
    
}
