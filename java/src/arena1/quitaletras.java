
package arena1;

import java.util.Scanner;

public class quitaletras {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String prueba = in.nextLine();
        String caracteres = in.nextLine();
        
        // Expresión regular para eliminar carácteres especificos "[()?:!.,;{}]+"
        // Reempleza todos los carácteres especiales "[^\\dA-Za-z ]"
        String nuevo = prueba.replaceAll("["+caracteres+"]"+"+", "");
        
        System.out.println(nuevo);
                
    }
    
}
