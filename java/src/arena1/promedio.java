
package arena1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class promedio {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int a;
        double c = 0, n;
        
        a = in.nextInt();
        
        for (int i = 0; i < a; i++) {
            n = in.nextInt();
            c = c + n;
        }
        
        System.out.println(df.format(c/a));
        
    }
    
}
