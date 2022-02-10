
package arena1;

import java.util.Scanner;

public class parimpar {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n;
        
        n = in.nextInt();
        
        if(n%2==0) {
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }
        
    }
    
}
