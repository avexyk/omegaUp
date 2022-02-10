
package Introduccion;

import java.util.Scanner;

public class triples {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n, a = 0;
        
        n = in.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = in.nextInt();
        }
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]%3==0) {
                a++;
            }
        }
        
        if (a > 0) {
            System.out.println(a);
        }else {
            System.out.println("No hay triples.");
        }
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]%3 == 0) {
                System.out.print((i + 1) + " ");
            }
        }
        
    }
    
}
