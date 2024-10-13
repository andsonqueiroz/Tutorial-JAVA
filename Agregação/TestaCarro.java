package Agregação;

public class TestaCarro {

	public static void main(String[] args) {
		Motor meuMotor = new Motor("Fiat", 1.4, "Flex");		// criando objeto Motor com dados inseridos (no construtor)
		Carro meuCarro = new Carro("Siena", meuMotor);			// criando objeto Carro, com os dados de Motor inseridos
		
		System.out.println(meuCarro.getModelo());		// mostrando o modelo de Carro
		
		System.out.println(meuCarro.getMotor().getFabricante());	// mostrando o fabricante do Motor do Carro (objeto Motor
												// que foi passado como parâmetro na hora de criar o objeto Carro)

	}

}
