package Agregação;

public class Motor {
	private String fabricante;
	private double cilindrada;
	private String combustivel;
	
	public Motor(String fabricante, double cilindrada, String combustivel) {
		this.fabricante = fabricante;		// o THIS.atributo se refere ao atributo DESTA ATUAL CLASSE
		this.cilindrada = cilindrada;			// CONSTRUTOR, que passa os parâmetros para preencher os atributos privados
		this.combustivel = combustivel;			// Ele sempre existe, padrão invisivel e sem parametros
	}		
	
	public String getFabricante() {
		return fabricante;				// como os atributos são privados, precisa dos getters para retornar os dados, e utilizar sem acessar diretamente
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;				// atributos privados não tem como setar informações diretamente, assim precisa dos setters
	}
	
	public double getCilindrada() {
		return cilindrada;
	}
	
	public void setCilidrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
}
