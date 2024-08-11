// Dois VETORES, um de times e outro com frases aleatórias. Irá sortear o nome de um time e uma frase aleatórios e imprimir na tela.

import java.util.Random;        // IMPORTAR CLASSE Random (PARA FAZER SORTEIO)
public class VETORcomDADOSeRANDOM {
    public static void main(String[] args){
        int timealeatorio;      // VARIÁVEL PARA ARMAZENAR O NÚMERO DA POSIÇÃO DO VETOR
        int msgaleatoria;       // OUTRA VARIÁVEL PARA ARMAZENAR O NÚMERO DA POSIÇÃO DO OUTRO VETOR

        Random aleatorio = new Random();        // DECLARANDO A FUNÇÃO DE Random COM O NOME "aleatorio"
        String[] times = {
            "Flamengo", "Corinthians", "Palmeiras", "Santos", 
            "Grêmio", "Vasco", "São Paulo", "Internacional",        // AQUI ESTÁ CRIANDO UM VETOR DE STRINGS COM DADOS JÁ INSERIDOS.
            "Cruzeiro", "Atlético-MG"                      // PARA FAZER VETOR COM DADOS INSERIDOS, SEGUE A SINTAXE: TIPO[] nome = { dados, dados, dados};
        };
        String[] msgs = {
            "VAI TIMÃO!!", 
            "Que jogada péssima...", 
            "Ótima performance!", 
            "Continue assim!",                              // AQUI ESTÁ CRIANDO UM VETOR DE STRINGS COM DADOS JÁ INSERIDOS.
            "Faça substituição!",           //// PARA FAZER VETOR COM DADOS INSERIDOS, SEGUE A SINTAXE: TIPO[] nome = { dados, dados, dados};
            "Jogo equilibrado.", 
            "Parabéns pela vitória!", 
            "Boa sorte na próxima.", 
            "Grande jogo!", 
            "Que vitória emocionante!"
        };

        timealeatorio = aleatorio.nextInt(10);          // AQUI ESTÁ ARMAZENANDO NA VARIÁVEL UM NÚMERO SORTIDO DE 0 A 10
        msgaleatoria = aleatorio.nextInt(10);               // PARA CHAMAR A FUNÇÃO DE Random, É BEM SEMELHANTE A DE Scanner
                                                        // SEGUE A SINTAXE: NOME.nextInt(ATÉ QUANTO)

        System.out.println(times[timealeatorio]);       // AQUI ESTÁ IMPRIMINDO O VETOR COM A POSIÇÃO DO NÚMERO SORTEADO, QUE ESTÁ ARMAZENADO NA VARIÁVEL timealeatorio
        System.out.println(msgs[msgaleatoria]);      // AQUI ESTÁ IMPRIMINDO O VETOR COM A POSIÇÃO DO NÚMERO SORTEADO, QUE ESTÁ ARMAZENADO NA VARIÁVEL msgaleatoria

    }
}