//100%
package arena2;

import java.util.Scanner;

public class cuadradomagico {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a1, b1, c1, a2, b2, c2, a3, b3, c3;
        
        a1 = in.nextInt();
        b1 = in.nextInt();
        c1 = in.nextInt();
        a2 = in.nextInt();
        b2 = in.nextInt();
        c2 = in.nextInt();
        a3 = in.nextInt();
        b3 = in.nextInt();
        c3 = in.nextInt();
        
        if ((a1+b1+c1==15) && (a2+b2+c2==15) && (a3+b3+c3==15) && (a1+a2+a3==15) && (b1+b2+b3==15) && (c1+c2+c3==15) && (a1+b2+c3==15) && (c1+b2+a3==15)) {
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
        
    }
    
}
