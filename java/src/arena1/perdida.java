
package arena1;

import java.util.Scanner;

public class perdida {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        String[] promedio = num.split(" ");
        
        System.out.println(2 * Integer.parseInt(promedio[1]) - Integer.parseInt(promedio[0]));

    }
    
}
