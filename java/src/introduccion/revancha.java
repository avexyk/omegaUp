
package Introduccion;

import java.util.Scanner;

public class revancha {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n;
        
        n = in.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = in.nextInt();
        }
        int max = lista[0], min = lista[0], pro = 0;
        for (int i = 0; i < lista.length; i++) {
            pro = pro + lista[i];
            if (max < lista[i]) {
                max = lista[i];
            }if (min > lista[i]) {
                min = lista[i];
            }
        }
        
        System.out.println(min + " " + max + " " + pro/n);
        
    }
    
}