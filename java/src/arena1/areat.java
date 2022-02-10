
package arena1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class areat {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double a, b;
        
        a = in.nextDouble();
        b = in.nextDouble();
        
        System.out.println(df.format((a*b)/2));
        
    }
    
}
