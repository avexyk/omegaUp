
package Introduccion;

import java.util.Scanner;

public class autobus {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n, p, q;
        
        n = in.nextInt();
        p = in.nextInt();
        int [] autobuses = new int[n];
        for (int i = 0; i < autobuses.length; i++) {
            autobuses[i] = in.nextInt();
        }
        
        for (int i = 0; i < p; i++) {
            q = in.nextInt();
            System.out.println(autobuses[q-1]);
        }
        
    }
    
}
