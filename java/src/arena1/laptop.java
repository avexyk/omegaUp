
package arena1;

import java.util.Scanner;

public class laptop {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] lap = new int[N];
        int index = 0;
        
        for (int i = 0; i < lap.length; i++) {
            lap[i] = in.nextInt();
        }
        
        int max = lap[0];
        
        for (int i = 0; i < lap.length; i++) {
            if (lap[i] > max && lap[i] <= 1000) {
                max = lap[i];
                index = i + 1;
            }
        }
        
        System.out.println(index + " " + max);
        
    }
    
}
