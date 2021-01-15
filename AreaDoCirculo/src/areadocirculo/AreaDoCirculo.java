
package areadocirculo;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {
        double n = 3.14159;
        Scanner teclado = new Scanner (System.in);
        System.out.print("");
        double r = teclado.nextDouble();
        double a = ( n * Math.pow(r, 2));
        System.out.printf("A=%.4f\n", a);
        

        
        
        
    }
    
}
