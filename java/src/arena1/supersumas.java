
package arena1;

import java.util.Scanner;

public class supersumas {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int suma = 0, num;
        int N = in.nextInt();
        
        for (int i = 0; i < N; i++) {
            num = in.nextInt();
            suma = suma + num;
        }
        
        System.out.println(suma);
        
    }
    
}
