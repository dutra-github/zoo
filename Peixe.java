package br.com.aula.herancas.zoo;

public class Peixe extends Animal {
	private String caracteristica;

	public void Peixe(String nome, float peso, int numeroPatas, String cor, String ambiente, float velMedia,
		String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void dadosPeixe() {
		super.dadosAnimal();
		System.out.println("Característica: "+ caracteristica);
	}
	

}
