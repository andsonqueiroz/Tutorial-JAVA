/* Algoritmo que possui dois ArrayList, um com nomes de produtos e outro com o valor de cada um.
    O usuário poderá acrescentar novos produtos nos array. */

import java.util.Scanner;
import java.util.ArrayList;     // classe (biblioteca) do arrayList
public class ArrayList {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);       // DECLARAÇÃO DA FUNÇÃO scanner DADOS COM O NOME ler

        ArrayList<String> produtos = new ArrayList<String>();      // sintaxe do ArrayList:
                                                               // ArrayList<TIPO> nomeDoVetor = new ArrayList<TIPO>();
        
        produtos.add("ameixa");     //Para adicionar um vetor novo, precisa colocar o "nomeVetor.add(dado)". Posição 0 do vetor
        produtos.add("cerveja");       // posição 1 do vetor
        produtos.add("violão");     // posição 2 do vetor

        ArrayList<Double> valor = new ArrayList<Double>();

        valor.add(5.99);
        valor.add(12.00);
        valor.add(599.00);

        int menu = 0;
        String novoProduto = "";
        double novoValor;
        int remover;

        while(menu != 4){
            System.out.println("\nOlá. Digite uma das opções do menú:");
            System.out.println(" 1. Adicionar produto \n 2. Remover produto \n 3.Imprimir lista de produtos \n 4. Finalizar programa.");
            menu = ler.nextInt();
            ler.nextLine();     // desbugar o leitor, sempre que usar o nextLine depois do nextInt, ele buga.

            switch(menu){
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    novoProduto = ler.nextLine();       // coletar o nome e armazenar em "novoProduto".

                    produtos.add(novoProduto);      // aqui criou um novo vetor no arraylist "produtos" e armazenou o dado de "novoProduto".

                    System.out.println("Digite o valor do produto: ");
                    novoValor = ler.nextDouble();    // coletar o valor e armazenar em "novoValor".

                    valor.add(novoValor);        // criar um novo vetor no arraylist "valor" e armazenar o valor da variável "valor".

                    System.out.println("Produto adicionado.");
                    break;
               
                case 2:
                    System.out.println("Digite o numero do produto que deseja remover: ");

                    for(int i = 0; i<produtos.size(); i++){

                        System.out.println("produto " + i + ": " + produtos.get(i));     /* Para pegar a posição de um vetor do arraylist, é neccessário
                                                                                      colocar "nomeVetor.get(posição)" ao invés de "nomeVetor[posição]" */
                    }

                    remover = ler.nextInt();        // Variável utilizada para armazenar o número (posição do vetor que irá remover)
                       
                    produtos.remove(remover);        /* Para remover um vetor do arraylist, ao invés de utilizar ".get()", utiliza .remove()
                                                        nomeVetor.remove(posição)  */
                        
                       
                    System.out.println("Produto removido!");

                    break;

                case 3:
                    for(int i=0; i<produtos.size(); i++){
                        System.out.println(produtos.get(i) + " - R$" + valor.get(i));
                    }
                    break;
            }
        }
       
    }
}
