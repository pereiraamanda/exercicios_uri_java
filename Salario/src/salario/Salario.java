
package salario;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("");
        int numFuncionario = teclado.nextInt();
               
        System.out.print("");
        int hrsTrabalhadas = teclado.nextInt();
        

        System.out.print("");
        float valorHora = teclado.nextFloat();
        
        float salario = hrsTrabalhadas * valorHora;
        
        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n" , salario);
        
    }
    
}
