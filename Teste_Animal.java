package br.com.aula.herancas.zoo;

import javax.swing.JOptionPane;

public class Teste_Animal{

	public static  void main(String[] args) {
		//Animal A1 = new Animal();
		Mamiferos m = new Mamiferos();
		
		String nome = JOptionPane.showInputDialog("Digite o nome do Animal:");
		m.setNome(nome);
		float peso = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso do animal ? "));
		m.setPeso(peso);
		int numeroPatas = Integer.parseInt(JOptionPane.showInputDialog("Quantas Patas tem o animal ? "));
		m.setNumeroPatas(numeroPatas);
		String cor = JOptionPane.showInputDialog("Qual a cor do animal ? ");
		m.setCor(cor);
		String ambiente = JOptionPane.showInputDialog("Qual o ambiente do animal ? ");
		m.setAmbiente(ambiente);
		float velMedia = Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade média do animal ? "));
		m.setVelMedia(velMedia);
		String alimento = JOptionPane.showInputDialog("Qual o alimento do animal ? ");
		m.setAlimento(alimento);
		
		
		Peixe p = new Peixe();
		
		String nome1 = JOptionPane.showInputDialog("Digite o nome do Peixe:");
		p.setNome(nome1);
		float peso1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso do Peixe ? "));
		p.setPeso(peso1);
		int numeroPatas1 = Integer.parseInt(JOptionPane.showInputDialog("Quantas Patas tem o Peixe ? "));
		p.setNumeroPatas(numeroPatas);
		String cor1 = JOptionPane.showInputDialog("Qual a cor do Peixe ? ");
		p.setCor(cor1);
		String ambiente1 = JOptionPane.showInputDialog("Qual o ambiente do Peixe ? ");
		p.setAmbiente(ambiente1);
		float velMedia1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade média do Peixe ? "));
		p.setVelMedia(velMedia1);
		String caracteristica = JOptionPane.showInputDialog("Qual a caracteristica do Peixe ? ");
		p.setCaracteristica(caracteristica);
		
		
		Mamiferos m2 = new Mamiferos();
		
		String nome2 = JOptionPane.showInputDialog("Digite o nome do Animal:");
		m2.setNome(nome2);
		float peso2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso do animal ? "));
		m2.setPeso(peso2);
		int numeroPatas2 = Integer.parseInt(JOptionPane.showInputDialog("Quantas Patas tem o animal ? "));
		m2.setNumeroPatas(numeroPatas2);
		String cor2 = JOptionPane.showInputDialog("Qual a cor do animal ? ");
		m2.setCor(cor2);
		String ambiente2 = JOptionPane.showInputDialog("Qual o ambiente do animal ? ");
		m2.setAmbiente(ambiente2);
		float velMedia2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade média do animal ? "));
		m2.setVelMedia(velMedia2);
		String alimento2 = JOptionPane.showInputDialog("Qual o alimento do animal ? ");
		m2.setAlimento(alimento2);
		
		
		
		
		m.dadosMamiferos();
		System.out.println("--------------------------------------------------");
		p.dadosPeixe();
		System.out.println("--------------------------------------------------");
		m2.dadosMamiferos();
			
	}
}
