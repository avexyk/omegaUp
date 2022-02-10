
package arena1;

import java.util.Scanner;

public class escribiralreves {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String c;
        char a;
        
        c = in.nextLine();
        
        for (int i = c.length()-1; i >= 0; i--) {
            a = c.charAt(i);
            System.out.print(a);
        }
        
    }
    
}
