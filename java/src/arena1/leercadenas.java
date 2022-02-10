
package arena1;

import java.util.Scanner;

public class leercadenas {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] cadena = new String[N];
        
        for (int i = 0; i < N; i++) {
            cadena[i] = in.next();
        }
        
        for (String c : cadena) {
            System.out.println("\"" + c + "\"" + " tiene " + c.length() + " caracteres");
        }
           
    }
    
}
