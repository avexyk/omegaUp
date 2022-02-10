
package arena1;

import java.util.Scanner;

public class orfanato {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int P = in.nextInt();
        int N = in.nextInt();
        int bolsa, dulces = 0;
        
        for (int i = 0; i < N; i++) {
            bolsa = in.nextInt();
            dulces = dulces + bolsa;
        }
        
        System.out.println((dulces / P) + " " + (dulces % P));
        
    }
    
}
