
package arena1;

import java.util.Scanner;

public class terna {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String enteros;
        
        enteros = in.nextLine();
        
        String terna[] = enteros.split(" ");
        
        if ((Math.pow(Integer.parseInt(terna[0]), 2) + Math.pow(Integer.parseInt(terna[1]), 2)) == Math.pow(Integer.parseInt(terna[2]), 2)) {
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
        
    }
    
}
