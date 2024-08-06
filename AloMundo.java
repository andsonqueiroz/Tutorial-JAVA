import java.util.*;     /* AQUI É COMO SE FOSSE UMA BIBLIOTECA, PARA PEGAR CLASSES EXTERNAS QUANDO PRECISAR */
class AloMundo{
    String nome;        /* AQUI É COMO SE FOSSE O INT MAIN, VOCÊ DECLARA AS VARIÁVEIS, O NOME DA CLASS TEM QUE SER O MESMO NOME DO ARQUIVO .JAVA SALVO */
    int idade;

    public void aniversario(){      /* AQUI É UMA FUNÇÃO, O "PUBLIC" SIGNIFICA QUE PODE SER USADA EM QUALQUER CLASSE (QUALQUER INT MAIN) */
        idade = idade+1;
    }

    public int idadeEmMeses(){      /* AQUI É UMA FUNÇÃO DE RETORNO, QUANDO FOR CHAMADA NA FUNÇÃO PRINCIPAL, SÓ APARECERAR UM VALOR */
        return(idade*12);
    }
        public static void main(String[] args){     /* AQUI É COMO SE FOSSE A FUNÇÃO PRINCIPAL, QUE COMPILA, TODAS AS OUTRAS FUNÇÕES PUBLICAS TEM QUE FICAR DENTRO DESSA */
    
        AloMundo amigo = new AloMundo();        /* O INT MAIN COM AS VARIÁVEIS É COMO SE FOSSE UMA STRUCT, AQUI VOCê CRIA UMA "função" DA STRUCT */

        amigo.nome = "Andson";      /* AQUI VOCÊ DEFINE OS DADOS FIXOS DAS VARIÁVEIS DA NOVA FUNÇÃO amigo, DA CLASSE (struct) CRIADA */
        amigo.idade = 20;

        System.out.println (amigo.nome);        /* AQUI É O printf DO nome DE amigo */

        amigo.aniversario();        /* AQUI CHAMEI A FUNÇÃO PUBLICA QUE CRIEI, E ESSA FUNÇÃO PEGARÁ AS VARIÁVEIS DE amigo */

        System.out.println (amigo.idade);       /* OUTRO PRINTF DA VARIÁVEL idade DE amigo */

        AloMundo inimigo = new AloMundo();      /* AQUI CRIEI OUTRA "FUNÇÃO" COM AS MESMAS VARIÁVEIS DA CLASSE (struct) QUE CRIEI */

        inimigo.nome = "Geremundo";         /* AQUI PREENCHI AS VARIÁVEIS DA NOVA "FUNÇÃO" inimigo */
        inimigo.idade = 99;

        System.out.println ("o meu inimigo fictício é: " + inimigo.nome);      /* AQUI O PRINTF DO nome DE inimigo COM UM TEXTO, SEMPRE QUE FOR IMPRIMIR VARIAVEL COM TEXTO, PRECISA COLOCAR O TEXTO E FORA DAS ASPAS O "+ [variavel]"" */

        System.out.println (amigo.idadeEmMeses());      /* AQUI IMPRIMI O RETORNO DA FUNÇÃO, USANDO AS VARIÁVEIS DE amigo */

        System.out.println (new Date());        /* GRAÇAS A BIBLIOTECA IMPORTADA NO TOPO DO CÓDIGO, FOI POSSIVEL PUXAR UMA FUNÇÃO DIRETO DO SISTEMA, NO CASO A DATA. */
    }
}