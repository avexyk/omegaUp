
package arena2;

import java.util.Scanner;

public class paresimpares {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int num, par=0, impar=0;
        
        for (int i = 0; i < N; i++) {
            num = in.nextInt();
            if (num%2==0) {
                par++;
            }else {
                impar++;
            }
        }
        
        System.out.println(par + " " + impar);
        
    }
    
}
