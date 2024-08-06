import java.util.Scanner;

class calculadora{
    int escolha;
    int numero1;
    int numero2;
    int resultado;
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);       /* AQUI COLOQUEI A FUNÇÃO DE "SCANNER" COMO APELIDO "ler" */
        calculadora calculo = new calculadora();
        
        System.out.println("Olá, Soma digite 1 \n Divisão digite 2 \n Subtração digite 3 \n");
        calculo.escolha = ler.nextInt();        /* AQUI COLOQUEI PARA A VARIÁVEL escolha RECEBER UM DADO INTEIRO (nextInt) */

        if(calculo.escolha == 1){
            System.out.println("Digite o primeiro numero: ");
            calculo.numero1 = ler.nextInt();
            System.out.println("Digite o segundo numero: ");
            calculo.numero2 = ler.nextInt();
            calculo.resultado = calculo.numero1 + calculo.numero2;
            System.out.println("o resultado da soma é: " + calculo.resultado);
        }
        else if(calculo.escolha == 2){
            System.out.println("Digite o primeiro numero: ");
            calculo.numero1 = ler.nextInt();
            System.out.println("Digite o segundo numero: ");
            calculo.numero2 = ler.nextInt();
            calculo.resultado = calculo.numero1 / calculo.numero2;
            System.out.println("o resultado da divisão é: " + calculo.resultado);
        }
        else{
            System.out.println("Digite o primeiro numero: ");
            calculo.numero1 = ler.nextInt();
            System.out.println("Digite o segundo numero: ");
            calculo.numero2 = ler.nextInt();
            calculo.resultado = calculo.numero1 - calculo.numero2;
            System.out.println("o resultado da subtração é: " + calculo.resultado);
        }
        
    }

    
}