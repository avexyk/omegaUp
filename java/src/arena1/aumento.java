package arena1;

import java.util.Scanner;

public class aumento {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String n;
        
        n = in.nextLine();
        
        String [] OMI = n.split(" ");
        
        if (Integer.parseInt(OMI[0]) > Integer.parseInt(OMI[1])) {
            System.out.println(2 + " " + Math.abs(Integer.parseInt(OMI[0])-Integer.parseInt(OMI[1])));
        }else if (Integer.parseInt(OMI[0]) == Integer.parseInt(OMI[1])) {
            System.out.println("Nivel Optimo");
        }else {
            System.out.println(1 + " " + Math.abs(Integer.parseInt(OMI[1])-Integer.parseInt(OMI[0])));
        }
           
    }
    
}
