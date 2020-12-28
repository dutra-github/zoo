package br.com.aula.herancas.zoo;

public class Mamiferos extends Animal {

	private String alimento;
	
	public void Mamiferos(String nome, float peso, int numeroPatas, String cor, String ambiente, float velMedia, String alimento) {
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void dadosMamiferos() {
		
		super.dadosAnimal();
		
		System.out.println("Alimento: " + alimento);
	}

}
