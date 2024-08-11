/* Algoritmo que possui 2 vetores, um com 10 nomes de produtos e outro com o valor de cada um.
O usuário digitará o nome do produto e o algoritmo imprimirá o nome e o preço. */

import java.util.Scanner;
public class BuscarProduto {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);       // DECLARAÇÃO DA FUNÇÃO scanner DADOS COM O NOME ler
        
        
        String busca = "";      // DECLARAÇÃO DE UMA STRING. A STRING PRECISA SER INICIADA COM UM TEXTO VAZIO "".

        String[] produto = {
            "ameixa", "cerveja", "violao", "sapato",
            "refrigerante", "bombom", "sabonete",       // CRIAÇÃO DO VETOR COM 10 POSIÇÕES. NÃO PRECISA INSERIR O TAMANHO DO VETOR, SOMENTE OS DADOS
            "camiseta", "calca", "bone"
        };

        Double[] preço = {
            5.99, 12.00, 599.00, 269.00,
            13.00, 12.00, 1.99, 159.00,      // O VETOR AUTOMATICAMENTE DEFINIRÁ O TAMANHO COM BASE NA QUANTIDADE DE DADOS INSERIDOS NA CRIAÇÃO.
            79.99, 99.00
        };

        while(!busca.equalsIgnoreCase("sair")){        // UTILIZAÇÃO O REPETIDOR while. O .equals FAZ COMPARAÇÃO DE STRINGS. ENQUANTO A VARIÁVEL busca NÃO FOR DIGITADO "sair", REPETIRÁ.
                                                // PARA FAZER A COMPARAÇÃO DE STRINGS, SEGUE A SINTAXE: variável.equalsIgnoreCase("nomeParaComparar")

            System.out.println("Digite o nome do produto: ");
            busca = ler.nextLine();                 // ARMAZENARÁ O NOME DO PRODUTO PARA BUSCA NA VARIÁVEL busca.

            boolean encontrado = false;         // DECLARAÇÃO DE UMA VARIÁVEL BOOLEANA encontrado, DEFINIDA COMO false PORQUE O PRODUTO NÃO FOI ENCONTRADO AINDA.

            for(int i = 0; i<10; i++){
                if(produto[i].equalsIgnoreCase(busca)){         // COMPARAÇÃO, SE O NOME DO PRODUTO ARMAZENADO NO VETOR DA POSIÇÃO i FOR IGUAL O NOME ARMAZENADO NA VARIÁVEL busca, EXECUTAR O IF

                    System.out.println("Produto encontrado: ");
                    System.out.println(produto[i]);
                    System.out.println("Valor R$" + preço[i]);

                    encontrado = true;          // QUANDO O PRODUTO ENCONTRADO, A VARIÁVEL BOOLEANA encontrado PASSARÁ A SER true.
                }
            }
            if(!encontrado){        // O "!" SIGNIFICA negação, OU SEJA, REVERTERÁ O VALOR DA VARIÁVEL. SE econtrado É false, SERÁ true DENTRO DO IF, ASSIM EXECUTANDO (O if EXECUTA TUDO QUE É true)

                System.out.println("produto não encontrado!");
            }
            System.out.println("Digite 'sair' para sair");
        }
    }
}
