
package arena1;

import java.util.Scanner;

public class nombres {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String p;
        String[] nombre = new String[n];
        String[] apellido = new String[n-1];
        
        for (int i = 0; i < n; i++) {
            p = in.next();
            String[] division = p.split(" ");
            nombre[i] = division[0];
        }
        
        for (String j : nombre) {
            System.out.println(j);
        }
        
    }
    
}
