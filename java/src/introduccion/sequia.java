
package Introduccion;

import java.util.Scanner;

public class sequia {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n, c, l, tanque = 0;
        
        n = in.nextInt();
        c = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            l = in.nextInt();
            tanque = tanque + l;
            if (c<=tanque) {
                System.out.println(i+1);
                break;
            }
            
        }
        
    }
    
}
