// 100%
package arena1;

import java.util.Scanner;

public class ab {
    
    public static void main(String[] args) {
        
        Scanner in =  new Scanner(System.in);
        int N, b = 0;
        String n;
        
        N = in.nextInt();        
        
        for (int i = 0; i < N; i++) {
            n = in.next();
            String [] decimal = n.split("\\.");
            b = b + Integer.parseInt(decimal[1]);
        }
        
        System.out.println(b);
        
    }
    
}
