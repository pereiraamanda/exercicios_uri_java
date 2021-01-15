
package media2;

import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("");
        double a = teclado.nextDouble();
        System.out.print("");
        double b = teclado.nextDouble();
        System.out.print("");
        double c = teclado.nextDouble();
        double media = (2 * a + 3 * b + 5 * c) / (2+3+5);
        System.out.printf("MEDIA = %.1f\n", media);
    }
    
}
