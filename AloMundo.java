import java.util.*;     /* AQUI É COMO SE FOSSE UMA BIBLIOTECA, PARA PEGAR CLASSES EXTERNAS QUANDO PRECISAR */
import java.util.Scanner;   //AQUI É UMA CLASSE (BIBLIOTECA) OBRIGATÓRIA PARA FAZER O scanf
class AloMundo{
    String nome;        /* AQUI É A BASE DO CÓDIGO, VOCÊ PODE DECLARAR AS VARIÁVEIS EM UM TIPO DE STRUCT, O NOME DA CLASS TEM QUE SER O MESMO NOME DO ARQUIVO .JAVA SALVO */
    int idade;

    public void aniversario(){      /* AQUI É UMA FUNÇÃO, O "PUBLIC" SIGNIFICA QUE PODE SER USADA EM QUALQUER CLASSE (QUALQUER INT MAIN) */
        idade = idade+1;
    }

    public int idadeEmMeses(){      /* AQUI É UMA FUNÇÃO DE RETORNO, QUANDO FOR CHAMADA NA FUNÇÃO PRINCIPAL, SÓ APARECERAR UM VALOR */
        return(idade*12);
    }
        public static void main(String[] args){     /* AQUI É COMO SE FOSSE O int main, QUE COMPILA, TODAS AS OUTRAS FUNÇÕES PUBLICAS TEM QUE FICAR DENTRO DESSA */
                                                    // DENTRO DESSA public static VOCÊ DECLARA VARIÁVEIS QUE SÓ IRÁ UTILIZAR DENTRO DESSA FUNÇÃO PRINCIPAL.
        AloMundo amigo = new AloMundo();        /* O class COM AS VARIÁVEIS É COMO SE FOSSE UMA STRUCT, AQUI VOCê CRIA UM "OBJETO" DA CLASSE E DECLARA O NOME DELA */

        Scanner ler = new Scanner(System.in);   // AQUI ESTÁ DECLARANDO A FUNÇÃO DE scanf COM O NOME "ler"

        amigo.nome = "Andson";      /* AQUI VOCÊ DEFINE OS DADOS FIXOS DAS VARIÁVEIS DO NOVO OBJETO amigo, DA CLASSE (struct) CRIADA */
        amigo.idade = 20;           // PARA USAR AS VARIÁVEIS QUE CRIOU NA class, UTILIZA "nomeObjeto.nomeVariavel"

        String meuNome;           // PODE DECLARAR VARIÁVEIS DENTRO DA public static NORMALMENTE, IGUAL QUALQUER OUTRA LINGUAGEM. AQUI ESTÁ DECLARANDO VARIÁVEL STRING

        meuNome = ler.nextLine();   // A VARIÁVEL meuNome receberá um dado que será digitado no teclado (nextLine significa texto).

        System.out.println(meuNome);     // COMO A VARIÁVEL meuNome ESTÁ DECLARADA DENTRO DO public static, SEM OBJETO, DEVE USÁ-LA SEM O "nomeObjeto.Variável"

        System.out.println (amigo.nome);        /* AQUI É O printf DA VARIÁVEL nome DO OBJETO amigo, DA CLASSE AloMundo */

        amigo.aniversario();        /* AQUI CHAMEI A FUNÇÃO PUBLICA QUE CRIEI, E ESSA FUNÇÃO PEGARÁ AS VARIÁVEIS DE amigo */
                                    // PARA USAR A FUNÇÃO COM AS VARIÁVEIS DO OBJETO DESEJADO, PRECISA COLOCAR nomeObjeto.Função()

        System.out.println (amigo.idade);       /* OUTRO PRINTF DA VARIÁVEL idade DE amigo */

        AloMundo inimigo = new AloMundo();      /* AQUI CRIEI OUTRO OBJETO COM AS MESMAS VARIÁVEIS DA CLASSE (struct) QUE CRIEI */

        inimigo.nome = "Geremundo";         /* AQUI PREENCHI AS VARIÁVEIS DA NOVA "FUNÇÃO" inimigo */
        inimigo.idade = 99;

        System.out.println ("o meu inimigo fictício é: " + inimigo.nome);      /* AQUI O PRINTF DO nome DE inimigo COM UM TEXTO, SEMPRE QUE FOR IMPRIMIR VARIAVEL COM TEXTO, PRECISA COLOCAR O TEXTO E FORA DAS ASPAS O "+ [variavel]" */

        System.out.println (amigo.idadeEmMeses());      /* AQUI IMPRIMI O RETORNO DA FUNÇÃO, USANDO AS VARIÁVEIS DE amigo */

        System.out.println (new Date());        /* GRAÇAS A BIBLIOTECA IMPORTADA NO TOPO DO CÓDIGO, FOI POSSIVEL PUXAR UMA FUNÇÃO DIRETO DO SISTEMA, NO CASO A DATA. */
    }
}