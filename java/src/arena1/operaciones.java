
package arena1;

import java.util.Scanner;

public class operaciones {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a, b;
        
        a = in.nextInt();
        b = in.nextInt();
        
        System.out.println((a+b) + " " + (a-b) + " " + (a/b) + " " + (a*b) + " " + (a%b));
        
    }
    
}
