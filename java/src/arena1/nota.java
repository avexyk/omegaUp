
package arena1;

import java.util.Scanner;

public class nota {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int nota = in.nextInt();
        
        switch (nota) {
            case 10:
                System.out.println("Excelente");
                break;
            case 9:
                System.out.println("Muy bien");
                break;
            case 8:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Regular");
                break;
            case 6:
                System.out.println("Suficiente");
                break;
            default:
                System.out.println("No acredita");
                break;
        }
        
    }
    
}
