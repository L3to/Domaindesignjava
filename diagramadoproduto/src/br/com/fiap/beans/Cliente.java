package br.com.fiap.beans;

public class Cliente {

	// tipo de dados, atributo
	private String nome;
	private int idade;
	private double altura;
	private endereco endereco;

	// metodo set (entrada)

	public endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// metodo get (exibir/retornar)
	public String getNome() {
		return nome;
	}

	public double getAltura() {
		return altura;
	}

	public int getIdade() {
		return idade;
	}

}