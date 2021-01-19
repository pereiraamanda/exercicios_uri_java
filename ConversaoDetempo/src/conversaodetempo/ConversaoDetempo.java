/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaodetempo;

import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class ConversaoDetempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int tpSegundos = teclado.nextInt();
        int tpHora = tpSegundos / 3600;
        int tpMinutos = ((tpSegundos % 3600) / 60);
        tpSegundos = tpSegundos % 60;
               
        System.out.println(tpHora + ":" + tpMinutos +":" + tpSegundos);
    }
    
}
