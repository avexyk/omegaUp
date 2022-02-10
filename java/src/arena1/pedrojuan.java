
package arena1;

import java.util.Scanner;

public class pedrojuan {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int A, B, C, D, E;
        
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        E = in.nextInt();
        
        if ((A+B+C) > (D+E)) {
            System.out.println("Juan");
        }else {
            System.out.println("Pedro");
        }
        
    }
    
}
