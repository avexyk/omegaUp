
package arena1;

import java.util.Scanner;

public class potenciaN {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int c = 0;
        
        while (N != 1) {            
            N = N / 2;
            c++;
        }
        
        System.out.println(c);
        
    }
    
}
