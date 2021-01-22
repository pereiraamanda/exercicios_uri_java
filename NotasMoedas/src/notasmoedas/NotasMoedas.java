
package notasmoedas;

import java.util.Scanner;

public class NotasMoedas {

    public static void main(String[] args) {
        /**
         * URI 1021 Notas e Moedas
         * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
         * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
         * As notas consideradas são de 100, 50, 20, 10, 5, 2.
         * As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
         * A seguir mostre a relação de notas necessárias.
         */
        Scanner teclado = new Scanner (System.in);
        
        double valorEntrada = teclado.nextDouble();
        int valor = 0;
        
        System.out.println("NOTAS:");
        
        valor = (int) valorEntrada / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", valor);
        valorEntrada = valorEntrada % 100;
        
        valor = (int) valorEntrada / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", valor);
        valorEntrada = valorEntrada % 50;
        
        valor = (int) valorEntrada / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", valor);
        valorEntrada = valorEntrada % 20;
        
        valor = (int) valorEntrada / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", valor);
        valorEntrada = valorEntrada % 10;
        
        valor = (int) valorEntrada / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", valor);
        valorEntrada = valorEntrada % 5;
        
        valor = (int) valorEntrada / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", valor);
        valorEntrada = valorEntrada % 2;
        
        valorEntrada = valorEntrada * 100;
        
        System.out.println("MOEDAS:");
        
        valor = (int) valorEntrada / 100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", valor);
        valorEntrada = valorEntrada % 100;
        
        valor = (int) valorEntrada / 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", valor);
        valorEntrada = valorEntrada % 50;
        
        valor = (int) valorEntrada / 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", valor);
        valorEntrada = valorEntrada % 25;
        
        valor = (int) valorEntrada / 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", valor);
        valorEntrada = valorEntrada % 10;
        
        valor = (int) valorEntrada / 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", valor);
        valorEntrada = valorEntrada % 5;
        
        valor = (int) valorEntrada / 1;
        System.out.printf("%d moeda(s) de R$ 0.01\n", valor);
       
        
        
    }
    
    
}

