
package Introduccion;

import java.util.Scanner;

public class palindromosA {
    
    public String invertir(String palabra) {
        if (palabra.length() == 1) {
            return palabra;
        }else 
            return invertir(palabra.substring(1)) + palabra.charAt(0);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        palindromosA p =  new palindromosA();
        String palabra;
        
        palabra = in.next();
        if (palabra.equalsIgnoreCase(p.invertir(palabra))==true) {
            System.out.println("Si");
        }else {
            System.out.println("No");
        }    
        
    }
    
}

