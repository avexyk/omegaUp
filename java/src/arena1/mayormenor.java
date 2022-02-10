
package arena1;

import java.util.Scanner;

public class mayormenor {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int A;
        
        A = in.nextInt();
        
        if (A >= 18) {
            System.out.println("Es Mayor");
        }else {
            System.out.println("Es Menor");
        }
        
    }
    
}
