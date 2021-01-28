
package multiplos;

import java.util.Scanner;


public class Multiplos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int A;
        int B;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
       
        if((A % B == 0) || (B % A == 0)){
            System.out.println("Sao multiplos");
        }
        
        else {
            System.out.println("Nao sao multiplos");
        }
        
       
         
    }
    
}
