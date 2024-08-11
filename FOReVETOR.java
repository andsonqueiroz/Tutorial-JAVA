// Calcular a média de 5 notas, utilizando um vetor.

import java.util.Scanner;
public class FOReVETOR{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in); // DECLARAÇÃO DO SCANNER COM NOME "ler"
        float[] notas = new float[5];       // DECLARANDO VETOR COM TAMANHO 5.
                                        // PARA DECLARAR UM VETOR, PRECISA SEGUIR A SINTAXE "TIPO[] nome = new TIPO[tamanho]"
        float media = 0;

        for(int i=0; i<5; i++){     // PARA FAZER UM for, SEGUE A MESMA LÓGICA DAS OUTRAS LINGUAGENS.
            System.out.println("Digite a nota " + (i+1));
            notas[i] = ler.nextFloat();
        }
        for(int i = 0; i<5; i++){
            media = media + notas[i];
        }

        media = media / 5;

        System.out.println("A média das notas é: " + media);
    }
}
