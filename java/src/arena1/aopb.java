
package arena1;

import java.util.Scanner;

public class aopb {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String numero = in.nextLine();
        
        String[] dos = numero.split(" ");
        
        System.out.println(Integer.parseInt(dos[0]) + Integer.parseInt(dos[1]));
        System.out.println(Integer.parseInt(dos[0]) - Integer.parseInt(dos[1]));
        System.out.println(Integer.parseInt(dos[0]) * Integer.parseInt(dos[1]));
        System.out.println(Integer.parseInt(dos[0]) / Integer.parseInt(dos[1]));
        System.out.println(Integer.parseInt(dos[0]) % Integer.parseInt(dos[1]));
        
    }
    
}
