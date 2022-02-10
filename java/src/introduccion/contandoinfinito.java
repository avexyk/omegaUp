
package Introduccion;

import java.util.Scanner;

public class contandoinfinito {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n;
        
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
        }
        
    }
    
}
