
package arena1;

import java.util.Scanner;

public class aprobar {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int c;
        
        c = in.nextInt();
        
        if (c > 5) {
            System.out.println("APROBATORIA");
        }else {
            System.out.println("REPROBATORIA");
        }
        
    }
    
}
