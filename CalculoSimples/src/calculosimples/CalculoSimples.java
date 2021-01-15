
package calculosimples;

import java.util.Scanner;

public class CalculoSimples {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("");
        int codPeca1 = teclado.nextInt();
        System.out.print("");
        int qtdPeca1 = teclado.nextInt();
        System.out.print("");
        float valorUnit1 = teclado.nextFloat();
        
        System.out.print("");
        int codPeca2 = teclado.nextInt();
        System.out.print("");
        int qtdPeca2 = teclado.nextInt();
        System.out.print("");
        float valorUnit2 = teclado.nextFloat();

        float ttlPagar = ((qtdPeca1 * valorUnit1) + (qtdPeca2 * valorUnit2));
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ttlPagar);
    }
    
}
