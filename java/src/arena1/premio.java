
package arena1;

import java.util.Scanner;

public class premio {
    
    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if      (i >= a.length) c[k] = b[j++];
            else if (j >= b.length) c[k] = a[i++];
            else if (a[i] <= b[j])  c[k] = a[i++];
            else                    c[k] = b[j++];
        }
        return c;
    }

    public static int[] mergesort(int[] input) {
        int N = input.length;
        if (N <= 1) return input;
        int[] a = new int[N/2];
        int[] b = new int[N - N/2];
        for (int i = 0; i < a.length; i++)
            a[i] = input[i];
        for (int i = 0; i < b.length; i++)
            b[i] = input[i + N/2];
        return merge(mergesort(a), mergesort(b));
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a;
        
        a = in.nextInt();
        int[] cal = new int[a];
        
        for (int i = 0; i < a; i++) {
            cal[i] = in.nextInt();
        }
        
        cal = mergesort(cal);
        
        for (int i = (a-1); i >= 0; i--) {
            System.out.print(cal[i] + " ");
        }
 
    }
    
}
