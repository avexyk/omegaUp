
package arena1;

import java.util.Scanner;

public class pitagoras {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] datos = new int[3];
        int temp;
        
        datos[0] = in.nextInt();
        datos[1] = in.nextInt();
        datos[2] = in.nextInt();
    
        for (int i = 0; i < datos.length; i++) {
            for (int j = 1; j < (datos.length - i); j++) {
                if (datos[j - 1] > datos [j]) {
                    temp = datos[j - 1];
                    datos[j - 1] = datos[j];
                    datos[j] = temp;
                }
            }
        }
        
        if (Math.pow(datos[2], 2) == Math.pow(datos[1], 2) + Math.pow(datos[0], 2)) {
            System.out.println(datos[2] + " " + datos[1] + " " + datos[0]);
        }else {
            System.out.println("imposible");
        }
        
    }
    
}
