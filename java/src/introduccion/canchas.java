
package Introduccion;

import java.util.Scanner;

public class canchas {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int x1, y1, x2, y2, a1, b1, a2, b2;
        
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        
        a1 = in.nextInt();
        b1 = in.nextInt();
        a2 = in.nextInt();
        b2 = in.nextInt();                
        
        if (x1 > a1 && y1 > b1 && x2 < a2 && y2 < b2) {
            System.out.println((a2-a1)*(b2-b1));
       
            
        }else {
            System.out.println(((x2-x1)*(y2-y1))+((a2-a1)*(b2-b1)));
        }
        
    }
    
}
