
package Introduccion;

import java.util.Scanner;

public class fraccionmixta {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n, m;
        
        n = in.nextInt();
        m = in.nextInt();
        
        if ((n%m) != 0) {
            System.out.println((n/m) + " " + ((n%m) + "/" +m));
        }else {
            System.out.println(n/m);            
        }
        
    }
    
}
