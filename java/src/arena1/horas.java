
package arena1;

import java.util.Scanner;

public class horas {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        if (a > b) {
            System.out.println((24-a) + b);
        }else if (b > a) {
            System.out.println(b - a);
        }else if (a == b) {
            System.out.println(24);
        }
        
    }
    
}
