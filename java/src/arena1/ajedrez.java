
package arena1;

import java.util.Scanner;

public class ajedrez {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String cuadro = in.nextLine();
        String[] ubicacion = cuadro.split(" ");
        int n = Integer.parseInt(ubicacion[1]);
                
        switch(ubicacion[0]) {
            case "a":
                if (n%2==0) {
                    System.out.println("BLANCO");
                } else {
                    System.out.println("NEGRO");
                }
                break;
            case "b":
                if (n%2==0) {
                    System.out.println("NEGRO");
                } else {
                    System.out.println("BLANCO");
                }
                break;
            case "c":
                if (n%2==0) {
                    System.out.println("BLANCO");
                } else {
                    System.out.println("NEGRO");
                }
                break;
            case "d":
                if (n%2==0) {
                    System.out.println("NEGRO");
                } else {
                    System.out.println("BLANCO");
                }
                break;
            case "e":
                if (n%2==0) {
                    System.out.println("BLANCO");
                } else {
                    System.out.println("NEGRO");
                }
                break;
            case "f":
                if (n%2==0) {
                    System.out.println("NEGRO");
                } else {
                    System.out.println("BLANCO");
                }
                break;
            case "g":
                if (n%2==0) {
                    System.out.println("BLANCO");
                } else {
                    System.out.println("NEGRO");
                }
                break;
            case "h":
                if (n%2==0) {
                    System.out.println("NEGRO");
                } else {
                    System.out.println("BLANCO");
                }
                break;
                
        }
        
    }
    
}
