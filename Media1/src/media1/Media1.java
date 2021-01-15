
package media1;

import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("");
        double a = teclado.nextDouble();
        System.out.print("");
        double b = teclado.nextDouble();
        double media = (3.5 * a + 7.5 * b) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f\n", media);
        
    
    }
    
}
