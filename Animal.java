package br.com.aula.herancas.zoo;

public class Animal {
	private String nome;
	private float peso;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private float velMedia;
	public Animal() {
		this.nome = nome;
		this.peso = peso;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velMedia = velMedia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public float getVelMedia() {
		return velMedia;
	}
	public void setVelMedia(float velMedia) {
		this.velMedia = velMedia;
	}
	
	public void dadosAnimal() {
		System.out.println("Nome do Animal: "+ nome);
		System.out.println("Peso: "+ peso);
		System.out.println("Num.de Patas: "+numeroPatas);
		System.out.println("Cor:"+cor);
		System.out.println("Ambiente:"+ambiente);
		System.out.println("Vel.Média: "+ velMedia);
	}
}
