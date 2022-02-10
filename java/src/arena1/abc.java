
package arena1;

import java.util.Scanner;

public class abc {
    
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
        
        String ABC = in.next();
        
        if (ABC.equalsIgnoreCase("ABC")) {
            System.out.println(datos[0] + " " + datos[1] + " " + datos[2]);
        }else if (ABC.equalsIgnoreCase("ACB")) {
            System.out.println(datos[0] + " " + datos[2] + " " + datos[1]);
        }else if (ABC.equalsIgnoreCase("BAC")) {
            System.out.println(datos[1] + " " + datos[0] + " " + datos[2]);
        }else if (ABC.equalsIgnoreCase("BCA")) {
            System.out.println(datos[1] + " " + datos[2] + " " + datos[0]);
        }else if (ABC.equalsIgnoreCase("CAB")) {
            System.out.println(datos[2] + " " + datos[0] + " " + datos[1]);
        }else if (ABC.equalsIgnoreCase("CBA")) {
            System.out.println(datos[2] + " " + datos[1] + " " + datos[0]);
        }
        
    }
    
}
