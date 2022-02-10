
package arena1;

import java.util.Scanner;

public class comparar {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int A, B;
        
        A = in.nextInt();
        B = in.nextInt();
        
        if (A == B) {
            System.out.println("iguales");
        }else if (A > B) {
            System.out.println("mayor");
        }else {
            System.out.println("menor");
        }
        
    }
    
}
