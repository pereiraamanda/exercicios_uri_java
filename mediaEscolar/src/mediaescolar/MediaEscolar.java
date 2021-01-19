
package mediaescolar;

import java.util.Scanner;

public class MediaEscolar {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
    
        System.out.print("");
        float nota1 = teclado.nextFloat();
        System.out.print("");
        float nota2 = teclado.nextFloat();
        System.out.print("");
        float nota3 = teclado.nextFloat();
        System.out.print("");
        float nota4 = teclado.nextFloat();
        
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;
        int peso4 = 1;
        
        float mediaAluno = ((nota1 * peso1 + nota2 * peso2 + nota3 * peso3 + nota4 * peso4) / (peso1 + peso2 + peso3 + peso4));
        
        float notaExame = 0f;
        
        float mediaFinal = 0f;
        
        System.out.printf("Media: %.1f\n", mediaAluno);
        
        if(mediaAluno >= 7){
            System.out.println("Aluno aprovado.");     
        }
        else if(mediaAluno < 5){
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.print("Aluno em exame.");
            System.out.println("");
            notaExame = teclado.nextFloat();
            System.out.println("Nota do exame: " + notaExame);
            mediaFinal = (notaExame + mediaAluno) / 2;
        }

        if(notaExame >= 5){
            System.out.println("Aluno aprovado.");
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
     
    }
    
}
