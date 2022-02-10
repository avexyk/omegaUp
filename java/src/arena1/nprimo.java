
package arena1;

import java.util.Scanner;

public class nprimo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        int num = 1, count = 0, i;
        
        while (count < N) {            
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count = count + 1;
            }
        }
        System.out.println(num);
        
    }
    
}
