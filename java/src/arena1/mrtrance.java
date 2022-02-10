
package arena1;

import java.util.Scanner;

public class mrtrance {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String palabra;
        String frase;
        char c;
        int j = 0;
        
        frase = in.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            if (c == ' ') {
                j++;
            }
        }
        
        String contenido [] = new String[j+1];
        
        for (int i = 0; i < frase.length(); i++) {
            
        }
        
    }
    
}
