
package salariocombonus;

import java.util.Scanner;

public class SalarioComBonus {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("");
        String nome = teclado.nextLine();
        
        System.out.print("");
        double salFixo = teclado.nextDouble();
        
        System.out.print("");
        double ttlVendas = teclado.nextDouble();
        
        double ttlReceber = 0;
        
        ttlReceber = ((ttlVendas * 0.15) + salFixo);
        
        System.out.printf("TOTAL = R$ %.2f\n" , ttlReceber);
        
        
        
    }
    
}
