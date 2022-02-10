
package algoritmos;

import java.util.*;

public class Prime3 {
    static int n = 0;
    static int m;
    static int[] array;
    static int[] cotenedor;

    public static boolean isPrime(int num) {
        boolean prime = true;
        int limit = (int) Math.sqrt(num);

        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }

    public static void Calc() {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        array = new int[1000000];
        cotenedor = new int[1000000];

        for (int i = 2; i < array.length; i++) {
            array[i] = i;
        }

        ArrayList<Integer> list = new ArrayList<Integer>(array.length);

        for (int c : array) {
            list.add(c);
        }

        list.remove(0);
        list.remove(0);

        Collections.sort(list);

        for (int k : list) {
            if (isPrime(k)) {
                cotenedor[n] = k;
                n = n + 1;
            }
        }
        System.out.println(cotenedor[m]);
        
    }

    public static void main(String[] args) {
        Calc();
    }
}
