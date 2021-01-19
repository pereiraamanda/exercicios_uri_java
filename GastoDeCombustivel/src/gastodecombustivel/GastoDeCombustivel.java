/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastodecombustivel;

import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class GastoDeCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float kmLitro = 12f;
        System.out.print("");
        int tpViagem = teclado.nextInt();
        System.out.print("");
        int vlMedia = teclado.nextInt();
        float qtdLitroNecessario = (((tpViagem * vlMedia) / kmLitro));
        System.out.printf("%.3f\n",qtdLitroNecessario);
        
         
        
     
    }
    
}
