
package arena1;

import java.util.Scanner;

public class alicia {
    
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
    
    public static int binarysearch(int a[], int input){
        int N = a.length;
        int center,low=0,high=N-1;
        while(low<=high) {
            center=(high+low)/2;
            if(a[center]==input) return center;
            else if(input < a [center]) {
                high=center-1;
            }else {
                low=center+1;
            }
        }return -1;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N, M;
        
        N = in.nextInt();
        int[] chapas = new int[N];
        for (int i = 0; i < chapas.length; i++) {
            chapas[i] = in.nextInt();
        }
        chapas = mergesort(chapas);
        M = in.nextInt();
        int[] llaves = new int[M];
        for (int i = 0; i < llaves.length; i++) {
            llaves[i] = in.nextInt();
        }
        llaves = mergesort(llaves);
        
        for (int i = 0; i < llaves.length; i++) {
            System.out.print((binarysearch(chapas, llaves[i])+1) + " ");
        }
        
    }
    
}
