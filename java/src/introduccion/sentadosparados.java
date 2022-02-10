
package Introduccion;

import java.util.Scanner;

public class sentadosparados {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int r, s, b;
        
        r = in.nextInt();
        s = in.nextInt();
        b = in.nextInt();
        
        if (r*s<b) {
            System.out.println(r*s + " " + (b-(r*s)));
        }else if (r*s>b) {
            System.out.println(b + " " + 0);
        }
        
    }
    
}