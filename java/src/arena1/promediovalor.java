
package arena1;

import java.util.Scanner;

public class promediovalor {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int c = 0;
        
        for (int i = 0; i < 5; i++) {
            c = c + in.nextInt();
        }
        
        System.out.println(c/5);
        
    }
    
}
