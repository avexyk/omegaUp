
package Introduccion;

import java.util.Scanner;

public class palindromosB {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String palabra, inversa;
        
        palabra = in.next();
        inversa = new StringBuilder(palabra).reverse().toString();
        if (palabra.equalsIgnoreCase(inversa)==true) {
            System.out.println("Si");
        }else {
            System.out.println("No");
        }
        
    }
    
}

