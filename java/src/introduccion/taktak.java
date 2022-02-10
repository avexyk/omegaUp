
package Introduccion;

import java.util.Scanner;

public class taktak {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int f, c = 0;
        
        f = in.nextInt();
        
        if ((f%11) == 1) {
            System.out.println(0 + " " + f);
        }else {
            while ((f%11) != 1) {                
                c++;
                f = f * 2;
            }
            System.out.println(c + " " + f);
        }       
        
    }
    
}
