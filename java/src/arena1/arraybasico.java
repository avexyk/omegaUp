//100%

package arena1;

import java.util.Scanner;

public class arraybasico {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int[] array = new int[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }
        
        for (int i : array) {
            System.out.println(i);
        }
        
    }
    
}
