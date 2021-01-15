
package produtosimples;

import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("");
        int a = teclado.nextInt();
        System.out.print("");
        int b = teclado.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
    }
    
}
