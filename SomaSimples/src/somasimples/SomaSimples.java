
package somasimples;

import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("");
        int a = teclado.nextInt();
        System.out.print("");
        int b = teclado.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
        
    }
    
}
