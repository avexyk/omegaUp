
package arena1;

import java.util.Scanner;

public class parejasuma {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int suma, num = 0;
        
        for (int i = 0; i < N; i++) {
            suma = 0;
            for (int j = 0; j < 2; j++) {
                num = in.nextInt();
                suma = suma + num;
            }
            System.out.println(suma);
        }
        
    }
    
}
