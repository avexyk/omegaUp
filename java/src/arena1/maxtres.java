
package arena1;

import java.util.Scanner;

public class maxtres {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int A, B, C;
        
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        
        if (A > B) {
            if (A > C) {
                System.out.println(A); 
            }else {
                System.out.println(C);
            }
        }else if (A < B) {
            if (B > C) {
                System.out.println(B);
            }else {
                System.out.println(C);
            }
        }else if (A == B) {
            if (B > C) {
                System.out.println(B);
            }else {
                System.out.println(C);
            }
        }        
        
    }
    
}
