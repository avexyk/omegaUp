
package arena1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class cinco {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int c;
        float d = 0;
        
        for (int i = 0; i < 5; i++) {
            c = in.nextInt();
            d = d +c;
        }
        
        System.out.println(df.format(d/5));
        
    }
    
}
