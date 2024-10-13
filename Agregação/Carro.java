package Agregação;

public class Carro {
	private String modelo;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	private Motor motor;			// atributo do tipo CLASSE MOTOR, para fazer agregação
	
	public Motor getMotor() {
		return motor;			// get para a classe Carro poder acessar as funções da classe Motor
	}

	public void setMotor(Motor motor) {
		this.motor = motor;				
	}

	public Carro() {
		this.modelo = "carro qualquer";
		this.velocidadeMaxima = 120;		// Construtor padrão sem parâmetros, para inserir os dados padrão.
		this.velocidadeAtual = 0;
	}
	
	public Carro(String modelo, Motor motor) {		// Construtor passando o parâmetro objeto Motor (objeto que for criado no Main)
		this.modelo = modelo;
		this.motor = motor;			// irá setar o objeto Motor com seus dados no atributo da classe Carro, passando por parâmetro, que for criado na classe Main no objeto Carro
	}							// assim, o objeto Carro terá um atributo contendo todas as informações do objeto Motor, tendo uma agregação.
	
	public String getModelo() {
		return modelo;				//getters para retornar as informações dos atributos privados de Carro
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;			// Setters para inserir dado no atributo privado "modelo" de Carro
	}
	
	public void ligarCarro() {
		System.out.println("O carro está ligado");		// método de ligar carro
	}
	
	public void desligarCarro() {
		System.out.println("O carro está desligado");		// método de desligar carro
	}
	
	public void acelera(int veloc) {
		if(this.velocidadeAtual + veloc <= this.velocidadeMaxima) {
			this.velocidadeAtual += veloc;
			System.out.println("acelerando, velocidade atual: " + this.velocidadeAtual);
		}
		else {
			this.velocidadeAtual = this.velocidadeMaxima;
			
			System.out.println("Velocidade maxima atingida! \n" + "velocidade atual: " + this.velocidadeAtual);
		}
	}
	
	public void reduzir(int veloc) {
		if((this.velocidadeAtual - veloc) > 0) {
			this.velocidadeAtual -= veloc;
			System.out.println("reduzindo, velocidade atual: " + this.velocidadeAtual);
		}
		else {
			pararCarro();
		}
	}
	
	public void pararCarro() {
		this.velocidadeAtual = 0;
		System.out.println("O carro parou, velocidade atual: " + this.velocidadeAtual);
	}
}
