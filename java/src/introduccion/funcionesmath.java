
package Introduccion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class funcionesmath {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int N, M, a, b;
        double c;
        long d, e;
        
        N = in.nextInt();
        
        Object [] s = new Object[N];
        
        for (int i = 0; i < N; i++) {
            M = in.nextInt();
            switch(M) {
                case 1:
                    a = in.nextInt();
                    s[i] = Math.abs(a);
                    break;
                case 2:
                    a = in.nextInt();
                    b = in.nextInt();
                    s[i] = Math.max(a, b);
                    break;
                case 3:
                    a = in.nextInt();
                    b = in.nextInt();
                    s[i] = Math.min(a, b);
                    break;
                case 4:
                    c = in.nextInt();
                    s[i] = df.format(Math.sqrt(c));
                    break;
                case 5:
                    d = in.nextInt();
                    e = in.nextInt();
                    s[i] = (long)Math.pow(d, e);
                    break;
            }
                  
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println(s[i]);
        }
        
    }
    
}
