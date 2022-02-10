
package arena1;

import java.util.Scanner;

public class potencias {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, p = 0; 
        
        for (int i = 0; i <= n; i++) {
            a = (int) (a + Math.pow(2, i));
        }
        
        System.out.println(a);
        
    }
    
}
