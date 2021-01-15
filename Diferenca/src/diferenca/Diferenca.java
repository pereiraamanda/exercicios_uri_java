/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diferenca;

import java.util.Scanner;

public class Diferenca {

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("");
        int a = teclado.nextInt();
        System.out.print("");
        int b = teclado.nextInt();
        System.out.print("");
        int c = teclado.nextInt();
        System.out.print("");
        int d = teclado.nextInt();
        
        int diferenca;
        
        diferenca = ((a * b) - (c * d));
        
        System.out.println("DIFERENCA = " + diferenca);
        
        
        
    }
    
}
