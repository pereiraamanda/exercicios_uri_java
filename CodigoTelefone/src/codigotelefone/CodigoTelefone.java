
package codigotelefone;

import java.util.Scanner;

public class CodigoTelefone {

    public static void main(String[] args) {
        /*
        Leia um número inteiro que representa um código de DDD para discagem interurbana. 
        Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
        Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
        DDD nao cadastrado
        */
        
        Scanner teclado = new Scanner (System.in);
        int codTelefone = teclado.nextInt();
        switch(codTelefone){
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }
    }
    
}
