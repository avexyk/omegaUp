
package arena1;

import java.util.Scanner;

public class cerouno {
    
    public static void unoCero (StringBuilder ceros) {
        for (int i = 0; i < ceros.length(); i++) {
            if (ceros.charAt(i) == '0') {
                ceros.setCharAt(i, '1');
            } else if (ceros.charAt(i) == '1') {
                ceros.setCharAt(i, '0');
            }
        }
        System.out.println(ceros);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String ceros = in.nextLine();
        
        unoCero(new StringBuilder(ceros));
        
    }
    
}
