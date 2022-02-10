
package arena1;

import java.util.Scanner;

public class barbulla {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        
        for (int i = 1; i <= n; i++) {
            s = s + ((i * (i + 1))/2);
        }
        
        System.out.println(s);
        
    }
    
}
