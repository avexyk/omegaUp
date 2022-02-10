
package arena1;

import java.util.Scanner;

public class cancha {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String cancha1 = in.nextLine();
        String cancha2 = in.nextLine();
        String [] c1 = cancha1.split(" ");
        String [] c2 = cancha2.split(" ");
        int xa1, xa2, xa3, xa4, xb1, xb2, xb3, xb4;
        
        xa1 = Integer.parseInt(c1[0]);
        xa2 = Integer.parseInt(c1[1]);
        xa3 = Integer.parseInt(c1[2]);
        xa4 = Integer.parseInt(c1[3]);

        xb1 = Integer.parseInt(c2[0]);
        xb2 = Integer.parseInt(c2[1]);
        xb3 = Integer.parseInt(c2[2]);
        xb4 = Integer.parseInt(c2[3]);
        
        if (xa3 > xb1 && xa4 > xb2 ) {
            System.out.println(((xa1 - xa3)*(xa2 - xa4)) + ((xb1 - xb3)*(xb2 - xb4)) - ((xa3 - xb1)*(xa4 - xb2)));
        } else {
            System.out.println(((xa1 - xa3)*(xa2 - xa4)) + ((xb1 - xb3)*(xb2 - xb4)));
        }
                
    }
    
}
