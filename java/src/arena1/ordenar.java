
package arena1;

import java.util.Scanner;

public class ordenar {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] datos = new int[N];
        int temp;
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = in.nextInt();
        }
        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 1; j < (datos.length - i); j++) {
                if (datos[j - 1] > datos [j]) {
                    temp = datos[j - 1];
                    datos[j - 1] = datos[j];
                    datos[j] = temp;
                }
            }
        }
        
        for (int dato : datos) {
            System.out.println(dato);
        }
        
    }
    
}
